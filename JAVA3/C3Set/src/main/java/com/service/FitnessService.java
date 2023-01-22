package com.service;

import com.exception.GymException;
import com.exception.TrainerException;
import com.model.Gym;
import com.model.Person;
import com.model.Trainer;

import java.util.List;

public interface FitnessService {
    public void addGym(Gym gym);
    public void registerPerson(Person person,int gym_id)throws GymException;
    public void registerTrainer(Trainer trainer);
    public void assignTrainerWithGym(int trainer_id,int gym_id)throws TrainerException;
    public List<Person> getAllthePersonByGymName(String gym_name)throws GymException;
}
