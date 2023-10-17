package day2.mySpringframework;

import day2.mySpringframework.beans.BeansException;
import day2.mySpringframework.beans.factory.config.BeanDefinition;
import day2.Service.UserService;
import day2.mySpringframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author xys
 * @Classname ApiTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/10/17 23:49
 */
public class ApiTest {
    @Test
    public void testBeanFactory() throws BeansException {
        // 1. 初始化BeanFactory接口
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注册bean对象
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3. 获取Bean对象
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4. 再次获取和调用Bean对象
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }
}
