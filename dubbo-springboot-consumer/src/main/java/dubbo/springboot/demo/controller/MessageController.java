package dubbo.springboot.demo.controller;

import dubbo.springboot.demo.member.service.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by wangjian on 2018/6/10.
 */
@RestController
public class MessageController {

    @Resource
    private ConsumerService consumerService;

    @GetMapping("/sendMsg")
    public String sendMsgController(String msg){
        String result = consumerService.sayHi(msg);
        return result;
    }
}
