package mySpringframework;

import Service.UserService;
import org.junit.Test;

/**
 * @author xys
 * @Classname ApiTest
 * @Description 测试类
 * @Version 1.0.0
 * @Date 2023/10/16 23:26
 */
public class ApiTest {

    @Test
    public void testBeanFactory() {
        // 1. 初始化beanFactory接口
        BeanFactory beanFactory = new BeanFactory();

        // 2. 注册bean对象
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3. 获取bean对象
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
