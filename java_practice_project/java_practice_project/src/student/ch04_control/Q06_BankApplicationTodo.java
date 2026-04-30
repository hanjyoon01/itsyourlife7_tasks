package student.ch04_control;

import java.util.Scanner;

public class Q06_BankApplicationTodo {
    public static void main(String[] args) {

        // TODO 1: Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // TODO 2: 잔고(balance) 변수 선언 (초기값 0)
        int balance = 0;

        // TODO 3: while(true) 반복문 작성
        while(true){

            // TODO 4: 메뉴 출력
            // ----------------------------------
            // 1.예금 | 2.출금 | 3.잔고 | 4.종료
            // ----------------------------------
            System.out.println("----------------------------------\n1.예금 | 2.출금 | 3.잔고 | 4.종료\n----------------------------------");
            System.out.print("선택> ");

            // TODO 5: 사용자 선택 입력 받기 (nextLine 사용)
            int choice = Integer.parseInt(sc.nextLine());

            // TODO 6: if 또는 switch로 기능 구현

            // [1] 예금
            // - "예금액>" 출력
            // - 금액 입력 받아 balance에 더하기
            if (choice == 1) {
                System.out.print("예금액>");
                int credit = Integer.parseInt(sc.nextLine());
                balance += credit;
            }

            // [2] 출금
            // - "출금액>" 출력
            // - 금액 입력 받아 balance에서 빼기
            else if(choice == 2) {
                System.out.print("출금액>");
                int withdrawal = Integer.parseInt(sc.nextLine());
                if(balance <  withdrawal)
                    System.out.println("돈이 부족합니다");
                else
                    balance -=  withdrawal;
            }

            // [3] 잔고 조회
            // - "잔고>" + balance 출력
            else if(choice == 3) {
                System.out.println("잔고>" + balance);
            }

            // [4] 종료
            // - "프로그램 종료" 출력
            // - break로 반복문 종료
            else if(choice == 4) {
                System.out.println("시스템 종료");

                break;
            }
        }

        // TODO 7: Scanner 닫기
        sc.close();
    }
}
