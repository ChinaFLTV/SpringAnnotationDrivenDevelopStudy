package servlet;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Set;

/**
 * @author LiGuanda
 * @date 2022/11/5 下午 2:39:26
 * @description no description right now...
 * @filename Heihei.java
 */

//@HandlesTypes(value = {Wife.class})
public class Heihei implements ServletContainerInitializer {


    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {

        System.out.println("heiheihei");
        for (Class clazz : set) {

            System.out.println(clazz);

        }

    }


}
