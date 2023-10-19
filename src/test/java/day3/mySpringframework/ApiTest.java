package day3.mySpringframework;

import day3.Service.UserService;
import day3.mySpringframework.beans.BeansException;
import day3.mySpringframework.beans.factory.config.BeanDefinition;
import day3.mySpringframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author xys
 * @Classname ApiTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/10/19 23:04
 */
public class ApiTest {
    @Test
    public void testBeanFactory() throws BeansException {
        // 1. 初始化 beanFactory 接口
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注册 Bean 对象
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3. 获取 Bean 对象
        UserService userService = (UserService) beanFactory.getBean("userService", "xys");
        userService.queryUserInfo();
    }
}
