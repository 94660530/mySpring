package day4.Dao;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xys
 * @Classname UserDao
 * @Description TODO
 * @Version 1.0.0
 * @Date 2023/10/19 23:56
 */
public class UserDao {
    private static Map<String, String> hashMap =new HashMap<>();
    static {
        hashMap.put("10001", "我");
        hashMap.put("10002", "你");
        hashMap.put("10003", "他");
    }

    public String queryUserName(String id) {
        return hashMap.get(id);
    }
}
