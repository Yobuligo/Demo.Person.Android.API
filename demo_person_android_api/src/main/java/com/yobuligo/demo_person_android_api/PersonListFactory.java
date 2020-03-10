package com.yobuligo.demo_person_android_api;

public class PersonListFactory implements IPersonListFactory {
    @Override
    public IPersonList createPersonList() {
        return new PersonList();
    }
}
