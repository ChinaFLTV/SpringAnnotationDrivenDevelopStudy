package processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author LiGuanda
 * @date PM 4:37:30
 * @description This is a description of MyProcessor
 * @since version-1.0
 */

@Component
public class MyProcessor implements BeanPostProcessor {


    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("before initializing-->" + beanName);
        return bean;

    }


    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("after initializing-->" + beanName);
        return bean;

    }


}
