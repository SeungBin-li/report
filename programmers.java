import java.time.LocalDate;
import java.util.Arrays;

public class programmers {// solution13
    public static void main(String[] args) {

        String tmp ="ppyy";
        System.out.println(tmp.charAt(1));
    }
}

class Solution {
    public long solution(int a, int b) {
        long answer = 0L;
        int sum = 0;
        if (a <= b) {
            for (int i = a; i <= b; i++)
                answer += i;
        } else {
            for (int i = b; i <= a; i++)
                answer += i;
        }
        return answer;
    }
}
class Solution1 {
    public String solution(String phone_number) {
        String answer = "";

        for(int x=0;x<phone_number.length();x++){
            if(x < phone_number.length()-4)
                answer += "*";
            else
                answer += phone_number.charAt(x);
        }

        return answer;
    }
}
class Solution2 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i=0;i<=arr1.length;i++){
            for(int j=0;j<=arr1.length;j++){
                answer[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        return answer;
    }
}
class Solution11 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i=0; i<n; i++){
            answer[i] = (long)x * (i+1);
        }
        return answer;
    }

}
class Solution10 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for( int i = 0; i < arr1.length; i++ ) {

            for( int j = 0; j < arr1[i].length; j++ ) {

                answer[i][j] = arr1[i][j] + arr2[i][j];

            }

        }

        return answer;

    }
}
class Solution12 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;

        for(int i=1;i<=count;i++){
            sum += price*i;
        }
        if(sum>money){
            answer= sum-money;
        }
        return answer;
    }
}
 class Solution13 {
     public static String solution() {

         int a =1;
        int b =1;
        String answer = LocalDate.of(2016, a, b).getDayOfWeek().toString();
         System.out.println(answer);
        return answer;
     }
}
class Solution14 {
    public int[] solution(int[] arr, int divisor) {

        int count = 0;
        int number = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                count++;
            }
        }

        if(count == 0){
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[count];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[number] = arr[i];
                number++;
            }
        }

        Arrays.sort(answer);
        return answer;

    }
}
class Solution16 {
    boolean solution(String s) {
        boolean answer = true;
        String[] array = s.toLowerCase().split("");
        int cntp=0;
        int cnty=0;
        for(int i=0;i<array.length;i++){
            if("p".equals(array[i])){
                cntp++;
            }
            if("y".equals(array[i])){
                cnty++;
            }
        }
        if(cntp != cnty){
            answer = false;
        }
        return answer;
    }
}