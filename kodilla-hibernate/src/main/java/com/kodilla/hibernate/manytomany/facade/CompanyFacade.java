package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.CompanyDao;
import com.kodilla.hibernate.manytomany.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NamedQuery;

@Service
public class CompanyFacade {
@Autowired
   private EmployeeDao employeeDao;

@Autowired
   private CompanyDao companyDao;


}
