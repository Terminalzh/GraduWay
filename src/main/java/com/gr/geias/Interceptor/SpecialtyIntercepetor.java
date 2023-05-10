package com.gr.geias.Interceptor;

import com.gr.geias.entity.PersonInfo;
import com.gr.geias.entity.Specialty;
import com.gr.geias.enums.EnableStatusEnums;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
@Component
public class SpecialtyIntercepetor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Boolean collegeIsOK =false;
        Boolean specialtyIsOK =false;
        PersonInfo person = (PersonInfo) request.getSession().getAttribute("person");
        if (person.getEnableStatus() == EnableStatusEnums.schoolmaster.getState()) {
            return true;
        }
        if (person.getEnableStatus() == EnableStatusEnums.PREXY.getState()) {
            String collegeStr = request.getParameter("collegeId");
            if (collegeStr != null) {
                int collegeId = Integer.parseInt(collegeStr);
                if (collegeId == person.getCollegeId()) {
                    collegeIsOK = true;
                } else {
                    collegeIsOK = false;
                }
            }else {
                collegeIsOK =true;
            }
            String specialtyStr = request.getParameter("specialtyId");
            if (specialtyStr == null) {
                specialtyIsOK =  false;
            }
            int specialtyId = Integer.parseInt(specialtyStr);
            List<Specialty> specialtyList = (List<Specialty>) request.getSession().getAttribute("specialtyList");
            if (specialtyList == null) {
                specialtyIsOK =  false;
            }
            for (int i = 0; i < specialtyList.size(); i++) {
                if (specialtyList.get(i).getSpecialtyId().equals(specialtyId)) {
                    specialtyIsOK =  true;
                }
            }

        }
        if (specialtyIsOK && collegeIsOK){
            return true;
        }else {
            return false;
        }

    }

}
