package C_变量类型;

/*
以下列出了一些变量的声明实例。注意有些包含了初始化过程。

int a, b, c;         // 声明三个int型整数：a、 b、c
int d = 3, e = 4, f = 5; // 声明三个整数并赋予初值
byte z = 22;         // 声明并初始化 z
String s = "runoob";  // 声明并初始化字符串 s
double pi = 3.14159; // 声明了双精度浮点型变量 pi
char x = 'x';        // 声明变量 x 的值是字符 'x'
 */
public class Variable {
    static int allClicks = 0; //static 静态变量 类变量
    String str = "hello word"; // 实例变量

    public void method() {
        int i = 0; //局部变量
    }

}
