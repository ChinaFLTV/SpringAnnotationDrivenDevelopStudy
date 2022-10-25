package service;

import conf.SpringConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author LiGuanda
 * @date PM 3:13:50
 * @description This is a description of Day2Service
 * @since version-1.0
 */


public class Day2Service {


    @Test
    public void heihei() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {

            System.out.println(name);

        }

        Object bean = context.getBean("factory.MyFactoryBean");
        System.out.println(bean.getClass());
        Object bean1 = context.getBean("factory.MyFactoryBean");
        System.out.println(bean == bean1);
        Object bean2 = context.getBean("&factory.MyFactoryBean");
        System.out.println(bean2.getClass());
        context.close();


    }


}
