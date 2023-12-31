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
public class ClassGradeInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        PersonInfo person = (PersonInfo) request.getSession().getAttribute("person");
        if (person.getEnableStatus() == EnableStatusEnums.schoolmaster.getState()) {
            return true;
        } else {
            String specialtyStr = request.getParameter("specialtyId");
            if (specialtyStr==null){
                return false;
            }
            int specialtyId = Integer.parseInt(specialtyStr);
            String collegeStr = request.getParameter("collegeId");
            List<Specialty> specialties = (List<Specialty>) request.getSession().getAttribute("specialtyList");
            for (Specialty specialty : specialties) {
                if (specialty.getSpecialtyId() == specialtyId) {
                    if (collegeStr != null) {
                        int collegeId = Integer.parseInt(collegeStr);
                        return person.getCollegeId() == collegeId;
                    }
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
