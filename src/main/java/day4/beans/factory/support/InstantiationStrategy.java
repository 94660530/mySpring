package day4.beans.factory.support;

import day4.beans.BeansException;
import day4.beans.factory.config.BeanDefinition;

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
