package day4.mySpringframework;

import day4.Dao.UserDao;
import day4.Service.UserService;
import day4.beans.BeansException;
import day4.beans.PropertyValue;
import day4.beans.PropertyValues;
import day4.beans.factory.config.BeanDefinition;
import day4.beans.factory.config.BeanReference;
import day4.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author xys
 * @Classname ApiTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/10/20 0:00
 */
public class ApiTest {
    @Test
    public void testBeanFactory() throws BeansException {
        // 1. 初始化 BeanFactory 接口
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注册 UserDao
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        // 3. 使用 UserService 填充属性(id, userDao)
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("id", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        // 4. 使用 UserService 注册对象
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 5. 使用 UserService 获取 Bean 对象
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
