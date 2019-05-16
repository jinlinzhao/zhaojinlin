package C_变量类型;
/*
a++是先运算在赋值，
而++a是先赋值在运算！！
 */
public class demo_test {
    public static void main(String[] args) {
        int a = 1;
        a = ++a;
        System.out.println(a);
    }
}
