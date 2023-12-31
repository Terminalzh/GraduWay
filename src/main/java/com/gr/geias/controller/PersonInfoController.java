package com.gr.geias.controller;


import com.gr.geias.entity.PersonInfo;
import com.gr.geias.entity.Specialty;
import com.gr.geias.enums.EnableStatusEnums;
import com.gr.geias.service.PersonInfoService;
import com.gr.geias.service.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
@RestController
@RequestMapping("/personinfo")
public class PersonInfoController {
    @Autowired
    PersonInfoService personInfoService;
    @Autowired
    SpecialtyService specialtyService;

    /**
     * 登录 权限 无权限者即可接入
     */
    @RequestMapping(value = "/login")
    public Map<String, Object> login(@RequestParam(value = "username", required = false) String username,
                                     @RequestParam(value = "password", required = false) String password,
                                     HttpServletRequest request,
                                     HttpServletResponse response
    ) throws IOException {
        PersonInfo login = null;
        if (request.getAttribute("personId") != null) {
            Integer personId = Integer.parseInt((String) request.getAttribute("personId"));
            login = personInfoService.getPersonById(personId);
        }
        Map<String, Object> map = new HashMap<>(3);
        if (login == null) {
            if (username == null || username.equals("") || password == null || password.equals("")) {
                map.put("success", false);
                map.put("errMsg", "用户名或者密码为空");
            }
            login = personInfoService.login(username, password);
        }
        if (login != null) {
            request.getSession().setAttribute("person", login);
            List<Specialty> specialtyList = specialtyService.getSpecialty(login.getCollegeId());
            List<PersonInfo> person0 = personInfoService.getPersonByCollegeId(login.getCollegeId());
            request.getSession().setAttribute("person0List", person0);
            request.getSession().setAttribute("specialtyList", specialtyList);
            Cookie cookie = new Cookie("personId", login.getPersonId().toString());
            cookie.setMaxAge(60 * 60 * 24 * 365);
            cookie.setPath("/");
            response.addCookie(cookie);
            map.put("success", true);
            if (request.getAttribute("isForward") != null) {
                response.sendRedirect("/page/index");
            }
        } else {
            map.put("success", false);
            map.put("errMsg", "用户名或者密码错误");
        }
        return map;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public void logout(HttpServletRequest request, HttpServletResponse response) {
        request.getSession().removeAttribute("person");
        request.getSession().removeAttribute("person0List");
        request.getSession().removeAttribute("specialtyList");
        Cookie cookie = new Cookie("personId", null);
        cookie.setMaxAge(1);
        cookie.setPath("/");
        response.addCookie(cookie);
        try {
            response.sendRedirect("/html/login.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/getuser")
    public Map<String, Object> getUser(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>(2);
        PersonInfo person = (PersonInfo) request.getSession().getAttribute("person");
        map.put("success", true);
        map.put("person", person);
        return map;
    }

    @RequestMapping(value = "/updateuser")
    public Map<String, Object> updateUser(HttpServletRequest request,
                                          @RequestParam("personname") String personname,
                                          @RequestParam("username") String username,
                                          @RequestParam("password") String password,
                                          @RequestParam("originPassword") String originPassword
    ) {
        Map<String, Object> map = new HashMap<>(2);
        PersonInfo person = (PersonInfo) request.getSession().getAttribute("person");
        if (person.getPassword().equals(originPassword)) {
            person.setUsername(username);
            person.setPassword(password);
            person.setPersonName(personname);
            Boolean aBoolean = personInfoService.updatePerson(person);
            if (aBoolean) {
                map.put("success", true);
                return map;
            } else {
                map.put("success", false);
                map.put("errMsg", "修改出错");
                return map;
            }
        } else {
            map.put("success", false);
            map.put("errMsg", "原始密码错误");
            return map;
        }
    }

}
