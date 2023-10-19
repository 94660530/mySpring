package day3.mySpringframework.beans.factory.support;

import day3.mySpringframework.beans.BeansException;
import day3.mySpringframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author xys
 * @Classname InstantiationStrategy
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/10/19 22:15
 */
public interface InstantiationStrategy {

    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args)
            throws BeansException;
}
