package com.codeqm.json;

import com.codeqm.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @since: 2025/6/8 17:08
 * @author: qingmu
 * @description:
 */
@Controller
@RequestMapping("/json")
@ResponseBody
public class JsonController {
    @GetMapping("/user")
    public User getUser() {
        User user = new User();
        user.setName("Zhang San");
        user.setAge(18);
        System.out.println("JsonController.getUser: " + user);
        return user;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        User user1 = new User();
        user1.setName("Zhang San");
        user1.setAge(18);

        User user2 = new User();
        user2.setName("Li Si");
        user2.setAge(20);

        List<User> users = List.of(user1, user2);
        System.out.println("JsonController.getUsers: " + users);
        return users;
    }
}
