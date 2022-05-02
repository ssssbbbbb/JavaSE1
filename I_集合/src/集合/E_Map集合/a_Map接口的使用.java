package 集合.E_Map集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *  一、Map接口的使用
 *      - 特点： 1. 用于存储任意键值对（Key —— Value）
 *              2. 键：无序、无下标、不允许重复（唯一）
 *              3. 值：无序、无下标、允许重复
 *
 *      - 方法：
 *          - V put(K key, V value) ：将对象存入到集合中，关联键值。key重复则覆盖原值。
 *          - Object get(Object key) ：根据键获取对应的值。
 *          - Set<K> ：返回所有Key
 *          - Collection<V> values() ：返回包含所有值的Collection集合。
 *          - Set<Map.Entry<K,V>> ：键值匹配的Set集合。
 *
 *
 */
public class a_Map接口的使用 {
    public static void main(String[] args) {
//      1、创建集合
        Map<String, String> map = new HashMap<>();
//      2、添加元素
        map.put("cn", "中国");
        map.put("uk", "英国");
        map.put("usa", "美国");
        map.put("SB", "日本");

        System.out.println("添加元素个数"+map.size());
        System.out.println(map);

//      3、删除
        map.remove("SB");
        System.out.println("删除之后元素有"+map.size());
        System.out.println(map);

//      4、遍历

        System.out.println("\n ①使用keySet();----------------");
        // keySet()    返回此映射中包含的键的Set集合视图，也就是返回 map 中的 key的Set集合（用Set集合储存“键”，然后返回）
        Set<String> keyset = map.keySet();
        for (String k : keyset){
            // get()   根据key，返回value
            System.out.println(k+"-----"+map.get(k));
        }



        System.out.println("\n ②使用entrySet();--------------");
        // entrySet();   返回此映射中包含的映射的Set视图，也就是返回键值对
        // 这里创建了 映射条目(键-值对) 集合，用以加深理解
        Set<Map.Entry<String, String>> entries = map.entrySet();    // 用Map集合调用 entrySet()方法 返回键值对，这里返回的
                                                                    // 键值对就是上面Map集合添加的集合元素，把这些返回的键值
                                                                    // 对作为值 赋值给 Set集合 entries。
        System.out.println("\n~~~~~~~~~~\n"+entries+"\n~~~~~~~~~~");

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+"-----------"+entry.getValue());
        }

//      5、判断
        System.out.println(map.containsKey("cn"));    // 如果该映射包含指定键的映射，则返回true
        System.out.println(map.containsValue("日本"));    // 如果该映射将一个或多个键映射到指定的值，则返回true
    }
}
