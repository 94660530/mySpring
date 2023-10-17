package day2.mySpringframework.beans;

/**
 * @author xys
 * @Classname BeansException
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/10/17 1:08
 */
public class BeansException extends Exception {
    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message,  Throwable cause) {
        super(message, cause);
    }
}
