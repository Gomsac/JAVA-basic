package oop1.ex;

public class RectangleOopMain {

    public static void main(String[] args) {
        Rectangle Rect = new Rectangle();
        Rect.width = 5;
        Rect.height = 5;

        int area = Rect.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = Rect.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = Rect.isSquare();
        System.out.println("정사각형 여부: " + square);
    }

}
