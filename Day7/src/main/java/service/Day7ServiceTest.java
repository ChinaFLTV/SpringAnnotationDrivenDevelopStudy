package service;

import conf.SpringConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author LiGuanda
 * @date 2022/11/1 下午 8:03:12
 * @description no description right now...
 * @filename Day7Service.java
 */


public class Day7ServiceTest {


    @Test
    public void test() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        DepartmentService service = (DepartmentService) context.getBean("departmentService");
        service.insertDepartment(13, "astronaut");

    }


}
