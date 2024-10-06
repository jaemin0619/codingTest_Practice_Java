package codingTest;

import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] org = {4, 2, 3, 1, 5};
        int[] sorted = solution(org);
        System.out.println(Arrays.toString(org));
        System.out.println(Arrays.toString(sorted));
    }

    private static int[] solution(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}
