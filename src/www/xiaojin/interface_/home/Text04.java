package www.xiaojin.interface_.home;

import java.util.Scanner;

public class Text04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数");
        int num=scanner.nextInt();
        int sum=0;
        for (int i = 1; i <= num; i++) {
            if (num%i==0){
                System.out.print("因数为"+i+"，");
                sum++;
            }
        }
        System.out.println("一共有因数"+sum);
    }

}
