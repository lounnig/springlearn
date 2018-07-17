package cn.tokiz.web;

import cn.tokiz.domain.User;
import cn.tokiz.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value = {"/u","/user"})
public class UserController {

    @Autowired
    private Gson gson;

    @Autowired
    private UserService userService;

    @GetMapping("/{id:\\d}" )
    public String user( @PathVariable("id") Integer id){
        User user = userService.selectUser(id);
        return gson.toJson(user);
    }

    @GetMapping("/list")
    @ResponseBody
    public String list(HttpServletResponse response){
        response.setCharacterEncoding("UTF-8");
        String result =  gson.toJson(userService.allUser());
        System.out.println(result);
        return result;
    }


    @PostMapping("/add")
    public String insert(@RequestBody User user){
        boolean result = userService.insertUser(user);
        return gson.toJson(result?"注册成功":"注册失败");
    }

    @PostMapping("/del")
    public String del(@RequestParam("id") Integer id){
        boolean result = userService.deleteUser(id);
        return gson.toJson(result?"删除成功":"删除失败");
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable Integer id,@RequestBody User user){
        user.setId(id);
        boolean result = userService.updateUser(user);
        return gson.toJson(result?"更新成功":"更新失败");
    }

}
