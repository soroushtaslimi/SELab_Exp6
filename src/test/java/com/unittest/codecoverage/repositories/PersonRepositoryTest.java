package com.unittest.codecoverage.repositories;

import com.unittest.codecoverage.models.Person;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PersonRepositoryTest {
    @Test
    public void testInsert_whenNull_ExpectNullPointerException(){
        PersonRepository personRepository = new PersonRepository();
        try {
            personRepository.insert(null);
        } catch (NullPointerException ignored){
            return;
        }
        Assertions.fail();
    }

    @Test
    public void testInsert_whenPerson_ExpectSamePerson(){
        Person person = new Person();
        PersonRepository personRepository = new PersonRepository();

        Person result = personRepository.insert(person);
        Assertions.assertEquals(person, result);
    }

    @Test
    public void testUpdate_whenNull_ExpectNullPointerException(){
        PersonRepository personRepository = new PersonRepository();
        try {
            personRepository.update(null);
        } catch (NullPointerException ignored){
            return;
        }
        Assertions.fail();
    }

    @Test
    public void testDelete_whenNull_ExpectNullPointerException(){
        PersonRepository personRepository = new PersonRepository();
        try {
            personRepository.delete(null);
        } catch (NullPointerException ignored){
            return;
        }
        Assertions.fail();
    }

    @Test
    public void testGet_whenNull_ExpectNullPointerException(){
        PersonRepository personRepository = new PersonRepository();
        try {
            personRepository.get(null);
        } catch (NullPointerException ignored){
            return;
        }
        Assertions.fail();
    }

}
