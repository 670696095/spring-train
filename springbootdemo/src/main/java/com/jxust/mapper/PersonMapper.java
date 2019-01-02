package com.jxust.mapper;

import com.jxust.entity.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonMapper {
    List<Person> findPerson();
    Person   getPersonById(Integer id);
    int  InsertPerson(Person person);
    int  DeletePerson(int id);
    int  UpdatePerson(Person person);
}
