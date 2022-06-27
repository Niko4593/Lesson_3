package Lesson_3;

import java.util.ArrayList;

public class Box <T extends Fruit>{

    ArrayList<T> fruits;

    public Box(ArrayList<T> fruits){
        this.fruits = fruits;
    }

    public Integer getBoxWeight(){
        Integer result = 0;
        for (T f: getFruits()){
            if (f!=null) {
                Integer value = f.getWeight();
                result = result + value;
            }
        }
        return result;
    }

    public Boolean compare(Box<Apple> box){
        if(this.getBoxWeight().intValue() == box.getBoxWeight().intValue()) return true;
        return false;
    }

    public void toEmptyList(Box<T> box){
        System.out.println("In needed box before: " + this.getBoxWeight());
        System.out.println("In needed box before: " + box.getBoxWeight());
        for(T f: box.getFruits()){
            this.getFruits().add(f);
        }
        box.getFruits().clear();
        System.out.println("In needed box after: " + this.getBoxWeight());
        System.out.println("In needed box after: " + box.getBoxWeight());
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }
}
