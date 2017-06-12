package by.gsu.lesson4.animals;

public class Main {
    public static void main(String[] args) {
        FlyingThing parrot = new Parrot();
        parrot.fly();


        Pet cat1 = new Cat("Murzik", 123);
        Pet cat2 = new Cat("Murzik", 123);

        boolean eq = cat1.equals("asd");


        PetClinic clinic = new PetClinic();

        clinic.setCurrentPet(cat1);
        clinic.work();

        clinic.setCurrentPet(cat2);



    }

}
