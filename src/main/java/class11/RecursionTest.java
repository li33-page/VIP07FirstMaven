package class11;

public class RecursionTest {
    public static void main(String[] args) {
        System.out.println(jiecheng(6));
        System.out.println(phib(13));
        System.out.println(phibArray(13));
    }


    public static void test(int n) {
        n++;
        System.out.println("这是递归测试");
        if (n < 5) {
            test(n);
        }
        //不满足条件就是递归出口。
    }

    //阶乘： n!  =n*(n-1)!  n=1的时候，阶乘结果是1.
    public static int jiecheng(int n) {
        int result = 0;
        if (n == 1) {
            result = 1;
        } else {
            result = n * jiecheng(n - 1);
        }
        return result;
    }

    //斐波那契数列计算
    //第n项的值就是 n-1+n-2的值
    //出口条件是第1个为0 ，第二个为1
    public static int phib(int n) {
        int result = 0;
        if (n == 1) {
            result = 0;
        } else if (n == 2) {
            result = 1;
        } else {
            result = phib(n - 2) + phib(n - 1);
        }
        return result;
    }

    //通过数组计算斐波那契数列的值
    public static int phibArray(int xiang) {
        int[] a = new int[xiang];
        a[0] = 0;
        a[1] = 1;
        for (int n = 2; n < a.length; n++) {
            a[n] = a[n - 1] + a[n - 2];
        }
        return a[xiang-1];
    }


}
