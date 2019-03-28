package exercisescondingbat;
/*
Given an array of ints, return true if the array contains a 2 next to a 2 somewhere
 */

public class FindPair22 {

    public static boolean has22(int[] nums) {
        int valueCompare = 2;
        boolean gasit = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == valueCompare && nums[i + 1] == valueCompare) {
                gasit = true;
                break;
            }
        }
        return gasit;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2};
        System.out.println(has22(a));
        int[] b = {4, 2, 4, 2, 2, 5};
        System.out.println(has22(b));


    }

}
