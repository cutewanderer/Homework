package factory; //фабрика, для того чтобы не создавать каждый раз объекты в майне

import animals.AbsAnimal;
import animals.birds.Duck;
import animals.pets.Cat;
import animals.pets.Dog;
import data.AnimalTypeData;
import data.ColorData;

public class AnimalFactory {

    private String name = "";
    private int age = -1;
    private int weight = -1;
    private ColorData color = null;

    public AnimalFactory(String name, int age, int weight, ColorData colorData) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = colorData;
    }

    public AbsAnimal create(AnimalTypeData animalTypeData) {
        switch (animalTypeData) {
            case DOG: {
                return new Dog(name,age,weight,color);
            }
            case CAT:{
                return new Cat(name,age,weight,color);
            }
            case DUCK:{
                return new Duck(name,age,weight,color);
            }
        }
        throw new RuntimeException(String.format("Animals %s не поддерживается", animalTypeData.name().toLowerCase()));
    }
}
