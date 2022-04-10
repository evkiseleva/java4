package com.java.laba4;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static org.apache.commons.lang3.StringUtils.split;

public class Program {

    public static ArrayList<Person> people() throws IOException
    {
        try (CSVReader reader = new CSVReader(new FileReader("foreign_names.csv"))) {
            ArrayList<Person> people = new ArrayList<>();
            Divisions divisions = new Divisions();
            String[] record = reader.readNext();
            while (record!= null && (record = reader.readNext()) != null) {

                record = split(String.join("",record), ';');
                Person person = new Person();
                person.setId(Integer.parseInt(record[0]));
                person.setName(record[1]);
                person.setGender(record[2]);
                person.setBDate(record[3]);
                person.setDivision(divisions.getId(record[4]), record[4]);
                person.setSalary(Double.parseDouble(record[5]));
                people.add(person);

            }
            return people;
        } catch (CsvValidationException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) throws IOException {
        ArrayList<Person> people = people();
        for (int i=0; i<people.size(); i++) {
            System.out.println(people.get(i).getPerson());
        }
    }

}