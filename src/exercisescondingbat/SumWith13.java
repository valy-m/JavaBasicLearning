package exercisescondingbat;
/*
Return the sum of the numbers in the array, returning 0 for an empty array.
Except the number 13 is very unlucky, so it does not count and numbers that
come immediately after a 13 also do not count.

        sum13([1, 2, 2, 1]) → 6
        sum13([1, 1]) → 2
        sum13([1, 2, 2, 1, 13]) → 6
*/

public class SumWith13 {

    public static int sum13(int[] nums) {
        int sum=0, i=0;

        while (i<nums.length){
            if (nums[i]==13 )
                i++;
            else sum+=nums[i];
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a=new int[]{13, 1, 2, 13, 2, 1, 13};
        System.out.println(sum13(a));
        int[] b=new int[]{1, 2, 13, 2, 1, 13};
        System.out.println(sum13(b));
    }
}
