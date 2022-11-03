package www.xiaojin.interface_.collection_;

import java.util.*;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>() ;
        list.add("tom");
        list.add("html");
        System.out.println(list);
        list.isEmpty();//元素是否为空
        Object[] arr= list.toArray();
        for (Object i:arr) {
            System.out.println(i);
        }
    }
}
