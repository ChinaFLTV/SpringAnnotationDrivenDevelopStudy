package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author LiGuanda
 * @date AM 9:37:00
 * @description This is a description of SpringConfig
 * @since version-1.0
 */


@Configuration
@ComponentScan(value = {"bean", "dao", "config"})
@PropertySource(value = {"classpath:wife.properties"})
public class SpringConfig {


}
