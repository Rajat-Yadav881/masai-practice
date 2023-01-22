package com.controller;

import com.exception.GymException;
import com.exception.TrainerException;
import com.model.Gym;
import com.model.Person;
import com.model.Trainer;
import com.service.FitnessServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class Presentation {
    @Autowired
    FitnessServiceImpl fservice;
    public void addGym(){
        Gym gym = new Gym("Build body",3000);
        fservice.addGym(gym);
    }
    public void registerPerson(){
        Person person = new Person("rajat","rajat@gmail.com","35343544445");
        int gym_id = 1;
        try {
            fservice.registerPerson(person,gym_id);
        }catch (GymException e){
            System.out.println(e.getMessage());
        }
    }

    public void registerTrainer(){
        Trainer trainer = new Trainer("raja",4,"raja@45gmail.com");
        fservice.registerTrainer(trainer);
    }

    public void assignTrainerWithGym(){
        int trainer_id = 1;
        int gym_id = 1;
        try {
            fservice.assignTrainerWithGym(trainer_id,gym_id);
        }catch (TrainerException e){
            System.out.println(e.getMessage());
        }
    }

    public List<Person> getAllThePersonByGymName(){
        String gym_name = "building_blocker";
        List<Person> persons = null;
        try {
            persons = fservice.getAllthePersonByGymName(gym_name);
            if(!persons.isEmpty()){
                persons.forEach(person -> {
                    System.out.println(person);
                });
            }else {
                throw new GymException("no trainer assign to this Gym");
            }
        }catch (GymException e){
            System.out.println(e.getMessage());
        }
        return persons;
    }
}
