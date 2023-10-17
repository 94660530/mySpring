package day3.mySpringframework.beans.factory.support;

import day3.mySpringframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xys
 * @Classname DefaultSingletonBeanRegistry
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/10/17 1:01
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    public Map<String, Object> singletonObjects = new HashMap<>();
    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    @Override
    public void registerSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
