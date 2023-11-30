package controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author roc
 * @date 2023-11-29 15:00
 */
@Controller
public class HelloController{
    private String viewName;

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String name = request.getParameter("name");
        ModelAndView mav = new ModelAndView();
        mav.addObject("message", "Hello " + name);
        mav.setViewName(viewName);

        return mav;
    }


    @RequestMapping("/f1{viewName}")
    public String f1(@PathVariable("viewName") String viewName) {
        return viewName;
    }


    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }
}
