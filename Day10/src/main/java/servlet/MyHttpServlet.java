package servlet;

import javax.servlet.AsyncContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author LiGuanda
 * @date 2022/11/6 上午 8:51:50
 * @description no description right now...
 * @filename MyHttpServlet.java
 */

@WebServlet(value = "/heihei", asyncSupported = true)
public class MyHttpServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {

        AsyncContext asyncContext = req.startAsync();
        asyncContext.start(() -> {


        });


    }


}
