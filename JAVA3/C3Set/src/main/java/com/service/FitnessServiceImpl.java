package com.service;

import com.exception.GymException;
import com.exception.TrainerException;
import com.model.Gym;
import com.model.Person;
import com.model.Trainer;
import com.repository.FitnessDao;
import com.repository.FitnessDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FitnessServiceImpl implements FitnessService{
    @Autowired
    FitnessDaoImpl dao;
    @Override
    public void addGym(Gym gym) {
        dao.addGym(gym);
    }

    @Override
    public void registerPerson(Person person, int gym_id) throws GymException {
        dao.registerPerson(person,gym_id);
    }

    @Override
    public void registerTrainer(Trainer trainer) {
        dao.rigisterTrainer(trainer);
    }

    @Override
    public void assignTrainerWithGym(int trainer_id, int gym_id) throws TrainerException {
        try {
            dao.assignTrainerWithGym(trainer_id,gym_id);
        } catch (GymException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Person> getAllthePersonByGymName(String gym_name) throws GymException {
        List<Person>personList = dao.getAllThePersonByGymName(gym_name);
        return personList;
    }
}
