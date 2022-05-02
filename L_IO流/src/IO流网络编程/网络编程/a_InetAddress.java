package IO流网络编程.网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *    一、IP
 *      1、IP： 唯一的标识Internet上的计算机(通信实体)
 *
 *      2、在Java中，用InetAddress 类标识IP地址
 *
 *      3、IP分类
 *          ① IP地址分类方式1：IPV4 和 IPV6。
 *          ② IP地址分类方式2：公网地址(万维网使用)和私有地址(局域网使用)。
 *
 *      4、因为IP地址不易记住，所以就有了域名这种东西。当在搜索栏中输入域名，会先在DNS服务器将域名解析为正常的IP地址，然后再连接到相应的服务器。
 *
 *      5、实例化InetAddress：
 *          两个方法：getByName();   和   getLocalHost();
 *          两个常用方法：getHostName() 和 getHostAddress()
 *
 *    二、端口号
 *
 *   1、 端口号标识正在计算机上运行的进程(程序)
 *          > 不同的进程有不同的端口号
 *          > 被规定为16位的整数0~65535。
 *          > 端口分类：
 *              ① 公认端口：0~1023。被预先定义的服务通信占用(如：HTTP占用端口80，FTP占用端口21，Telnet占用端口23)
 *              ② 注册端口：1024~49151。分配给用户进程或应用程序。(如：Tomcat占用端口8080，MySQL占用端口3306，Oracle占用端口1521等)
 *              ③ 动态/私有端口：49152~65535。
 *
 *   2、端口号与IP地址的组合得出一个网络套接字：Socket。
 */
public class a_InetAddress {
    public static void main(String[] args) throws UnknownHostException {
        // 给定主机名，确定主机的 IP 地址
        // 主机名可以是机器名，例如“ java.sun.com ”，也可以是其 IP 地址的文本表示。如果提供了文字 IP 地址，则仅检查地址格式的有效性。
        InetAddress id = InetAddress.getByName("192.168.10.128");   // /192.168.10.128
        InetAddress id1 = InetAddress.getByName("www.baidu.com");   // www.baidu.com/14.215.177.38
        System.out.println(id);
        System.out.println(id1);

        System.out.println(id1.getHostName());  // www.baidu.com    获取此 IP 地址的主机名。
        System.out.println(id1.getHostAddress());   // 14.215.177.38    以文本形式返回 IP 地址字符串

        // 返回本地主机的地址。这是通过从系统中检索主机的名称，然后将该名称解析为InetAddress来实现的。
        InetAddress id2 = InetAddress.getLocalHost();
        System.out.println(id2);    // LAPTOP-MIRPG0T5/192.168.10.1

    }
}
