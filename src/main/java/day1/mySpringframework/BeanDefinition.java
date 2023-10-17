package day1.mySpringframework;

/**
 * @Classname BeanDefinition
 * @Description bean对象定义
 * @Version 1.0.0
 * @Date 2023/10/16 23:17
 * @author xys
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}
