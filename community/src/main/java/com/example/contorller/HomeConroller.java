package com.example.contorller;

import com.example.entity.DisscussPost;
import com.example.entity.Page;
import com.example.entity.User;
import com.example.service.DisscussPostService;
import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeConroller {
    @Resource
    private DisscussPostService disscussPostService;
    @Resource
    private UserService userService;

    @GetMapping("/index")
    public String getindexpag(Model model, Page page) {
//        方法调用前，pringMVC会自动实例化model和page，并将page注入model，
//        所以在thymeleaf中可以直接访问page对象中的数据
        page.setRows(disscussPostService.selectDisscussPostsrows(0));
        page.setPath("/index");
        List<DisscussPost> list = disscussPostService.selectDisscussPosts(0, page.getOffset(), page.getLimit());
        List<Map<String, Object>> disscussposts = new ArrayList<>();
        if (list != null) {
            for (DisscussPost post : list) {
                Map<String, Object> maps = new HashMap<>();
                maps.put("post", post);
                User user = userService.finduserById(post.getUserId());
                maps.put("user", user);
                disscussposts.add(maps);
            }
        }
        model.addAttribute("disscussposts", disscussposts);
        return "/index";
    }
}
