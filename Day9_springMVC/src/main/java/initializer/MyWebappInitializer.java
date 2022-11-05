package initializer;

import conf.RootConfig;
import conf.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author LiGuanda
 * @date 2022/11/5 下午 3:42:38
 * @description no description right now...
 * @filename MyWebappInitializer.java
 */


public class MyWebappInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {

        System.out.println("load rootConfig ...");
        return new Class[]{RootConfig.class};

    }


    @Override
    protected Class<?>[] getServletConfigClasses() {

        System.out.println("load webConfig ...");
        return new Class[]{WebConfig.class};

    }


    @Override
    protected String[] getServletMappings() {

        return new String[]{"/"};

    }


}
