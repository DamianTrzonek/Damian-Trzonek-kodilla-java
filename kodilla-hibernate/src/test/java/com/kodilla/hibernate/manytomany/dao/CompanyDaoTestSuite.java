package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.CompanyDao;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Initial Cleanup
        companyDao.deleteAll();
        //Given
        Employee johnSmith = new Employee("John","Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMasters.getEmployees().add(stephanieClarckson);
        dataMasters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMasters);
        lindaKovalsky.getCompanies().add(dataMasters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMasters);
        int dataMastersId = dataMasters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMastersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMastersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testNamedQueries() {
        //Given
        companyDao.deleteAll();
        employeeDao.deleteAll();

        Employee johnSmith = new Employee("John","Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee andySmith = new Employee("Andy", "Smith");
        Employee camillaKovalsky = new Employee("Camilla","Kovalsky");
        Employee joshuaSmith = new Employee("Joshua", "Smith");

        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company greyMatter = new Company("Grey Matter");
        Company greenLight = new Company("Green Light");
        Company datCode = new Company("Dat Code");
        Company codeVaders = new Company("Code Vaders");

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMasters);
        int dataMastersId = dataMasters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();
        companyDao.save(greenLight);
        int greenLightId = greenLight.getId();
        companyDao.save(datCode);
        int datCodeId = datCode.getId();
        companyDao.save(codeVaders);
        int codeVadersId = codeVaders.getId();

        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();
        employeeDao.save(stephanieClarckson);
        int stephanieClarcksonId = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int lindaKovalskyId = lindaKovalsky.getId();
        employeeDao.save(andySmith);
        int andySmithId = andySmith.getId();
        employeeDao.save(camillaKovalsky);
        int camillaKovalskyId = camillaKovalsky.getId();
        employeeDao.save(joshuaSmith);
        int joshuaSmithId = joshuaSmith.getId();


        //When
       List<Company> companiesStaringWithLettersDat = companyDao.retrieveCompaniesWhereName("Dat");
       List<Company> companiesStartingWithLettersSof = companyDao.retrieveCompaniesWhereName("Sof");
       List<Company> companiesStartingWithLettersGre = companyDao.retrieveCompaniesWhereName("Gre");
       List<Company> companiesStartingWithLettersCod = companyDao.retrieveCompaniesWhereName("Cod");
       List<Employee> listOfSmith =  employeeDao.retrieveEmployeesWithLastname("Smith");
       List<Employee> listOfKovalsky = employeeDao.retrieveEmployeesWithLastname("Kovalsky");
       List<Employee> listofClarckson = employeeDao.retrieveEmployeesWithLastname("Clarckson");

        //Then
       try{
           Assert.assertEquals(2, companiesStaringWithLettersDat.size());
        Assert.assertEquals(1, companiesStartingWithLettersSof.size());
        Assert.assertEquals(2, companiesStartingWithLettersGre.size());
        Assert.assertEquals(1, companiesStartingWithLettersCod.size());
        Assert.assertEquals(3, listOfSmith.size());
        Assert.assertEquals(2, listOfKovalsky.size());
        Assert.assertEquals(1, listofClarckson.size());
    } catch (Exception e) {
           e.printStackTrace();
       }
       //CleanUp
        try {
           companyDao.delete(softwareMachineId);
           companyDao.delete(dataMastersId);
           companyDao.delete(greyMatterId);
           companyDao.delete(greenLightId);
           companyDao.delete(datCodeId);
           companyDao.delete(codeVadersId);
           employeeDao.delete(johnSmithId);
           employeeDao.delete(stephanieClarcksonId);
           employeeDao.delete(lindaKovalskyId);
           employeeDao.delete(andySmithId);
           employeeDao.delete(camillaKovalskyId);
           employeeDao.delete(joshuaSmithId);
        } catch (Exception e) {
           e.printStackTrace();
        }
       }
}
