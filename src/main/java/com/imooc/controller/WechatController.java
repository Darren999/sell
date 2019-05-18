package com.imooc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wechat")
@Slf4j
public class WechatController{
    @GetMapping("/authorize")
    public void authorize(@RequestParam("returnUrl") String returnUrl) {
        log.info("authorize,returnUrl:"+returnUrl);
    }
}
