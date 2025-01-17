public class App {
    public static void main(String[] args) throws Exception {
        
        Zoo zoo = new Zoo();

        Bird a1 = new Bird(1, "Bentivi", 2, 1.5);
        zoo.addAnimal(a1);
        System.out.println(a1);
        System.out.println(a1.performAbility("Agility"));
    
        Cat a2 = new Cat(2, "Garfield", 5, 5);
        zoo.addAnimal(a2);
        System.out.println(a2);
        System.out.println(a2.performAbility("Agility"));
    
        Dog a3 = new Dog(3, "Mel", 5, 7);
        zoo.addAnimal(a3);
        System.out.println(a3);
        System.out.println(a3.performAbility("Sniff"));

        System.out.println(zoo.listAnimals());
    
    }
}
