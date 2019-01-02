package com.jxust.service;

import com.jxust.entity.Person;

import java.util.List;

public interface IPersonService {
    List<Person> findPerson();

    Person  getPersonById(Integer id);

    int InsertPerson(Person person);

    int DeletePerson(int  id);
    int UpdatePerson(Person person);

}

