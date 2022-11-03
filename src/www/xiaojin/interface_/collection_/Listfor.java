package www.xiaojin.interface_.collection_;

import java.util.*;

public class Listfor {
    public static void main(String[] args) {
//        List的接口子类遍历方式都一样
        List<Object> list=new LinkedList<>();
        list.add("java");
        list.add("c++");
        list.add("php");

        Iterator iterator= list.iterator();//迭代器
        while (iterator.hasNext()){
            Object o=iterator.next();
            System.out.println(o);
        }
        for (Object obj:list) {
            System.out.println(obj);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("对象"+list.get(i));
        }
    }
}
