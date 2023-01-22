package com.repository;

import com.exception.GymException;
import com.exception.TrainerException;
import com.model.Gym;
import com.model.Person;
import com.model.Trainer;
import com.util.EmUtility;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
@Repository
public class FitnessDaoImpl implements FitnessDao{
    @Override
    public void addGym(Gym gym) {
        EntityManager em = EmUtility.provideEntityManager();
        em.getTransaction().begin();
        em.persist(gym);
        em.getTransaction().commit();
        em.close();
        System.out.println(gym);
    }

    @Override
    public void registerPerson(Person person, int gym_id) throws GymException {
        EntityManager em = EmUtility.provideEntityManager();
        em.getTransaction().begin();
        Gym gym = em.find(Gym.class,gym_id);
        if(gym!=null){
            person.getGyms().add(gym);
            gym.getPersons().add(person);
            em.merge(gym);
            System.out.println(gym);
            System.out.println(gym.getPersons());
            System.out.println("==================");
            System.out.println(person);
            System.out.println(person.getGyms());
        }else {
            throw new GymException("Gym not found ");
        }
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void rigisterTrainer(Trainer trainer) {
        EntityManager em = EmUtility.provideEntityManager();
        em.getTransaction().begin();
        em.persist(trainer);
        em.getTransaction().commit();
        em.close();

    }

    @Override
    public void assignTrainerWithGym(int trainer_id, int gym_id) throws GymException,TrainerException {
        EntityManager em = EmUtility.provideEntityManager();
        em.getTransaction().begin();

        Trainer trainer = em.find(Trainer.class,trainer_id);
        if (trainer!=null){
            Gym gym = em.find(Gym.class,gym_id);
            if (gym!= null){
                gym.setTrainer(trainer);
                trainer.getGyms().add(gym);
                em.persist(trainer);

                System.out.println(gym);
                System.out.println(gym.getTrainer());
                System.out.println("====================");
                System.out.println(trainer);
                System.out.println(trainer.getGyms());
            }else {
                throw new GymException("gym not found");
            }
        }else {
            throw new TrainerException("trainer not found");
        }
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Person> getAllThePersonByGymName(String gym_name) throws GymException {
        EntityManager em = EmUtility.provideEntityManager();
        String link = "from Gym g where g.gym_name = : name";
        Query query = em.createQuery(link);
        query.setParameter("name",gym_name);
        List<Gym> gym = query.getResultList();
        List<Person> persons = new ArrayList<>();
        if (gym.isEmpty()){
            throw new GymException("no Gym found");
        }else{
            persons = gym.get(0).getPersons();
            System.out.println(persons);
        }
        em.close();
        return persons;
    }
}
