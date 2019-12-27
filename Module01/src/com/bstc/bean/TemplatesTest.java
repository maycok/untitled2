package com.bstc.bean;

import java.util.ArrayList;

/**
 * @author mayc
 * @create 2019-12-24-15:21
 **/
public class TemplatesTest {
    //    模板一：psvm
    public static void main(String[] args) {
        //模板二：sout
        System.out.println("Hello");
//        变形：soutp / soutm / soutv / xxx.sout
        //p:parameters
        System.out.println("args = [" + args + "]");
        //m:method :可以打印出来方法的名称
        System.out.println("TemplatesTest.main");
        //v ：varaible
        int num1 = 20;
        System.out.println("num1 = " + num1);
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);
        //模板三：fori
        String[] arr = new String[]{"Tom","Jerry","HanMeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形:itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板四：list.for
        ArrayList list2 = new ArrayList();
        list2.add(123);
        list2.add(123);
        list2.add(123);
        for (Object o : list2) {
            System.out.println(o);
        }
        //变形：list.fori
        for (int i = 0; i < list2.size(); i++) {
                    
        }
        for (int i = list2.size() - 1; i >= 0; i--) {
            
        }
    }
    public static void fun(Integer i){
        System.out.println("i = [" + i + "]");
        System.out.println("TemplatesTest.fun");
    }

}
