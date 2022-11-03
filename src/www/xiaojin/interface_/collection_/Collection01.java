package www.xiaojin.interface_.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collection01  {
    public static void main(String[] args) {
       List<Object> list =new ArrayList();
       list.add("jack");
       list.add(10);
       list.add(true);
//       add()方法是往集合加入元素
        System.out.println(list);
        list.remove(true);//指定删除某个元素
        list.remove(0);//指定删除索引对应的元素
        System.out.println(list);
        System.out.println(list.contains("jack"));
//        contains()方法查找元素是否存在放回boolean值
        System.out.println(list.size());
        //size获得集合元素个数
        System.out.println(list.isEmpty());
//        isEmpty()判断集合是否为空
//        list.clear();clear方法是清空集合元素
        ArrayList<Object> list1 = new ArrayList<>();
        list1.add(124456);
        list1.add("oosj");
        list.addAll(list1);
        System.out.println(list);
        list.removeAll(list1);//删除集合所有元素

    }
}
