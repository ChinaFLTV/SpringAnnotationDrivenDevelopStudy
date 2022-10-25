package factory;

import bean.Wife;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author LiGuanda
 * @date PM 3:46:34
 * @description This is a description of MyFactoryBean
 * @since version-1.0
 */


public class MyFactoryBean implements FactoryBean<Wife> {


    public Wife getObject() {

        return new Wife("JuJingyi", 27, "dage");

    }


    public Class<?> getObjectType() {

        return Wife.class;

    }


    public boolean isSingleton() {

        return false;

    }


}
