package day2.mySpringframework.beans.factory.support;

import day2.mySpringframework.beans.BeansException;
import day2.mySpringframework.beans.factory.config.BeanDefinition;

/**
 * @author xys
 * @Classname AbstractAutowireCapableBeanFactory
 * @Description 实现创建对象具体功能的抽象类
 * @Version 1.0.0
 * @Date 2023/10/17 23:17
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        registerSingleton(beanName, bean);
        return bean;
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
