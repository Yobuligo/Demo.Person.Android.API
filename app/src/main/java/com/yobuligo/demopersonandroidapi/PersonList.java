package com.yobuligo.demopersonandroidapi;

import java.util.ArrayList;
import java.util.List;

public class PersonList implements IPersonList {

    private List<Person> persons = new ArrayList<Person>();

    @Override
    public void addPerson(Person person) {
        persons.add(person);
    }

    @Override
    public void removePerson(Person person) {
        persons.remove(person);
    }

    @Override
    public List<Person> findAll() {
        return persons;
    }

    @Override
    public Person findById(Long id) {
        for (Person person : persons) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }
}
