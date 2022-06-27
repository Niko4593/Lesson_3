package Lesson_3.SwapElements;

import java.util.Arrays;

public class SwapElements {

        public SwapElements() {
        }

        public static void main(String[] args) {
            String[] array = new String[]{"a", "b", "c"};
            System.out.println("Old array -> " + Arrays.toString(array));
            String temp = array[0];
            array[0] = array[2];
            array[2] = temp;
            System.out.println("Old array -> " + Arrays.toString(array));
        }
    }
