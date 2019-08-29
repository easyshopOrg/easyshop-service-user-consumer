package com.cyc.easy.shop.service.user.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cyc.easy.shop.commons.domain.TbUser;
import com.cyc.easy.shop.service.user.api.TbUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("user")
public class TbUserController {
    @Reference
    private TbUserService tbUserService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list(Model model) {
        List<TbUser> tbUsers = tbUserService.selectAll();
        model.addAttribute("tbUsers", tbUsers);
        return "user/list";
    }
}
