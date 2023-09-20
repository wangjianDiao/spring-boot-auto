package org.example.springspi.wjmybatis;

/**
 * 自定义mybatis空链接类
 */
public class WjMyBatisConnection {

    private String URL ="127.0.0.1:3306";

    private void connect(){
        System.out.printf("url"+URL);
    }
}
