package dubbo.springboot.demo.member.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import dubbo.springboot.demo.member.service.ConsumerService;
import dubbo.springboot.demo.member.service.IMember;
import org.springframework.stereotype.Service;

/**
 * Created by wangjian on 2018/6/10.
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Reference
    private IMember member;


    @Override
    public String sayHi(String msg) {
        return this.member.sayHi(msg);
    }
}
