package org.testprojectimransir.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.testprojectimransir.entity.Employee;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Long> {
}
