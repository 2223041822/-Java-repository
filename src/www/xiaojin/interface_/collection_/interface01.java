package www.xiaojin.interface_.collection_;

public class interface01 implements Comparable {
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
class A{
   public int []twoSum(int [] nums,int target){
       int[]a=new int[2];
       for (int i = 0; i < nums.length ; i++) {
           for (int j = 0; j < nums.length; j++) {
               if (nums[i]+nums[j]==target){
                   a[0]=i;
                   a[1]=j;
               }
           }
       }
       return a;
   }


}