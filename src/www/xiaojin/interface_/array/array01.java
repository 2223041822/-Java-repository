package www.xiaojin.interface_.array;

import java.util.Arrays;

public class array01 {
    public static void main(String[] args) {
        Array_ arr=new Array_();
        arr.arr();

    }
}
class Array_{
    public void arr(){
     int[] array={1,2,34,5};
//        创建数组时会初始化
        for (int i:array) {
            System.out.println(i);
        }
        System.out.println(Arrays.toString(array));
        int [] a=Arrays.copyOf(array,array.length);
        System.out.println();
//        System.out.println(a.toString());
    }
}
