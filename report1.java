public class report1 {
    public static void main(String[] args) {
        //2-4
        //byte b = 256; byte의 표현 범위를 넘어감
        //char c = ''; // char로 빈 문자 표현이 안된다
        //char answer = 'no'; char 는 문자 하나만 들어갈 수 있음
        //float f = 3.14 float은 뒤에 접미사 f가 붙어야 됨
        double d = 1.4e3f;

        //2-7
        System.out.println("1" + "2");//12
        System.out.println(true+"");//true
        System.out.println('A' + 'B');//131
        System.out.println('1' + 2);//53
        System.out.println('1' + '2');//99
        System.out.println('J' +"ava");//Java
        //System.out.println(true + null);오류


        int x = 1;
        int y = 2;
        int z = 3;

        int mid = x;
        int mid2 = y;
        int mid3 = z;

        x=mid2;
        y=mid3;
        z=mid;

        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);


    }

}
