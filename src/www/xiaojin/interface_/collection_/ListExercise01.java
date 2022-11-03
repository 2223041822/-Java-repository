package www.xiaojin.interface_.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise01 {
    public static void main(String[] args) {
        List<Object> list=new ArrayList<>();
        list.add(new Book_("三国演义",34,"罗汉中"));
        list.add(new Book_("斗罗大路",36,"唐家三少"));
        list.add(new Book_("斗破苍穹",35,"唐家三少"));
//        如何对集合元素排序
        for (Object obj:list) {
            System.out.println(obj);
        }
    }
//    静态方法
    public static void sort(List list){
        int listSize = list.size();//返回集合元素个数
        for (int i = 0; i < listSize-1; i++) {

        }
    }
}
class Book_
{
    private String name;
    private double value;
    private String author;

    public Book_(String name, double value, String author) {
        this.name = name;
        this.value = value;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "书名:"+name+'\t'+"价格："+value+'\t'+"作者："+author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
