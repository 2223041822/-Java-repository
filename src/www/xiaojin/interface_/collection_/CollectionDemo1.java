package www.xiaojin.interface_.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo1 {
    public static void main(String[] args) {
//      List系列有序 可重复 有索引
        Collection list=new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add(34);
        list.add(32);
        System.out.println(list);
        System.out.println("=======================");
        //Set系列无序 不重复 无索引
        Collection list1=new HashSet();
        list1.add("php");
        list1.add("java");
        list1.add(89);
        list1.add(76);
        System.out.println(list1);






    }
}
