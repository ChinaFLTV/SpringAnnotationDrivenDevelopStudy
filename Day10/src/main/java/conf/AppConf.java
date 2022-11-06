package conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.*;

/**
*
* @author LiGuanda
* @date 2022/11/6 上午 8:34:56
* @description no description right now...
* @filename AppConf.java
*
*/


@SuppressWarnings("deprecation")
@ComponentScan(value = {"conf","controller","servlet"})
@EnableWebMvc
public class AppConf extends WebMvcConfigurerAdapter {


/*    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {

        registry.jsp("/WEB-INF/templates",".jsp");

    }


    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

        configurer.enable();

    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //registry.addInterceptor(new MyHandlerInterceptor().addPathPatterns("/**"));

    }*/


}
