package com.strive;

import java.util.ArrayList;

public class User {
    public static void main(String[] args) {
        ArrayList newlist = new ArrayList();
        System.out.println("hi User Module!!" + newlist);

        String[] arr = new String[]{"Tom", "Jerry", "HanMeimei", "Lilei"};
//        fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i--" + arr[i]);

        }
//        iter
        for (String s : arr) {
            System.out.println("s--" + s);
        }
//        itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println("s::" + s);
        }

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        //list.for  增强
        for (Object o : list) {
            
        }
//        list.fori  普通
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }

    public void printName() {
        System.out.println("my name is wayne");
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        //ifn
        if (list == null) {
            
        }
        //inn
        if (list != null) {

        }
        //list.null
        if (list == null) {

        }
        //list.nn
        if (list != null) {

        }

    }
}
