package day2.mySpringframework.beans.factory.config;

/**
 * @Classname BeanDefinition
 * @Description bean对象定义
 * @Version 1.0.0
 * @Date 2023/10/16 23:17
 * @author xys
 */
public class BeanDefinition {
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

}
