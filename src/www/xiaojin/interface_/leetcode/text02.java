package www.xiaojin.interface_.leetcode;

public class text02 {
    //冒泡排序
    public static void main(String[] args) {
        int i,j,tmp;
        int [] data={6,5,9,7,2,8};
        System.out.println("冒泡排序法：");
        System.out.println("原始数据为");
        for ( i=0;i<6;i++) {
            System.out.print(i);
        }
        System.out.println("\n");
        for (i = 5; i > 0; i--) {//扫描次数
            for (int k = 0; k < i; k++) {
                if(data[k]>data[k+1]){
                    //比较两个相邻的数，若比第一个大则交换位置
                    tmp=data[k];
                    data[k]=data[k+1];
                    data[k+1]=tmp;
                }
            }

            System.out.println("第6"+-i+"次排序后的结果是：");
            for (int k = 0; k < data.length; k++) {
                System.out.print(data[k]);
            }
        }
    }
}
