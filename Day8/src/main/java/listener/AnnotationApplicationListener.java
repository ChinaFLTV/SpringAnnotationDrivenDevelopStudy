package listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author LiGuanda
 * @date 2022/11/3 上午 11:09:38
 * @description no description right now...
 * @filename AnnotationApplicationListener.java
 */


@Component
public class AnnotationApplicationListener {


    @EventListener(classes = {ApplicationEvent.class})
    public void heihei(ApplicationEvent event) {

        System.out.println("Received : " + event);

    }


}
