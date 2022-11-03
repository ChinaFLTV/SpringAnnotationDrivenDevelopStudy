package conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author LiGuanda
 * @date 2022/11/3 上午 10:36:11
 * @description no description right now...
 * @filename SpringConfig.java
 */

@Configuration
@ComponentScan(value = {"bean", "conf", "service", "listener"})
public class SpringConfig {


}
