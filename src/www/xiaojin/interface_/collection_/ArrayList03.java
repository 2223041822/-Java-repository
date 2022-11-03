package www.xiaojin.interface_.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ArrayList03 {
//    ArrayList的底层源码解析
//    ArrayList底层是一个数组
//    利用空参创建数组，底层创建的默认长度为0的数组，添加第一个元素时，底层会创建一个长度
//    为10的数组
public static void main(String[] args) {
    List<Object> arraylist =new ArrayList<>();
     Iterator<Object> it =arraylist.iterator();
     while(it.hasNext()){
       Object obj = it.next();
         System.out.println(obj);
     }
}


}
