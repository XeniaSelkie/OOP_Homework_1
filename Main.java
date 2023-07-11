public class Main {
    public static void main(String[] args) {
        
        System.out.println();
        Duck kudah = new Duck("Kudah", "gray", 22, "duck", true, true, true);
        kudah.toRun();
        kudah.toFly();
        kudah.toSwim();
        System.out.println();

        Cat slon = new Cat("Slon", "white", 33, true, "hz", 4, "cat", true, false, false);
        slon.toRun();
        slon.toFly();
        slon.toSwim();
        System.out.println();

        Dog mamonth = new Dog("mamonth", "yellow", 44, false, "Jeeraph", 4, "dog", true, false, true);
        mamonth.toRun();
        mamonth.toFly();
        mamonth.toSwim();
        System.out.println();
    }
}