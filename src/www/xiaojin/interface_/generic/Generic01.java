package www.xiaojin.interface_.generic;

import java.util.ArrayList;

public class Generic01 {
    public static void main(String[] args) {
//        注意这个集合是以及定义好的所以Dog并不代表泛型而是传递给泛型的类
//        而且只能传递Dog类不能使用其他类一旦定义好；
//        即<T>===><引用数据类型>泛型即相当于引用数据类型的通配符
        ArrayList<Dog> list=new ArrayList<Dog>( );
        list.add(new Dog("大黄",12));
        list.add(new Dog("大名",19));
        list.add(new Dog("小黄",14));
        for (Dog list01:list) {
            System.out.println(list01);
            System.out.println(list01.getClass());
        }
        ArrayList<Object> es = new ArrayList<>();
        es.add("ssdsd");
        es.add(123);//注意此处不是int基本数据类型而是Integer引用类型八大基本类型以此类推
        System.out.println(es);

    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}