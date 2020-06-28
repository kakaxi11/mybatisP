package com.homejim.mybatis.entity;

import java.util.Date;

public class Student {
    private Integer studentId;

    private String name;

    private String phone;

    private String email;

    private Byte sex;

    private Byte locked;

    private Date gmtCreated;

    private Date gmtModified;
    /**
     * 以下部分为setter和getter, 省略
     */


    //该方法可获得当前对象的基本信息
    public String getInfo() {
        return  this.name +"  " + this.phone+"  " + this.sex+" " + this.email;
    }
//    public Byte getSex() {
//        return  this.sex;
//    }
//    public  String getName(){
//        return this.name;
//    }
//    写上对应的get和set方法就能查询到数据了。
//    .MAPPERxml文件 这是一个用来做sql语句查询的映射文件，sql语句就写到下面
//     这里可以写入其他sql语句 ， 例如select * from student
//尝试在MAPPER.XML文件里写上增删改查的接口，尝试结合web 来进行操作

}