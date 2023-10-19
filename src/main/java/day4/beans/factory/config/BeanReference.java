package day4.beans.factory.config;

/**
 * @author xys
 * @Classname BeanReference
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/10/19 23:44
 */
public class BeanReference {
    String beanName;

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }
}
