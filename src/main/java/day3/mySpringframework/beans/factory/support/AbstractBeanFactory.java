package day3.mySpringframework.beans.factory.support;

import day3.mySpringframework.beans.BeansException;
import day3.mySpringframework.beans.factory.BeanFactory;
import day3.mySpringframework.beans.factory.config.BeanDefinition;

/**
 * @author xys
 * @Classname AbstractBeanFactorry
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/10/18 0:08
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name, Object... args) throws BeansException{
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition, args);
    }

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
