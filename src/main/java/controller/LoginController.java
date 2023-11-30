package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author roc
 * @date 2023-11-29 16:21
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(String username, String password, Map map) {
        System.out.println("username = " + username);
        System.out.println("password = " + password);

        if (username.equals("admin") && password.equals("123")) {
            return "redirect:/showSuccess";
        }
        map.put("message", "用户名或密码错误");
        return "login";
    }
}
