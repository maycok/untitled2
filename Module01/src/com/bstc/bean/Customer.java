package com.bstc.bean;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author mayc
 * @create 2019-12-23-13:34
 **/
//这是单行注释

public class Customer extends Person {

    public static  void main(String[] args){
     /*   System.out.println("Customer");
//        ArrayList list = new ArrayList();*/


        Date date = new Date();

        ArrayList list = new ArrayList();
        /*try {
            FileInputStream fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

    }

    //region Description
    public void show(){

    }
    //endregion

    public  void eat(){
        System.out.println("customer eat");
    }
}
