public class report2 {
    public static void main(String[] args) {
        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;
//3-1. 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
        b = (byte) i;
        ch = (char) b;
        short s = (short) ch;
        float f = (float)l;//check
        i = (int)ch;//check
    }
}

    //3-2. 다음 연산의 결과와 그 이유를 적으세요.
    class exercise32 {
        public static void main(String[] args) {
            int x = 2;
            int y = 5;
            char c = 'A'; // 'A'의 문자코드는 65

            System.out.println(y >= 5 || x < 0 && x > 2);//true &&가 연산 순서가 빠름-> y>=5가 참이기 때문에 true || false는 true
            System.out.println(y += 10 - x++);//13  += -> 왼쪽+오른쪽 후에 왼쪽에 대입 -> 15
            System.out.println(x += 2);//5 이전 식에서 x의 값이 증가함
            System.out.println(!('A' <= c && c <= 'Z'));//false !는 논리식 값의 반대값을 반환,
            System.out.println('C' - c);//2 아스키코드에서 C는 67 A는 65이다.
            System.out.println('5' - '0');//5 아스키코드에서 문자'5'는 53이고 '0'은 48이다
            System.out.println(c + 1);//66 이항연산자의 성질 때문에 'A'는 코드값인 65로 변환되어 66
            System.out.println(++c);//B 전위형 ++은 값이 참조 되기 전에 값이 증가하고 ++은 단항 연산자이기 때문에 형변환을 일으키지 않는다.
            System.out.println(c++);//B 후위형 ++은 값이 참조 된 후에 값이 증가하기 때문에 똑같이 'B'.
            System.out.println(c);//C 이어서 사용된 식에서의 c의 값은 1증가된 66에 해당되는 아스키코드 'C'이다

        }

    }


    //3-3. 아래는 변수의 num 값 중에서 백의 자리 이하를 버리는 코드이다.
//만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다.
//알맞은 코드를 넣으시오.
    class Exercise33 {
        public static void main(String[] args) {
            int num = 456;
            System.out.println(num/100*100);
        }
    }
//예상 결과 -> 400


    //3-4. 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다.
//만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요할 것이다.
//알맞은 코드를 넣으시오.
    class Exercise34 {
        public static void main(String[] args) {
            int numOfApples = 123; // 사과의 개수
            int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
            int numOfBucket = (numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket>0?1:0)) ; // 모든 사과를 담는데 필요한 바구니의 수

            System.out.println("필요한 바구니의 수 :" + numOfBucket);
        }
    }
//예상 결과 -> 필요한 바구니의 수 :13


    //3-5. 아래는 변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다.
//삼항연산자를 이용해서 빈칸에 알맞은 코드를 넣으시오.
//Hint : 삼항 연산자를 두 번 사용할 것!
    class Exercise35 {
        public static void main(String[] args) {
            int num = 10;

            System.out.println(num >= 0 ? (num == 0 ? "0" : "양수") : "음수");
        }
    }
//예상 결과 : 양수


    //3-6. 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다.
//변환 공식이 'C = 5/9*(F-32)'라고 할 때, 빈 칸에 알맞은 코드를 넣으시오.
// 단, 변환값은 소수점 셋째자리에서 반올림하며, Math.round() 함수를 사용하지 않고 처리할 것!
    class Exercise36 {
        public static void main(String[] args) {
            int fahrenheit = 100;
            float celcius =(int)((5/9f*(fahrenheit-32))*100+0.5)/100f;

            System.out.println("Fahrenheit:" + fahrenheit);
            System.out.println("Celcius:" + celcius);
        }
    }
//예상 결과 : Fahrenheit:100, Celcius:37.78

