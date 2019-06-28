package Animal_Interface_Edible.Animal;


import Animal_Interface_Edible.Animal.Edible.Edible;
import Animal_Interface_Edible.Animal.fruit.Apple;
import Animal_Interface_Edible.Animal.fruit.Fruit;
import Animal_Interface_Edible.Animal.fruit.Orange;

public class test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.MakeSound());
            if(animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());



            }

        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit:fruits) {
            System.out.println(fruit.howToEat());


        }

    }

}
