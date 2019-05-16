package C_变量类型;
/*
局部变量
 */
public class Test {
    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("this dog age is:" + age);

    }

    public static void main(String[] args) {
        Test test = new Test();
        test.pupAge();
    }
}
