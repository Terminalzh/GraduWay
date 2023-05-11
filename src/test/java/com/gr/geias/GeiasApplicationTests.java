package com.gr.geias;

import com.gr.geias.entity.EmploymentInformation;
import com.gr.geias.mapper.EmploymentInformationMapper;
import com.gr.geias.mapper.OrganizationNumMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Date;
import java.util.List;


//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@RunWith(SpringRunner.class)
@SpringBootTest
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
    EmploymentInformationMapper mapper;

    @Test
    public void test01() {
        List<EmploymentInformation> informations = mapper.queryAll();
        int count = 0;
        for (EmploymentInformation information : informations) {
            String time = Long.toString(new Date().getTime());
            int num = Integer.parseInt(time.substring(time.length() - 8));
            count += mapper.updateStudentNum(num, information.getInformationId());
        }
        System.out.println(count);
    }
}
