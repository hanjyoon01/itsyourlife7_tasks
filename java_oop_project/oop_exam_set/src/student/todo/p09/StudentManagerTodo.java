package student.todo.p09;

import student.todo.p09.StudentTodo;

import java.util.Arrays;

public class StudentManagerTodo {
    public static void main(String[] args) {
        // TODO 1: StudentTodo 배열을 길이 3으로 생성하세요.
        // TODO 2: 세 학생 객체를 만들어 배열에 저장하세요.
        // 학생1: "김민지", 95
        // 학생2: "이서준", 88
        // 학생3: "박하늘", 76
        StudentTodo[] students = new StudentTodo[3];
        students[0] = new StudentTodo("김민지", 95);
        students[1] = new StudentTodo("이서준", 88);
        students[2] = new StudentTodo("박하늘", 76);
        
        // TODO 3: for문으로 전체 학생의 이름과 점수를 출력하세요.
        // 출력 형식:
        // 김민지 : 95
        int sum = 0;
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " : " + students[i].score);
            // TODO 4: 전체 합계를 구하세요.
            sum += students[i].score;
        }
        // TODO 5: 평균을 구하세요. (double 사용)
        double avg = (double) sum / students.length;
        
        // TODO 6: 합계와 평균을 출력하세요.
        System.out.println("합계 : " + sum);
        System.out.printf("평균 : %.3f\n", avg);
    }
}
