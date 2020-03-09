package com.yobuligo.demopersonandroidapi;

import java.util.List;

public interface IPersonList {

    void addPerson(Person person);

    void removePerson(Person person);

    List<Person> findAll();

    Person findById(Long id);

}
