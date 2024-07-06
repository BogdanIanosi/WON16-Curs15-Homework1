package com.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("John", "Doe", 25, "Oradea"),
                new Person("Jane", "Smith", 30, "Cluj"),
                new Person("Alice", "Johnson", 17, "Oradea"),
                new Person("Bob", "Brown", 20, "Cluj"),
                new Person("Anna", "Davis", 35, "Bucharest")
        );

        PersonService personService = new PersonService(persons);

        System.out.println("All person names: " + personService.getAllPersonNames());
        System.out.println("All majors: " + personService.getAllMajors());
        System.out.println("All persons from Oradea: " + personService.getAllPersonsFromOradea());
        System.out.println("All persons from Oradea or Cluj: " + personService.getAllPersonsFromOradeaOrCluj());
        System.out.println("All first names capitalized: " + personService.getAllFirstNamesCapitalized());
        System.out.println("All person names with first letter of last name: " + personService.getAllPersonNamesWithFirstLetterOfLastName());
        System.out.println("All persons with age between 18 and 60: " + personService.getAllPersonsWithAgeBetween18And60());
        System.out.println("All persons with first name starting with A: " + personService.getAllPersonsWithFirstNameStartingWithA());
        System.out.println("All unique first names: " + personService.getAllUniqueFirstNames());
        System.out.println("Persons sorted by first name: " + personService.sortPersonsByFirstName());
        System.out.println("Persons sorted by last name: " + personService.sortPersonsByLastName());
        System.out.println("Persons sorted by first name, last name, and age: " + personService.sortPersonsByFirstNameLastNameAndAge());
    }
}

