package com.ramgopal.repository;
import org.springframework.data.repository.CrudRepository;  
import com.ramgopal.model.Student;  
public interface StudentRepository extends CrudRepository<Student, Integer>  
{  
}  