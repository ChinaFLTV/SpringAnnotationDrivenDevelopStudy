package bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author LiGuanda
 * @date PM 4:15:34
 * @description This is a description of Game
 * @since version-1.0
 */


public class Game implements InitializingBean, DisposableBean {

    public Game() {

        System.out.println("Entering the game...");

    }


    public void destroy() {

        System.out.println("Game is over");

    }

    public void afterPropertiesSet() {

        System.out.println("Game was initialized!");

    }


}

