package service;

import bean.Wife;
import org.springframework.stereotype.Service;

/**
 * @author LiGuanda
 * @date 2022/11/5 下午 3:55:13
 * @description no description right now...
 * @filename CheckService.java
 */

@Service
public class CheckService {


    public String checkIuHusband() {

        Wife wife = new Wife("IU", 30, "Dage");
        return wife.getHusband();

    }


}
