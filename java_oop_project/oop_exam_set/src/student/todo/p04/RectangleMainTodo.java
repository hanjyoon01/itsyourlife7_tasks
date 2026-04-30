package student.todo.p04;

import java.util.Arrays;

public class RectangleMainTodo {
    public static void main(String[] args) {
        // TODO 1: RectangleTodo 객체를 생성하세요. (가로 10, 세로 5)
        // TODO 2: "넓이: " + getArea() 결과를 출력하세요.
        // TODO 3: "둘레: " + getPerimeter() 결과를 출력하세요.
        RectangleTodo rectangle = new RectangleTodo(10, 5);
        System.out.println("넓이: " + rectangle.getArea());
        System.out.println("둘레: " + rectangle.getPerimeter());
    }
}
