package B_对象和类;

public class Puppy {
    int puppyAge;

    public Puppy() {
        // 在创建一个对象的时候，至少要调用一个构造方法。构造方法的名称必须与类同名，一个类可以有多个构造方法。
        System.out.print("1111");
    }

    public Puppy(String name) {
        // 这个构造器仅有一个参数:name
        System.out.println("this is dog name:" + name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("this dog age:" + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        // 创建对象
        Puppy mypuppy = new Puppy("tommy");
        // 通过方法来设定age
        mypuppy.setAge(15);
        // 调用一个方法来获取age
        mypuppy.getAge();
        // 也可以像下面这样访问成员变量
        System.out.println("变量值为："+ mypuppy.puppyAge);

    }
}

