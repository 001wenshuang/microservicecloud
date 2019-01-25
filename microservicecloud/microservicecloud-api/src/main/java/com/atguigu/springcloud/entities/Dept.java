package com.atguigu.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author wilsonwen 文爽
 * @version 1.0
 * @description com.atguigu.springcloud.entities
 * @date 2019/1/17
 */



@SuppressWarnings("serial") //处理创建类的 警告

@NoArgsConstructor// 利用 lombok 自动生成无参构造

@Data//利用 lombok 自动生成 set get 方法

@Accessors(chain=true) //可以链式 风格编程

public class Dept  implements Serializable //必须序列化

{

    private Long  deptno;   //主键

    private String  dname;   //部门名称

    private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库



    public Dept(String dname)

    {

        super();

        this.dname = dname;

    }

    public Dept(final Long deptno, final String dname, final String db_source) {
        this.deptno = deptno;
        this.dname = dname;
        this.db_source = db_source;
    }
}