package io.github.tubean.myspringcrud.controller;

import io.github.tubean.myspringcrud.entity.BoardinghouseEntity;
import io.github.tubean.myspringcrud.entity.User;
import io.github.tubean.myspringcrud.service.BoardingHouseServive;
import io.github.tubean.myspringcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class BoardingHouseController {
    @Autowired
    private BoardingHouseServive boardingHouseServive;

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public String editUser(@RequestParam("id") int id, Model model) {
//        Optional<BoardinghouseEntity> boardinghouseEntity = boardingHouseServive.findUserById(id);
//        boardinghouseEntity.ifPresent(BoardinghouseEntity -> model.addAttribute("BoardinghouseEntity", BoardinghouseEntity));
        return "detail_boardingHouse";
    }
}
