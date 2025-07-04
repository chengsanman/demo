package org.example.demo.jvm.shuangqinweipai;

public class Student {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println("student: " + student2.equals(student1));
        //实例是不同的
        System.out.println("student.class: " + student1.getClass().equals(student2.getClass()));

        //双亲委派 ： 检查从application classload到 ext classload 到 bootstarp classload
        // 加载是从 boot 到 ext 到 application
        System.out.println(student1.getClass().getClassLoader());
        System.out.println(student1.getClass().getClassLoader().getParent());
    }
}
