package D_条件语句;

// switch
public class Test {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
            case 'C':
                System.out.println("良好");
                break;
            case 'D':
                System.out.println("都是渣渣");
                break;
            default:
                System.out.println("没有这个等级");
        }
        System.out.println("your garde:" + grade);
    }
}
