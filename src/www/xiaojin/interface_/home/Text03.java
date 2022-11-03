package www.xiaojin.interface_.home;

import java.util.Scanner;

public class Text03 {
    public static void main(String[] args) {
        Nable nable=new Nable();
        nable.nable();
    }
}
class Nable{
    public void nable(){
        int count=13;
        for (int i=1; i <= count; i++) {
            for (int j =1; j <= i-1; j++) {
                System.out.print("");
            }

            for (int j = 1; j <(count*2)-1; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}