package org.mma.training.java.springboot.cache.repository;

import org.mma.training.java.springboot.cache.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
