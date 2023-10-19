package day4.beans;

/**
 * @author xys
 * @Classname PropertyValue
 * @Description 类属性信息
 * @Version 1.0.0
 * @Date 2023/10/19 23:26
 */
public class PropertyValue {
    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
