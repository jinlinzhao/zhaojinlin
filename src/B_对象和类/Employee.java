package B_对象和类;

import java.io.*;
/*
下面的命令行将会命令编译器载入java_installation/java/io路径下的所有类

import java.io.*;
 */
public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    //Employee 类的构造器，相当于Python的 def __init__(self):
    public Employee(String name){
        this.name = name; //this 其实和Python中的self是一样的效果
    }
    //设置age的值
    public void empAge(int empage){
        age = empage;
    }
    // 设置designation的值
    public  void empDesignation(String empSalary){
        designation = empSalary;
    }
    // 设置salary的值
    public void empSalary(double empSalary){
        salary = empSalary;
    }

    //打印的信息
    public void printEmployee(){
        System.out.println("名字:"+ name );
        System.out.println("年龄:" + age );
        System.out.println("职位:" + designation );
        System.out.println("薪水:" + salary);
    }

}
