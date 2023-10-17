package day2.mySpringframework.beans.factory;

import day2.mySpringframework.beans.BeansException;

/**
 * @author xys
 * @Classname BeanFactory
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/10/17 1:06
 */
public interface BeanFactory {
    public Object getBean(String name) throws BeansException;
}
