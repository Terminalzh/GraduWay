package com.gr.geias.Interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {
    /**
     * 拦截登录，没用登录的一律返回登录页
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("personId")) {
                request.setAttribute("personId", cookie.getValue());
                request.getRequestDispatcher("/personinfo/login").forward(request, response);
                return true;
            }
        }
        Object person = request.getSession().getAttribute("person");
        if (person != null) {
            return true;
        } else {
            response.sendRedirect("/page/login");
            return false;
        }
    }
}
