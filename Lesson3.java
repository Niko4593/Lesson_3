package Lesson_3;

import java.util.ArrayList;

public class Lesson3 {

    public static void main(String[] args) {

        ArrayList<Apple> apples = new ArrayList<>(10);
        Apple apple0 = new Apple(1);
        Apple apple1 = new Apple(1);
        Apple apple2 = new Apple(1);
        Apple apple3 = new Apple(1);
        apples.add(apple0);
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);
        Box<Apple> box1 = new Box<>(apples);

        ArrayList<Apple> apples2 = new ArrayList<>(10);
        apples2.add(apple0);
        apples2.add(apple1);
        apples2.add(apple2);
        apples2.add(apple3);
        Apple apple4 = new Apple(1);
        Box<Apple> box2 = new Box<>(apples2);

        System.out.println(box2.getBoxWeight());

        System.out.println(box1.compare(box2));

        box1.toEmptyList(box2);

        System.out.println(box2);


    }
}
