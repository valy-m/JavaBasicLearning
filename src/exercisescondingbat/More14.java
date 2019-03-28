package exercisescondingbat;
/*
Given an array of ints, return true if the number of 1's is greater than the number of 4's


more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
 */

public class More14 {
    public static boolean more14(int[] nums) {
        int countNr1=0, countNr4=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==1)  countNr1++;
            else  if (nums[i]==4)  countNr4++;
        }
        if (countNr1>countNr4) return true ;
        else return false;
    }

    public static void main(String[] args) {
        int[] a ={1, 4, 1};
        System.out.println(more14(a));
        int[] b ={1, 4, 1, 4};
        System.out.println(more14(b));
    }
}
