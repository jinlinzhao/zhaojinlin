package B_对象和类;
import java.io.*;
public class EmployeeTest {
    public static void main(String[] args) {
        // 使用构造器创建两个对象
        Employee empOne = new Employee("赵金林");
        Employee empTwo = new Employee("明月");
        // 调用这两个对象的成员方法
        empOne.empAge(18);
        empOne.empDesignation("高级程序");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("菜鸟程序员");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}
