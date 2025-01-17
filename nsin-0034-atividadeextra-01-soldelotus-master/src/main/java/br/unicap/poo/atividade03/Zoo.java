package br.unicap.poo.atividade03;

import java.util.ArrayList;

public class Zoo {

    ArrayList <Animal> listaAnimais;

    public Zoo() {
    listaAnimais = new ArrayList<>();
}

public void setAnimal(ArrayList<Animal> listaAnimais){
    this.listaAnimais = listaAnimais;
}

public ArrayList<Animal> getAnimals() {
    return animals;
}

    public void addAnimal(Animal animal){
        listaAnimais.add(animal);
    }


    public ArrayList<String> listAnimais() {
        ArrayList<String> arrayTemp = new ArrayList<>();
        for (int i = 0; i < listaAnimais.size(); i++) {
            Animal animal = listaAnimais.get(i);
            arrayTemp.add("ID: " + animal.getId() + "\nName: " + animal.getName() + "\nAge: " + animal.getAge() + "\nWeight: " + animal.getWeight()+"\n");
        }
        return arrayTemp;
    }
    

    public boolean removeAnimal(long id){
        for(int i=0; i<listaAnimais.size(); i++){
            if(animals.get(i).getId() == id){
                animals.remove(i);
                return true;
            }
        }
        System.out.println("Id not found.");
        return false;               
    }
    
}




