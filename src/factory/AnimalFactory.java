package factory;

import animals.AbsAnimal;
import data.AnimalTypeData;

public class AnimalFactory {
    public AbsAnimal create(AnimalTypeData animalTypeData) {
        switch (animalTypeData) {
            case DOG: {
                return new Dog(String name, int age, int weight, ColorData colorData)

            }
        }
    }
}
