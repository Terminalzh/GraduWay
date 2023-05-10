package com.gr.geias.Interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginPageInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("personId")) {
                request.setAttribute("personId", cookie.getValue());
                request.setAttribute("isForward", new Object());
                request.getRequestDispatcher("/personinfo/login").forward(request, response);
                return false;
            }
        }
        return true;
    }
}
