package org.testprojectimransir.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.testprojectimransir.entity.Employee;
import org.testprojectimransir.repo.IEmployeeRepo;

import java.util.List;

@Service
public class EmployeeService {

@Autowired
    private IEmployeeRepo repo;

    public List<Employee> getAll(){
        return repo.findAll();
    }

    public Employee getById(long id){
        return repo.findById(id).orElse(null);
    }

    public void save(Employee employee){
        repo.save(employee);
    }

    public void delete(long id){
        repo.existsById(id);
    }


}
