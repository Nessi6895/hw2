package ru.sbt.hw2.model;

/**
 * Created by Артем on 24.07.2016.
 */
public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(String name, boolean man) {
        this.man = man;
        this.name = name;
    }

    public boolean marry(Person person){
        if(this.man != person.man && this.spouse != person){
            if(this.spouse != null) this.divorce();
            if(person.spouse != null) person.divorce();
            this.spouse = person;
            person.spouse = this;
            return true;
        }
        return false;
    }

    public boolean divorce(){
        if(this.spouse != null){
            this.spouse.spouse = null;
            this.spouse = null;
            return true;
        }
        return false;
    }

    public String getSpouse() {
        return this.spouse.name.equals(null) ? "null" : this.spouse.name;
    }
}
