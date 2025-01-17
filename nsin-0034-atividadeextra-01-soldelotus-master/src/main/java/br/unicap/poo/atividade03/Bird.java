package br.unicap.poo.atividade03;

public class Bird extends Animal{
    private String sound = sound(getName());

    Birds(long id, String name, int age, double weight){
        super(id, name, age, weight);
        addAbility("Fly");
    }

    @Override
    public String sound(){
        this.sound = "Piu";
        return this.sound;
    }

    @Override
    public String toString(){
        return "Name:" + getName() +
                "\nSound: " + sound()+
                "\nAbilities: " + getAbilities();
    }
    

}
