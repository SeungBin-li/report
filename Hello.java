class Operator4_2 {
    public static void main(String[] args) {
        char ch = '2';

        // 문자 '2' 는 숫자로 50, '0' 은 48
        // 따라서 int 타입으로 자동으로 변하기 때문에 50 - 48 = 2
        System.out.print("ch - '0' = ");
        System.out.println(ch - '0');

        int a = 1_000_000; // 1백만
        int b = 2_000_000; // 2백만

        // a * b = 2_000_000_000_000 -> 10^12
        // long 에 저장하려는 것은 맞지만 a * b 의 결과 타입이 int
        // 따라서 이미 계산을 할 때 오버플로우 발생! -> 따라서 계산을 할 때 형변환 필요!
        // long l = a * b; // -1454759936

        long l = (long)a * b;
        // long * int -> long * long => 1_000_000L * 2_000_000 -> 1_000_000L * 2_000_000L
        System.out.println("l = " + l);
    }
}
class Operator6_1 {
    public static void main(String[] args) {
        int n1 = 10, n2 = 6;
        char c1 = 'A', c2 = 'B';

        System.out.print("n1 >= n2 = " ); // true
        System.out.println(n1 >= n2);
        System.out.print("n1 <= n2 = " ); // false
        System.out.println(n1 <= n2);

        System.out.print("n1 == n2 = " ); // false
        System.out.println(n1 == n2);
        System.out.print("n1 != n2 = " ); // true
        System.out.println(n1 != n2);

        // 산술변환 규칙에 의해서 char 타입이 int 타입으로 변환되어 연산됨
        System.out.print("c1 < c2 = "); // true
        System.out.println(c1 < c2); // 65 < 66
        System.out.print("c1 > c2 = "); // false
        System.out.println(c1 > c2); // 65 > 66
    }
}
class Exercise3_2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);//true
        System.out.println(y += 10 - x++);//13
        System.out.println(x += 2);
        System.out.println(!('A' <= c && c <= 'Z'));
        System.out.println('C' - c);
        System.out.println('5' - '0');
        System.out.println(c + 1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);

    }

}
class Operator2_1 {
    public static void main(String[] args) {
        int k = 0, j = 3;

        // 후위 형
        k = j++;
        System.out.println("k = j++;, k = " + k);
        System.out.println("k = j++;, j = " + j);
        // 다르게 표현 가능
//        k = j;
//        j++;
//        System.out.println("k = j++;, k = " + k);
//        System.out.println("k = j++;, j = " + j);

        // 값 초기화
        k = 0;
        j = 3;

        // 전위 형
        k = ++j;
        System.out.println("k = ++j;, k = " + k);
        System.out.println("k = ++j;, j = " + j);
        // 다르게 표현 가능
//        ++j;
//        k = j;
//        System.out.println("k = ++j;, k = " + k);
//        System.out.println("k = ++j;, j = " + j);

    }
}