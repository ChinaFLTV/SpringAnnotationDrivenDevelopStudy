package controller;

import conf.DeferredResultQueue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.Objects;
import java.util.concurrent.Callable;

import static conf.DeferredResultQueue.deferredResult;

/**
 * @author LiGuanda
 * @date 2022/11/6 上午 8:55:37
 * @description no description right now...
 * @filename Day10Controller.java
 */


@Controller
public class Day10Controller {


    @ResponseBody
    @RequestMapping("/xixi")
    public Callable<String> xixi() {

        Callable<String> callable = new Callable<String>() {


            @Override
            public String call() throws Exception {

                return "IU loves Dage";

            }


        };


        return callable;

    }


    @ResponseBody
    @RequestMapping("hehe")
    public DeferredResult<String> hehe() {

        DeferredResult<String> deferredResult = new DeferredResult<>(10000L, "JuJingyi loves Dage");
        DeferredResultQueue.deferredResult = deferredResult;
        return deferredResult;

    }


    @ResponseBody
    @RequestMapping("add")
    public String add() {

        deferredResult.setResult("Iu also likes Dage");
        return "ADD";

    }


}
