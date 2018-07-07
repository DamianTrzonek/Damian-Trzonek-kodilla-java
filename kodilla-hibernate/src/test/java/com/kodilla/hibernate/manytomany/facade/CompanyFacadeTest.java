package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyFacadeTest {
    @Autowired
    private CompanyFacade companyFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

   @Test
   @Transactional
    public void retrieveCompaniesWithNameLikeCod() {
       //Initial Cleanup
       companyDao.deleteAll();
       //Given
        Company MathCoders = new Company("Math Coders");
        Company CodeEngineers = new Company("Code Engineers");
        Company CodSellingFactory = new Company("Cod Selling Factory");
        Company CodyIdeas = new Company("Cody Ideas");
        Company enigmas = new Company("Enigmas");
        Company broBros = new Company("Bro Bros");
        Company studioInc = new Company("Studio Inc");

        companyDao.save(MathCoders);
        companyDao.save(CodeEngineers);
        companyDao.save(CodSellingFactory);
        companyDao.save(CodyIdeas);
        companyDao.save(enigmas);
        companyDao.save(broBros);
        companyDao.save(studioInc);
        //When
        List<Company> companiesWithCodInName = companyFacade.retrieveCompaniesWithNameLikeCod();
        //Then
       System.out.println(companiesWithCodInName.toString());
        assertEquals(4, companiesWithCodInName.size());
    }

    @Test
    @Transactional
    public void retrieveEmployeesWithLastnameLikeSki() {
       //Initial Cleanup
        employeeDao.deleteAll();
        //Given
        Employee robertTarnowski = new Employee("Robert", "Tarnowski");
        Employee gniewomirSkiba = new Employee("Gniewomir", "Skiba");
        Employee gregorInskigg = new Employee("Gregor", "Inskigg");
        Employee thomasNowakPodolski = new Employee("Thomas", "Nowak-Podolski");
        Employee annaKuklinsky = new Employee("Anna", "Kuklinsky");
        Employee ritaPietrovna = new Employee("Rita", "Pietrovna");

        employeeDao.save(robertTarnowski);
        employeeDao.save(gniewomirSkiba);
        employeeDao.save(gregorInskigg);
        employeeDao.save(thomasNowakPodolski);
        employeeDao.save(annaKuklinsky);
        employeeDao.save(ritaPietrovna);
        //When
        List<Employee> employeesWithSkiInLastName = companyFacade.retrieveEmployeesWithLastnameLikeSki();
        //Then
        System.out.println(employeesWithSkiInLastName.toString());
        assertEquals(4, employeesWithSkiInLastName.size());

    }
}