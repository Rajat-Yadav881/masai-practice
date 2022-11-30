package com.usecases;

import com.model.FullTimeInstructor;
import com.model.PartTimeInstructor;
import com.utility.EMUtility;

import javax.persistence.EntityManager;

public class InsertDetail {
    EntityManager em = EMUtility.provideEntityManager();

    FullTimeInstructor instructor = new FullTimeInstructor("A",688787,"tyu@gmail.com");
    PartTimeInstructor
}
