public class Cat extends Animal{

    private String sound;
    
    public Cat(long id, String name, int age, double weight){
        super(id, name, age, weight);
        addAbility("Agility");
    }

    @Override
    public String sound(){
        this.sound = "meow";
        return this.sound;
    }

    @Override
    public String toString(){
        return "Name:" + getName() +
                "\nSound: " + sound()+
                "\nAbilities: " + getAbilities();
    }

  
    
}
