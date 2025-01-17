package br.unicap.poo.atividade03;

import java.util.ArrayList;

public class Animal {

    private long id;
    private String name;
    private int age;
    private double weight;
    private ArrayList<String> abilities;
    
    Animal(long id, String name, int age, double weight){
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.abilities = new ArrayList<>();
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeigth(){
        this.weight = weight;
    }

    public ArrayList<String> getAbilities(){
        return abilities;
    }

    public void setAbilities(ArrayList<String>abilities){
        this.abilities = abilities;
    }

    public abstratic String sound();
      
    public String performAbility(String ability){
        if(ability.contains(ability)){
            return name + "can" + ability;
        } else {
            return name + "can't" + ability;
        }
}
}
