package com.gr.geias.config;

import com.gr.geias.Interceptor.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 前端控制器
 *
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
@Configuration
public class WebConfigurer implements WebMvcConfigurer {
    @Autowired
    LoginInterceptor loginInterceptor;
    @Autowired
    AdminInterceptor adminInterceptor;
    @Autowired
    SuperAdminInterceptor superAdminInterceptor;
    @Autowired
    SpecialtyIntercepetor specialtyIntercepetor;
    @Autowired
    ClassGradeInterceptor classGradeInterceptor;
    @Autowired
    Person0Interceptor person0Interceptor;
    @Autowired
    LoginPageInterceptor loginPageInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**")
                .excludePathPatterns("/page/login", "/page/error", "/page/getinfo", "/personinfo/logout")
                .excludePathPatterns("/personinfo/login", "/info/**", "/welcome/getcountbyarea","/employmentinformation/studentLogin")
                .excludePathPatterns("/html/**", "/fonts/**", "/images/**", "/js/**", "/lib/**", "/css/**");
        registry.addInterceptor(adminInterceptor).addPathPatterns("/**")
                .excludePathPatterns(
                        "/page/index",
                        "/page/echarts1",
                        "/page/memberlist",
                        "/page/echarts4",
                        "/page/echarts2",
                        "/page/error",
                        "/page/login",
                        "/page/getinfo",
                        "/page/welcome",
                        "/page/personedit",
                        "/page/toexcal",
                        "/page/classgradeedit")
                .excludePathPatterns(
                        "/init/getinit",
                        "/init/getleve",
                        "/employmentinformation/studentLogin",
                        "/employmentinformation/queryStudentByStudentNum",
                        "/employmentinformation/getemploymentinfo",
                        "/employmentinformation/getcountbyemploymentway",
                        "/employmentinformation/getcountbyunitkind",
                        "/employmentinformation/getcountbyarea",
                        "/personinfo/login",
                        "/personinfo/logout",
                        "/info/**",
                        "/welcome/**",
                        "/personinfo/getuser",
                        "/personinfo/updateuser",
                        "/employmentinformation/download",
                        "/employmentinformation/studentLogin",
                        "/employmentinformation/queryStudentByStudentNum",
                        "/organizationcontroller/getpersoninit",
                        "/organizationcontroller/getclassgrade",
                        "/organizationcontroller/updateclassgrade",
                        "/organizationcontroller/getspecialtyinit",
                        "/organizationcontroller/getcollegeinit")
                .excludePathPatterns("/html/**", "/fonts/**", "/images/**", "/js/**", "/lib/**", "/css/**");
        registry.addInterceptor(superAdminInterceptor)
                .addPathPatterns(
                        "/page/organizationlist",
                        "/page/collegeadd",
                        "/page/collegeedit",
                        "/page/person_1_list",
                        "/page/person1add",
                        "/page/person_1_edit")
                .addPathPatterns("/organizationcontroller/delcollege",
                        "/organizationcontroller/getcollegelist",
                        "/organizationcontroller/getcollegeadmin",
                        "/organizationcontroller/addcollege",
                        "/organizationcontroller/updatecollege",
                        "/organizationcontroller/delperson_1",
                        "/organizationcontroller/getperson_1",
                        "/organizationcontroller/updateperson_1",
                        "/organizationcontroller/addperson_1")
                .excludePathPatterns("/personinfo/logout", "/welcome/**");

        registry.addInterceptor(specialtyIntercepetor).addPathPatterns("/organizationcontroller/updatespecialty", "/organizationcontroller/delspecialty");
        registry.addInterceptor(classGradeInterceptor).addPathPatterns("/organizationcontroller/getclassgrade", "/organizationcontroller/addclassgrade", "/organizationcontroller/updateclassgrade", "/organizationcontroller/delclassgrade");
        registry.addInterceptor(person0Interceptor).addPathPatterns("/organizationcontroller/getpersonById", "/organizationcontroller/updateperson_0", "/organizationcontroller/delperson_0");
        registry.addInterceptor(loginPageInterceptor).addPathPatterns("/page/login");
    }
}
