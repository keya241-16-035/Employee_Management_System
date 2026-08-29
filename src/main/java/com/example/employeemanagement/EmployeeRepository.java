package com.example.employeemanagement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Chapter 5: Search employees by name (case-insensitive substring match)
    List<Employee> findByNameContainingIgnoreCase(String name);
}
