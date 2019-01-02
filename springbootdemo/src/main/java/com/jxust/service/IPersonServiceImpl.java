package com.jxust.service;

import com.jxust.entity.Person;
import com.jxust.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author  czw
 */
@Service
public class IPersonServiceImpl implements IPersonService {
    @Autowired
    private  PersonMapper personMapper;
    @Override
    public List<Person> findPerson() {
        return personMapper.findPerson();
    }

    @Override
    public Person getPersonById(Integer id) {
        Person person =  personMapper.getPersonById(id);
        return person;
    }

    @Override
    public int InsertPerson(Person person) {
        int x = personMapper.InsertPerson(person);
        return x;
    }

    @Override
    public int DeletePerson(int id) {
        int test = personMapper.DeletePerson(id);

        return test;
    }

    @Override
    public int UpdatePerson(Person person) {
        int test =personMapper.UpdatePerson(person);
        return test;
    }
}
