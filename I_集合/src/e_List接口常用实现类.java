/**
 *  一、Collection接口 的子接口List概述
 *
 * 1、鉴于Java中数组用来存储数据的局限性，我们通常使用List替代数组
 * 2、List集合类中元素有序、且可重复，集合中的每个元素都有其对应的顺序索引。
 * 3、List容器中的元素都对应一个整数型的序号记载其在容器中的位置，可以根据序号存取容器中的元素。
 * 4、JDKAPI中List接口的实现类常用的有：ArrayList、LinkedList和Vector。
 *
 *
 *          List接口：元素有序、可重复的集合    --> “动态”数组
 *          实现类
 *              ① ArrayList
 *                  作为List接口的主要实现类，线程不安全的，效率高。
 *                  底层使用Object[] elementDate存储。
 *
 *              ② LinkedList
 *                  对于频繁的插入、删除操作，使用此类效率比ArrayList效率高。
 *                  底层使用双向链表存储
 *
 *              ③ Vector
 *                  作为List接口的古老实现类，线程安全的，效率低。
 *                  底层使用Object[] elementDate存储。
 *
 */
public class e_List接口常用实现类 {
}
