//package org.example.services;
//
//import jakarta.transaction.Transactional;
//import org.example.exceptions.PersonNotFoundException;
//import org.example.models.Person;
//import org.example.repositories.PersonMongoRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.UUID;
//
//@Service
//@Transactional
//public class PersonService {
//    private final PersonMongoRepository personMongoRepository;
//
//    @Autowired
//    public PersonService(PersonMongoRepository personMongoRepository) {
//        this.personMongoRepository = personMongoRepository;
//    }
//
//    public Person addPerson(Person person){
//        person.setPersonCode(UUID.randomUUID().toString());
//        return personMongoRepository.save(person);
//    }
//
//    public List<Person> findAllPersons(){
//        return personMongoRepository.findAll();
//    }
//
//    public Person updatePerson(Person employee){
//        return personMongoRepository.save(employee);
//    }
//
//    public Person findPersonById(String id){
//        return personMongoRepository.findPersonById(id)
//                .orElseThrow(() -> new PersonNotFoundException("User by id " + id + " was not found"));
//    }
//
//    public void deletePerson(String id){
//        personMongoRepository.deletePersonById(id);
//    }
//
//}
//
