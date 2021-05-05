package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author shkstart
 * @date 2021/5/4 - 22:20
 * 1、idea中代码模板所处位置：settings- Editor-LiveTemplates //Postfix Completion
 * 2、常用模板：
 */
public class TemplatesTest {
    //模板6：prsf:private static final 单例模式：私有全局常量
    private static final Customer CUST=new Customer();
    //变形：p:public pr:private psf:public static final
    public static final int NUMBER=1;
    //变形：psfi
    public static final int NUM2=10;
    //变形：psfs
    public static final String NATION="China";

    


    //  模板1：main方法：psvm
    public static void main(String[] args) {
        //模板2；sout
        System.out.println("Hello");
        //变形：soutp / soutm /soutv / xxx.sout
        //soutp:打印键盘输入参数
        System.out.println("args = [" + args + "]");
        //soutm ：打印main方法 method
        System.out.println("TemplatesTest.main");
        //soutv:变量
        int num1 = 10;
        int num2 = 11;
        System.out.println("num1 = " + num1);
        //xxx.sout
        System.out.println("hello");
        //模板3：fori
        String[] arr = new String[]{"Tom", "Jerry", "HanMeimei", "LiLei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        //变形：iter 增强for循环
        for (String s : arr) {
            System.out.println(s);

        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }
        //模板4：list.for:增强for循环
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        for (Object o : list) {

        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形：list.forr 逆序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }


    }


    public void method() {
        System.out.println("TemplatesTest.method");
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        //模板5：ifn   ifnull
        if (list == null) {

        }
        //变形：inn ifnotnull
        if (list != null) {

        }
        //变形：Postfix Completion里的：xxx.null
        if (list != null) {

        }


        //变形：xxx.nn
        if (list == null) {

        }

    }


}
