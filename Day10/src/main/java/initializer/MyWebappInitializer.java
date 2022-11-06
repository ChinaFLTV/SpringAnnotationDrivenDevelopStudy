package initializer;

import conf.AppConf;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author LiGuanda
 * @date 2022/11/6 上午 8:33:35
 * @description no description right now...
 * @filename MyWebappInitializer.java
 */


public class MyWebappInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        System.out.println("Load AppConf ...");
        return new Class[]{AppConf.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
