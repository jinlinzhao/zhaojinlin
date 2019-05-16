package E_数组;

public class TestArray2 {
    public static void main(String[] args) {
        double[] mylist = {1.9, 2.9, 3.4, 3.5};

        // 打印所有数组元素
        for (int i = 0; i < mylist.length; i++) {
            System.out.println(mylist[i] + " ");
        }
        // 或者这样
//        for (double element : mylist) {
//            System.out.println(element);
//        }
        // 计算所有元素的总和
        double total = 0;
        for (int j = 0; j < mylist.length; j++) {
            total += mylist[j];
        }
        System.out.println("元素的和为:" + total);
        // 或者这样
//        for (double j : mylist) {
//            total += j;
//        }
        System.out.println("元素的和为:" + total);

        // 查找最大元素
        double max = mylist[0];
        for (int k = 0; k < mylist.length; k++) {
            if (mylist[k] > max) {
                max = mylist[k];
            }
        }
        System.out.println("数组中最大的值是：" + max);

        /*For-Each 循环
        for(type element: array)
        {
            System.out.println(element);
        }
         */
        for (double element : mylist) {
            System.out.println(element);
        }

    }
}
