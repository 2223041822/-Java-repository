package www.xiaojin.interface_.inner;

public class Car {//外部类
//    内部类可以使用外部类的属性但是外部类不能直接使用内部类的属性
//    需要在外部类里面创建对象使用
public static void main(String[] args) {
    Car.Engine engine1 = new Car().new Engine();
//    创建内部类对象

}


    private String carName;
    private int carAge;
    private int carColor;
    Engine engine = new Engine();
    class Engine{//成员内部类
        String enginName;
        int enginAge;
    }
}
