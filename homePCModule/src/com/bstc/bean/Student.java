package com.bstc.bean;

/**
 * @author mayc
 * @create 2019-12-29-11:19
 **/
public class Student {
    String id;
    String name;
    String age;
    String mayor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMayor() {
        return mayor;
    }

    public void setMayor(String mayor) {
        this.mayor = mayor;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Student() {
    }
}
