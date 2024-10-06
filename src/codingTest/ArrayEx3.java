package codingTest;

import java.util.HashSet;



public class ArrayEx3 {
   public static int[] solution(int []numbers)
   {
       HashSet<Integer> set=new HashSet<>(); // 중복된 제거 위해 해시셋 생성
       //두 수를 선택하는 모든 경우의 수를 반복문으로 구함
       for(int i=0;i<numbers.length-1;i++)
       {
           for(int j=0;j<numbers.length;j++)
           {
              set.add(numbers[i]+numbers[j]);
           }
       }
       return set.stream().sorted().mapToInt(Integer::intValue).toArray();
   }


}
