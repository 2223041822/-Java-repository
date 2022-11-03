package www.xiaojin.interface_.inner;

public class Outer {
    public static class Inner{
//        静态内部类
        private String name;
        private int age;
        public static String schoolName;

        public Inner(){}

        public Inner(String name, int age) {
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

    }
}
