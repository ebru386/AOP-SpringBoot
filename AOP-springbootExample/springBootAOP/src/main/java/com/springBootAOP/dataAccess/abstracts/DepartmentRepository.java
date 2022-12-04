package com.springBootAOP.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBootAOP.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
