package listener;

import org.apache.commons.logging.Log;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * @author LiGuanda
 * @date 2022/11/3 上午 10:37:15
 * @description no description right now...
 * @filename ApplicationListenerPro.java
 */


@Component
public class ApplicationListenerPro implements ApplicationListener<ApplicationEvent> {


    @Override
    public void onApplicationEvent(ApplicationEvent event) {

        Logger.getGlobal().info("Received : " + event);

    }


}
