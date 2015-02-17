package com.ydpp.web;

import com.ydpp.dao.UserRepository;
import com.ydpp.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author: john
 * @version: 1.0 2015-02-17 下午11:20
 */
@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/{id}")
    @ResponseBody
    public User get(@PathVariable("id") long id) {
        return userRepository.findOne(id);
    }

    @RequestMapping(params = "add")
    @ResponseBody
    public void post(User user) {
        userRepository.save(user);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Page<User> index(@RequestParam(value = "page", required = false, defaultValue = "0") int page,
                     @RequestParam(value = "size", required = false, defaultValue = "10") int size) {
        Page<User> users = userRepository.findAll(new PageRequest(page, size));
        return users;
    }

    @RequestMapping(params = "form")
    public String form() {
        return "users/form";
    }

    @RequestMapping("/list")
    public String list(@RequestParam(value = "page", required = false, defaultValue = "0") int page,
                       @RequestParam(value = "size", required = false, defaultValue = "10") int size, Model model) {
        Page<User> users = userRepository.findAll(new PageRequest(page, size));
        model.addAttribute("users", users);
        return "users/list";
    }



}
