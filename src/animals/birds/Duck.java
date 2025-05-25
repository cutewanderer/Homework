package animals.birds;

import animals.AbsAnimal;
import data.ColorData;

public class Duck extends AbsAnimal {
    public Duck(String name, int age, int weight, ColorData colorData) {
        super(name, age, weight, colorData);
    }

    public void fly() {
        System.out.println("Я лечу");
    }
}
