package service;

import config.SpringConfig;
import dao.WifeDAO;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author LiGuanda
 * @date AM 9:37:32
 * @description This is a description of Day3Service
 * @since version-1.0
 */


public class Day3Service {


    @Test
    public void test() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {

            System.out.println(name);

        }
        //Wife bean = (Wife) context.getBean("wife");
        //System.out.println(bean);
        //ConfigurableEnvironment environment = context.getEnvironment();
        //String husband = environment.getProperty("wife.husband");
        //System.out.println(husband);
        System.out.println("-----------------------------");
        WifeDAO wifeDAO = (WifeDAO) context.getBean("wifeDAO");
        System.out.println(wifeDAO);

    }


}
