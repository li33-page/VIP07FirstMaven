package starters;

public class MainArgs {
    public static void main(String[] args) {
        try {
            String param1=args[0];
            String param2=args[1];

            try {
                Integer i1=Integer.parseInt(param1);
                Integer i2=Integer.parseInt(param2);
                if(i1<i2){
                    System.out.println("参数2更大: "+i2);
                }
                else  if(i1==i2){
                    System.out.println("两个参数一样大");
                }
                else {
                    System.out.println("参数1更大："+i1);
                }
            } catch (NumberFormatException e) {
//                e.printStackTrace();
                System.out.println("转换为整数时失败");
            }
//
//            System.out.println(param1);
//            System.out.println(param2);
//            System.out.println(args[2]);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("输入的内容有问题");
        }
    }
}
