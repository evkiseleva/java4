package com.java.laba4;
//import java.io.FileReader;
//import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class Program {

    public static void main(String[] args) throws IOException {
        try (CSVReader reader = new CSVReader(new FileReader("file.csv"))) {
            ArrayList<Person> people = new ArrayList<>();
            Divisions divisions = new Divisions();
            String[] record;
            while ((record = reader.readNext()) != null) {
                Person person = new Person();
                person.setId(Integer.parseInt(record[0]));
                person.setName(record[1]);
                person.setGender(record[2]);
                person.setBDate(record[3]);
                person.setDivision(divisions.getId(record[4]), record[4]);
                person.setSalary(Double.parseDouble(record[5]));
                people.add(person);
            }
            for (Person person : people)
                person.printPerson();
            reader.close();
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }


    }

}