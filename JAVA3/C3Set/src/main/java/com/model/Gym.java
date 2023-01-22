package com.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Gym {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gym_id;
    private String gym_name;
    private int monthly_fee;
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "gyms")
    List<Person> persons = new ArrayList<>();
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    Trainer trainer;


    public int getGym_id() {
        return gym_id;
    }

    public void setGym_id(int gym_id) {
        this.gym_id = gym_id;
    }

    public String getGym_name() {
        return gym_name;
    }

    public void setGym_name(String gym_name) {
        this.gym_name = gym_name;
    }

    public int getMonthly_fee() {
        return monthly_fee;
    }

    public void setMonthly_fee(int monthly_fee) {
        this.monthly_fee = monthly_fee;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Gym(String gym_name, int monthly_fee) {
        this.gym_name = gym_name;
        this.monthly_fee = monthly_fee;
    }
}
