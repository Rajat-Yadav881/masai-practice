package com.dao;

import com.exception.EmployeeException;
import com.model.Employee;
import com.utility.EMUtility;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public Employee registerEmployee(Employee employee) throws EmployeeException {


        EntityManager em = EMUtility.provideEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(employee);
            em.getTransaction().commit();
        }catch (Exception e){
            e.getMessage();
            throw new EmployeeException("Error...");
        }

        em.close();

        return employee;
    }

    @Override
    public Employee getEmployeeById(int empId) throws EmployeeException {
        Employee employee = null;

        EntityManager manager = EMUtility.provideEntityManager();

        try {
            Query query = manager.createNamedQuery("findTheEmployee");
            query.setParameter("idh",empId);
            employee = (Employee) query.getSingleResult();
        }catch (Exception e){
            e.getMessage();
            throw new EmployeeException("error in ...");
        }

        return employee;
    }

//    @Override
//    public Employee deleteEmployeeById(int empId) throws EmployeeException {
//        Employee employee = null;
//
//        EntityManager mg = EMUtility.provideEntityManager();
//        try{
//
//        }catch (Exception e){
//            e.getMessage();
//            throw new EmployeeException();
//        }
//        Query query = mg.createQuery("delete from Employee e where e.empid = :idh");
//        query.setParameter("idh",empId);
//
//        employee = (Employee) query.getSingleResult();
//        query.executeUpdate();
//        return employee;
//    }

    public Employee deleteEmployeeById(int empId) throws EmployeeException {

        Employee employee= null;

        try{
            EntityManager em= EMUtility.provideEntityManager();
            employee = em.find(Employee.class,empId);
            em.getTransaction().begin();

            Query query= em.createQuery("DELETE FROM Employee e WHERE e.empId = :idh");
            query.setParameter("idh", empId);

            int row_deleted= query.executeUpdate();

//            employee = (Employee) query.getSingleResult();
            System.out.println("Row deleted :"+ row_deleted);
            em.getTransaction().commit();
            em.close();

        } catch (Exception e) {

            e.getMessage();
        }

        return employee;
}
    @Override
    public Employee updateEmployee(Employee employee) throws EmployeeException {
        Employee employee1 = null;

        EntityManager em = EMUtility.provideEntityManager();

        try {
            em.getTransaction().begin();
            Query query = em.createNativeQuery("UPDATE employee e SET e.name= :ename, e.address= :eaddress, e.salary= e.salary+ :increment WHERE e.empId=:id");

            query.setParameter("ename", employee.getName());
            query.setParameter("eaddress", employee.getAddress());
            query.setParameter("increment", employee.getSalary());
            query.setParameter("id", employee.getEmpid());

            int row_updated= query.executeUpdate();

            System.out.println("Row updated: "+row_updated );
            em.getTransaction().commit();
            em.close();
        }catch (Exception e){
            throw  new EmployeeException("error in updation..");
        }
        return employee;
    }
}
