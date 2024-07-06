package com.example;

import java.util.*;
import java.util.stream.Collectors;

public class PersonService {
    private List<Person> persons;

    public PersonService(List<Person> persons) {
        this.persons = persons;
    }

    public List<String> getAllPersonNames() {
        return persons.stream()
                .map(person -> person.getFirstName() + " " + person.getLastName())
                .collect(Collectors.toList());
    }

    public List<Person> getAllMajors() {
        return persons.stream()
                .filter(person -> person.getAge() >= 18)
                .collect(Collectors.toList());
    }

    public List<Person> getAllPersonsFromOradea() {
        return persons.stream()
                .filter(person -> "Oradea".equals(person.getCity()))
                .collect(Collectors.toList());
    }

    public List<Person> getAllPersonsFromOradeaOrCluj() {
        return persons.stream()
                .filter(person -> "Oradea".equals(person.getCity()) || "Cluj".equals(person.getCity()))
                .collect(Collectors.toList());
    }

    public List<String> getAllFirstNamesCapitalized() {
        return persons.stream()
                .map(person -> person.getFirstName().toUpperCase())
                .collect(Collectors.toList());
    }

    public List<String> getAllPersonNamesWithFirstLetterOfLastName() {
        return persons.stream()
                .map(person -> person.getFirstName() + " " + person.getLastName().charAt(0) + ".")
                .collect(Collectors.toList());
    }

    public List<Person> getAllPersonsWithAgeBetween18And60() {
        return persons.stream()
                .filter(person -> person.getAge() > 18 && person.getAge() < 60)
                .collect(Collectors.toList());
    }

    public List<Person> getAllPersonsWithFirstNameStartingWithA() {
        return persons.stream()
                .filter(person -> person.getFirstName().startsWith("A"))
                .collect(Collectors.toList());
    }

    public List<String> getAllUniqueFirstNames() {
        return persons.stream()
                .map(Person::getFirstName)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<Person> sortPersonsByFirstName() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getFirstName))
                .collect(Collectors.toList());
    }

    public List<Person> sortPersonsByLastName() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getLastName))
                .collect(Collectors.toList());
    }

    public List<Person> sortPersonsByFirstNameLastNameAndAge() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getFirstName)
                        .thenComparing(Person::getLastName)
                        .thenComparing(Person::getAge))
                .collect(Collectors.toList());
    }
}
