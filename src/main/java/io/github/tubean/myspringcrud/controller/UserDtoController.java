package io.github.tubean.myspringcrud.controller;

import io.github.tubean.myspringcrud.dto.UserDto;
import io.github.tubean.myspringcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Base64;
import java.util.List;

@Controller
public class UserDtoController {
    @Autowired
    private UserService userService;

    @RequestMapping("/userDto")
    public String index(Model model) {
        List<UserDto> users = userService.getAllUserDto();
        System.out.println(users.toString());
        for (UserDto userDto: users
             ) {
            System.out.println(userDto.toString());

        }
        return "userDto";
    }
}
