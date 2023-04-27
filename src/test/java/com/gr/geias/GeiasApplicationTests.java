package com.gr.geias;

import com.gr.geias.entity.Specialty;
import com.gr.geias.mapper.OrganizationNumMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class GeiasApplicationTests {
    @Before
    public void init() {
        System.out.println("开始测试-----------------");
    }

    @After
    public void after() {
        System.out.println("测试结束-----------------");
    }

    @Autowired
    OrganizationNumMapper mapper;

    @Test
    public void test01() {
        for (int i = 0; i < 10; i++) {
            int x = (int) (Math.random() * 7 + 33);
            //Math.random()随机生成区间[0,1)的浮点数，
            // 乘以100，区间[0-100),取[1-100],则加1，得[1,101)。
            // 由此得公式：math.random()*max+min,[min,max)
            System.out.println(x);
        }
    }
}
