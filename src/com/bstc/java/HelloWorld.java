package com.bstc.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author mayc
 * @create 2019-12-23-13:26
 **/
public class HelloWorld {
    private static final int INITIAL_SIZE = 0;

    public static void main(String[] args) {
        int num = 0;

        method1();

        //region Description
        List list1 = new ArrayList();
        list1.add(2);
        list1.add(3);

        //endregion
        //region Description mayc
        System.out.println("hello world!");
        System.out.println("hello world!");
        System.out.println("hello world!");
        System.out.println("hello world!");
        //endregion

        /*try {
            FileInputStream fis = new FileInputStream("hello.txt");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        system.out.println();
        try (FileInputStream fis = new FileInputStream("hello.txt")) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }


    public static void method1() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name","Tom");
        hashMap.put("age","100");
        hashMap.put("major","TsingHua");
        hashMap.put("major","TsingHua");

    }


}
