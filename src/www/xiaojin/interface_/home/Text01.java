package www.xiaojin.interface_.home;

import java.util.Scanner;

public class Text01 {
    public static void main(String[] args) {
        System.out.println("请输入你想要输入金字塔的层数：");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            //金字塔层数
            for (int j = length; j < length-1; j--) {
                System.out.print("");
            }
            for (int k  = length; k  < 2*length-1; k --) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
