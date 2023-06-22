//package org.example.сontrollers;
//
//import org.example.models.Person;
//import org.example.services.PersonService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/person")
//public class PersonResource {
//    private final PersonService personService;
//
//    public PersonResource(PersonService personService) {
//        this.personService = personService;
//    }
//
//    @GetMapping("/all")
//    public ResponseEntity<List<Person>> getAllPersons(){
//        List<Person> persons = personService.findAllPersons();
//        return new ResponseEntity<>(persons, HttpStatus.OK);
//    }
//
//    @GetMapping("/find/{id}")
//    public ResponseEntity<Person> getPersonById(@PathVariable("id") String id){
//        Person person = personService.findPersonById(id);
//        return new ResponseEntity<>(person, HttpStatus.OK);
//    }
//
//    @PostMapping("/add")
//    public ResponseEntity<Person> addPerson(@RequestBody Person person) {
//        Person newPerson = personService.addPerson(person);
//        return new ResponseEntity<>(newPerson, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/update")
//    public ResponseEntity<Person> updatePerson(@RequestBody Person person) {
//        Person updatePerson = personService.updatePerson(person);
//        return new ResponseEntity<>(updatePerson, HttpStatus.OK);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<?> deletePerson(@PathVariable("id") String id) {
//        personService.deletePerson(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//}
//
