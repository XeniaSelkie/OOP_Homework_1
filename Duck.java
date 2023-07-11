public class Duck extends Animal {

    String creature = "duck";
    Boolean run = true;
    Boolean fly = true;
    Boolean swim = true;

    public Duck(String name, String color, Integer age, String creature, Boolean run, Boolean fly, Boolean swim) {

        super(name, color, age, creature, run, fly, swim);
        this.creature = creature;
        this.run = true;
        this.fly = fly;
        this.swim = swim;
    }

    public Duck(String name, Integer age) {

        super(name, age);
        this.creature = "duck";
        this.run = true;

    }

}