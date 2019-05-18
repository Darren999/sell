package com.imooc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {
    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code){
        log.info("auth code:"+code);

        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx9d7e3164ba107b93&secret=0f72dc70e086c9a2fce90c885fe55197&code="+code+"&grant_type=authorization_code";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url,String.class);

        log.info("response:"+response);
    }
}
