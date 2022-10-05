package codeUp.Sol1012;

import java.util.Scanner;

public class Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //float num = sc.nextFloat();

        //System.out.printf("%f", num);
    }
}

class Main1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d %d", a, b);
    }
}

class Main1014 {
    //import java.util.Scanner;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char x = sc.next().charAt(0);
        char y = sc.next().charAt(0);

        System.out.printf("%c %c", y, x);

    }
}

//import java.util.Scanner;
class Main1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num = sc.nextFloat();
        System.out.printf("%.2f", num);
    }
}

//import java.util.Scanner;
class Main1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.printf("%d %d %d", num, num, num);
    }
}

//import java.util.Scanner;
class Main1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int h = sc.nextInt(); //시
//        int m = sc.nextInt(); //분
//        System.out.printf("%d:%d",h,m);
        //입력 받는 값이 숫자가 아닌듯.. 3:16이 한 번에 입력되나봐

        String time = sc.next();

        System.out.printf("%s",time);
        /* %b -> boolean print
        %d -> decimal 10진 정수 print
        %f 부동소수점 floating-point 출력
        %c 문자 character 출력
        %s 문자열 string print
        %o octal 8진 정수 출력
        %x hexa-decimal 16
        %f 부동소수점 floating-point 출력
        %c 문자 character 출력
        %s 문자열 string print
        %e 지수 exponent print
         */

    }
}

//import java.util.Scanner;
class Main1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String date = sc.next();
        //System.out.printf("%s", date); //2013.08.05로 나와야되는데 2013.8.5가 출력된대

        /*sc = new Scanner(sc.next()).useDelimiter("[.\n]"); //이게 맞는거냐?.. 너무 복잡한디
        int[] date = new int[3]; //년월일 세개 저장해야됨
        int length = date.length; //배열 길이..
        int put = sc.nextInt(); //보류*/

        String input = sc.next();

        String[] data = input.split("[.]"); //정규표현식에서 마침표를 사용하려면 \\. 혹은 [.] 사용해야한다네
        int[] date = new int[3];

        for(int i = 0; i<data.length;i++){
            date[i] = Integer.parseInt(data[i]);
        }

        System.out.printf("%04d.%02d.%02d",date[0],date[1],date[2]);
        //%04d -> 4자리 정수 형태로 출력해라.. 2021
        //%02d -> 2자리 정수 형태로 출력해라.. 04
    }
}


//import java.util.Scanner;
class Main1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        String num = input.replace("-", "");

        System.out.println(num);

    }
}