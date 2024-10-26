package com.nice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nice.entity.*;

@Repository
public interface CourseCRSJPARepository extends JpaRepository<Course, Long>{
	
	


}
