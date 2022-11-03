package www.xiaojin.interface_.leetcode;

public class Text01 {
    public static void main(String[] args) {
        Text01 text01 = new Text01();
        int[] num={2,4,4,8};
        System.out.println(text01.twoSum(num, 4));
    }
//    两数之和
    public int[] twoSum(int []num,int target){
        int[] sum=new int[2];
        for (int i = 0; i < num.length; i++) {
            //遍历数组
            for (int j = i+1; j < num.length; j++) {
                if (num[i]+num[j]==target){
//                    返回数组下标
                    System.out.println(sum[0] = i);
                    System.out.println(sum[1] = j);
                }
            }
        }
        return sum;
    }
}

