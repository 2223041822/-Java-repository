package www.xiaojin.interface_.collection_;

import java.util.ArrayList;
import java.util.Iterator;

public class Text01 {
    public static void main(String[] args) {
//        创建集合
        ArrayList<Student> list=new ArrayList<>();

//        创建学生对象
        Student s1= new Student("小明",12);
        Student s2= new Student("小红",13);
        Student s3= new Student("小洋",19);

//        添加集合元素
        list.add(s1);
        list.add(s2);
        list.add(s3);

//        遍历集合
        for (Student i:list) {
            System.out.println(list);
        }

        Iterator<Student> iterator= list.iterator();
        while (iterator.hasNext()){
            Student student=iterator.next();
            System.out.println(student);
        }
    }
}
