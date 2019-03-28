package exercisescondingbat;
/*
Return the sum of the numbers in the array, except ignore sections of numbers starting
with a 6 and extending to the next 7 (every 6 will be followed by at least one 7).
 Return 0 for no numbers.

        sum67([1, 2, 2]) ->  5
        sum67([1, 2, 2, 6, 99, 99, 7]) -> 5
        sum67([1, 1, 6, 7, 2]) ->  4
*/

public class SumWith67 {

    public static int sum67(int[] nums) {

        int sum = 0, i = 0;
        if (nums.length==0) return 0;
        boolean gasit = false;
        while (i < nums.length) {
            if (nums[i] == 6) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] == 7) {
                        i = j;
                        break;
                    } else
                        gasit = false;
                }
            } else sum += nums[i];
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 6, 99, 99, 7};
        System.out.println(sum67(a));
        int[] b = {1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7};
        System.out.println(sum67(b));

    }
}