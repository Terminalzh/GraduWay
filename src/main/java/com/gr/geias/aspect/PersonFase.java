package com.gr.geias.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
@Aspect
@Component
public class PersonFase {
    private final String POINT_CUT = "execution(* com.gr.geias.mapper.PersonInfoMapper.deletePersonById(..))";

    @Pointcut(POINT_CUT)
    private void pointcut() {
    }

    @After(value = POINT_CUT)
    public void doAfterAdvice(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        Integer personId = (Integer) args[0];
        System.out.println("删除" + personId);
    }
}
