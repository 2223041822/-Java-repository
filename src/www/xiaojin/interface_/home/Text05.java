package www.xiaojin.interface_.home;

import java.util.Scanner;

public class Text05 {
    public static void main(String[] args) {
        System.out.println("请输入分别两个数");
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b=scanner.nextInt();

        if (a<b){
            int temp=a;
            a=b;
            b=temp;
            System.out.println("交换后的数为"+a+"和"+b);
            }else
            System.out.println("a>=b");
        for (int i = a; ; i--) {
            if (a%i==0 && b%i==0){
                System.out.println("最大公约数为"+i);
                break;
            }
        }


    }
}
