package service;

import conf.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author LiGuanda
 * @date 2022/11/3 上午 10:39:55
 * @description no description right now...
 * @filename Day8Test.java
 */


public class Day8Test {


    @Test
    public void test() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        context.publishEvent(new ApplicationEvent("IU loves Dage") {
            @Override
            public Object getSource() {
                return super.getSource();
            }
        });
        context.close();

    }


}
