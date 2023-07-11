public class Dog extends Animal{
    String creature = "dog";
    Boolean run = true;
    Boolean fly = false;
    Boolean swim = true;

    public Dog(String name, String color, Integer age, Boolean vaccination,
            String species, Integer legsCount, String creature, Boolean run, Boolean fly, Boolean swim) {
        super(name, color, age, vaccination, species, legsCount, creature, run, fly, swim);

    }
}