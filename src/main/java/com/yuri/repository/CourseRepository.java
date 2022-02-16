package com.yuri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yuri.model.Course;

@Repository// interface para persistir objetos no banco, Course == entity and Long == id type
public interface CourseRepository extends JpaRepository<Course, Long>{

}
