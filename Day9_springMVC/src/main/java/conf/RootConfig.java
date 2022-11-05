package conf;

import org.springframework.context.annotation.ComponentScan;

/**
 * @author LiGuanda
 * @date 2022/11/5 下午 3:48:21
 * @description no description right now...
 * @filename RootConfig.java
 */

@ComponentScan(value = {"conf", "initializer", "service"})
public class RootConfig {
}
