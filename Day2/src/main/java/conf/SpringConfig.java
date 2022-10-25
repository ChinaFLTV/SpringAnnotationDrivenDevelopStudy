package conf;

import bean.Game;
import bean.Pig;
import bean.Semester;
import factory.MyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author LiGuanda
 * @date PM 3:12:22
 * @description This is a description of SpringConfig
 * @since version-1.0
 */


@Configuration
@ComponentScan(value = {"bean", "processor"})
@Import({MyFactoryBean.class, Game.class, Semester.class})
public class SpringConfig {


    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Pig pig() {

        return new Pig();

    }


}
