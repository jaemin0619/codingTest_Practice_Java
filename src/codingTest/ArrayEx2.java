package codingTest;

import java.util.Arrays;
import java.util.Collections;

/*
* 배열 제어하기
* 정수 배열을 하나 받고 배열의 중복값을 제거하고 배열 데이터를 내림차순으로 정렬해서 반환하는 solution() 함수 구현
* 배열 길이 2 이상 1000이하
* 각 배열의 데이터 값 -10만 ~ 10만 */
public class ArrayEx2 {
    private static int[] solution(int [] arr)
    {
        //중복값 재거
        Integer[] result= Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        Arrays.sort(result, Collections.reverseOrder()); // 내림차순 정렬
        //int형 배열로 변환
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }

}
