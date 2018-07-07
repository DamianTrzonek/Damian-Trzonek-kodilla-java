package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> retrieveCompaniesWithNameLikeCod() {
        LOGGER.info("Searching for Companies with 'Cod' in name...");
        return companyDao.retrieveCompaniesWhereNameLikeCod();
    }

    public List<Employee> retrieveEmployeesWithLastnameLikeSki() {
        LOGGER.info("Searching for Employees with 'ski' in name...");
        return employeeDao.retrieveEmployeesWithLastnameLikeSki();
    }
}
