package www.xiaojin.interface_.collection_;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
//        Arraylist是已经定义好的类
//        打印的不是地址值
        List<Object> objects = new ArrayList<>();
//        多态
        objects.add("小明");
        System.out.println("集合元素为："+objects);
        System.out.println("集合元素数："+objects.size());
        List<Object> list=new ArrayList<> ();
        list.add(true);
        list.add(908);
        list.add("ob");
        list.iterator();
        for (int i = 0; i < list.size(); i++) {
//            遍历集合元素
            Object a=list.get(i);
//            获得集合元素
            System.out.println(a);
        }
        list.set(0,"ok");
        Object a=list.get(0);
//        get方法获得集合元素
//        set方法修改集合某个元素
        System.out.println(a);
        System.out.println(list);
        list.isEmpty();
        System.out.println(list.addAll(objects));
    }
}
