package day4.beans.factory.support;

import day4.beans.factory.config.BeanDefinition;

/**
 * @author xys
 * @Classname BeanDefinitionRegistry
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/10/17 23:28
 */
public interface BeanDefinitionRegistry {
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
