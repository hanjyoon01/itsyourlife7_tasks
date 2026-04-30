package student.ch05_array_reference;

import java.util.Scanner;

public class Q6_StudentScoreAnalysisTodo {

    public static void main(String[] args) {

        // TODO 1: Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // TODO 2: 학생 수 변수 선언
        int studentNum = 0;

        // TODO 3: 점수 배열 선언 (아직 생성 X)
        int[] scores = null;

        // TODO 4: while(true) 반복문 작성
        while (true) {

            // TODO 5: 메뉴 출력
            // --------------------------------------
            // 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
            // --------------------------------------
            System.out.println("----------------------------------\n1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료\n----------------------------------");
            // TODO 6: 사용자 선택 입력 받기 (nextLine 사용)
            System.out.print("선택> ");
            int choice = Integer.parseInt(sc.nextLine());

            // TODO 7: 선택에 따른 기능 구현

            // [1] 학생 수 입력
            // - "학생수>" 출력
            // - 입력값을 정수로 변환
            // - scores 배열 생성
            if (choice == 1) {
                System.out.print("학생수>");
                studentNum = Integer.parseInt(sc.nextLine());
                scores = new int[studentNum];
            }

            // [2] 점수 입력
            // - 반복문으로 scores[i] 입력 받기
            else if (choice == 2) {
                for (int i = 0; i < studentNum; i++) {
                    System.out.print("scores[" + i + "]>");
                    int input = Integer.parseInt(sc.nextLine());
                    scores[i] = input;
                }
            }

            // [3] 점수 리스트 출력
            // - scores[i]: 값 형태로 출력
            else if (choice == 3) {
                for (int i = 0; i < studentNum; i++) {
                    System.out.println("scores[" + i + "]: " + scores[i]);
                }
            }

            // [4] 분석
            // - 최대값 구하기
            // - 평균 구하기
            // - 출력
            else if (choice == 4) {
                int max = 0;
                int sum = 0;
                double avg = 0;

                for (int i = 0; i < studentNum; i++) {
                    sum += scores[i];
                    if (scores[i] > max) {
                        max = scores[i];
                    }
                }

                avg = (double) sum / studentNum;
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + avg);
            }

            // [5] 종료
            // - "프로그램 종료" 출력 후 break
            else if (choice == 5) {
                System.out.println("시스템 종료");
                break;
            }
        }

        // TODO 8: Scanner 닫기
        sc.close();
    }
}