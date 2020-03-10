package com.yobuligo.demo_person_android_api;

import java.util.List;

public interface IPersonList {

    void addPerson(Person person);

    void removePerson(Person person);

    List<Person> findAll();

    Person findById(Long id);

}
