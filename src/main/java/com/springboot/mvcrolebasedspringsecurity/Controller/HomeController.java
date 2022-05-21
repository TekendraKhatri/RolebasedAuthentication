package com.springboot.mvcrolebasedspringsecurity.Controller;

import com.springboot.mvcrolebasedspringsecurity.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.mvcrolebasedspringsecurity.entities.Message;
import com.springboot.mvcrolebasedspringsecurity.Repository.MessageRepository;

@Controller
public class HomeController {
    @Autowired
    private MessageRepository messageRepository;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("msgs", messageRepository.findAll());
        return "userhome";
    }

    @PostMapping("/messages")
    public String saveMessage(Message message) {
        messageRepository.save(message);
        return "redirect:/home";
    }

    @PostMapping("/post")
    public User createL

}