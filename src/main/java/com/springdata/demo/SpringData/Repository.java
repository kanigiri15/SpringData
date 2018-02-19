package com.springdata.demo.SpringData;

import com.springdata.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Person, Integer>{

}
