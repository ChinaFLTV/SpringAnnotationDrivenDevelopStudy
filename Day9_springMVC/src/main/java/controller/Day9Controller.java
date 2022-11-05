package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.CheckService;

/**
 * @author LiGuanda
 * @date 2022/11/5 下午 3:54:50
 * @description no description right now...
 * @filename Day9Controller.java
 */

@Controller
public class Day9Controller {


    @Autowired
    CheckService checkService;


    @ResponseBody
    @RequestMapping("/uuuu")
    public String iu() {

        System.out.println("Pass by iu method...");
        return checkService.checkIuHusband();

    }


}
