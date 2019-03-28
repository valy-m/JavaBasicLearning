package exercisescondingbat;
/*
Given an array of ints, return true if the array contains no 1's and no 3's.

lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
 */

public class Lucky13 {

    public static boolean lucky13(int[] nums) {
        boolean find=true;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==1 || nums[i]==3) {find=false;
                break;
            }}
        return find;
    }

    public static void main(String[] args) {
        int[] a ={1, 2, 4};
        System.out.println(lucky13(a));
        int[] b ={2, 7, 2, 8};
        System.out.println(lucky13(b));
    }

}
