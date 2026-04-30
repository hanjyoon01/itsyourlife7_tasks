package student.ch04_control;

import java.util.Arrays;

/*
문제 12. 중첩 for문
다음과 같이 별이 출력되도록 코드를 작성하세요.

출력 결과:
*
**
***
****
*****
*/
public class Q04_StarTriangle {
    public static void main(String[] args) {
        // TODO: 중첩 for문으로 별 삼각형을 출력하세요.
        starTriangle(5);
    }

    public static void starTriangle(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}