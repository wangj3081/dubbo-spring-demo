package dubbo.springboot.demo.member.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import dubbo.springboot.demo.member.service.IMember;

/**
 * Created by wangjian on 2018/6/10.
 */
@Service
public class Memberimpl implements IMember {

    @Override
    public String sayHi(String name) {
        return "Echo:"+name;
    }
}
