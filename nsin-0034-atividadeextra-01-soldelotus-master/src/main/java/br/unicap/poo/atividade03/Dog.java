public class Dog extends Animal{
    
    private String sound;
    
    public Dog(long id, String name, int age, double weight){
        super(id, name, age, weight);
        addAbility("Sniff");
    }

    @Override
    public String sound(){
        this.sound = "au";
        return this.sound;
    }

    @Override
    public String toString(){
        return "Name:" + getName() +
                "\nSound: " + sound()+
                "\nAbilities: " + getAbilities();
    }
    
}

