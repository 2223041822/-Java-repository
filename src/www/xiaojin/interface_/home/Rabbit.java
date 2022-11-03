package www.xiaojin.interface_.home;

public class Rabbit {

    public static void main(String[] args) {









//    兔子问题
     long minRabbit=1L;
     long rabbit=0L;
     long maxRabbit=0L;

        for (int i = 0; i < 48; i++) {
            maxRabbit+=rabbit;//第二个月
            rabbit=minRabbit;
            minRabbit=maxRabbit;
        }
        System.out.println(maxRabbit);
        System.out.println(rabbit);
        System.out.println(minRabbit);
    }
}

