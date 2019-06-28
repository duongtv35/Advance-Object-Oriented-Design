package Animal_Interface_Edible.Animal;

import Animal_Interface_Edible.Animal.Edible.Edible;

public class Chicken extends Animal implements Edible {


        @Override
        public String MakeSound() {
            return "Chicken : cluck click" ;
        }


        @Override
        public String howToEat() {
            return "could be fried";
        }

    }

