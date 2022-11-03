package www.xiaojin.search.basicsearch;

import org.jetbrains.annotations.Contract;

public class BasicSearch01 {
    public static void main(String[] args) {
//        基本查找，顺序查找
        int [] arr={11,22,332,54,3243,5,5,3};
        int number=5;
        System.out.println(basicSearch(arr,number));
    }

    @Contract(pure = true)
    public static boolean basicSearch(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==number){
                return true;
            }
        }
        return false;
    }

}
