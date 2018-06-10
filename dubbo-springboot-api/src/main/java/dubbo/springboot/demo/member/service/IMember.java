package dubbo.springboot.demo.member.service;

/**
 * 提供生产者与消费者使用的接口
 * Created by wangjian on 2018/5/28.
 */
public interface IMember {

    /**
     *
     * @param name
     * @return
     */
    public String sayHi(String name);
}
