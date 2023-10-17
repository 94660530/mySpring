package day2.mySpringframework.beans.factory.config;

/**
 * @author xys
 * @Classname SingletonBeanRegistry
 * @Description 注册和获取单例对象的接口
 * @Version 1.0.0
 * @Date 2023/10/17 0:59
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);
}
