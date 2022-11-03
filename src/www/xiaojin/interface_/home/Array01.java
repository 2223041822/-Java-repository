package www.xiaojin.interface_.home;

import java.util.ArrayList;
import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        System.out.println("请输入一个素数");
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int flag=1;
        for (int i=2;i<num; i++) {

//            ArrayList<Object> a = new ArrayList();
//            a.add(scanner.next());
            if (num%i==0){
                flag=0;
                break;
            }

        }
        if(flag==0){
            System.out.println(num+"是素数");
        }
        else{
            System.out.println(num+"不是素数");
        }
    }
}
