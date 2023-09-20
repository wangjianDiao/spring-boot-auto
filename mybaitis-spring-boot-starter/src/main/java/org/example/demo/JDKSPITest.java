package org.example.demo;

import org.example.jdkspi.JDKSPIService;

import java.util.ServiceLoader;

/**
 * jdk spi 实现：
 *  定义于发现：
 *             JDK的SPI主要通过在META-INF/services/目录下放置特定的文件来指定哪些类实现了给定的服务接口。这些文件的名称应为接口的全限定名，内容为实现该接口的全限定类名。
 *   加载机制：
 *             ServiceLoader类使用Java的类加载器机制从META-INF/services/目录下加载和实例化服务提供者。例如，ServiceLoader.load(MyServiceInterface.class)会返回一个实现了MyServiceInterface的实例迭代器。
 *    缺点：
 *             JDK原生的SPI每次通过ServiceLoader加载时都会初始化一个新的实例，没有实现类的缓存，也没有考虑单例等高级功能
 */
public class JDKSPITest {
    public static void main(String[] args) {
        ServiceLoader<JDKSPIService> load = ServiceLoader.load(JDKSPIService.class);
        for (JDKSPIService jdkspiService : load) {
            System.out.printf(jdkspiService.getMessage()+"   ");
        }
    }
}
