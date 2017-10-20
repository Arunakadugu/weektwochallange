package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Experience newExperience = new Experience();
        Education newEducation = new Education();
        Person newPerson = new Person();
        Skills newSkills = new Skills();
        ArrayList<Experience> experiencelist = new ArrayList<>();
        ArrayList<Education> educationlist = new ArrayList<>();
        ArrayList<Skills> skilllist = new ArrayList<>();
        ArrayList<Person> personlist = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        String answer = " ";
        int count = 1;

            System.out.print("enter person  name:");
            newPerson.setName(keyboard.nextLine());

            System.out.println("enter person email:");
            newPerson.setEmail(keyboard.nextLine());
            System.out.println("---------------------");
            System.out.println(" " +newPerson.getName()); System.out.println(" " +newPerson.getEmail());
            System.out.println("......................");
        do {
            newEducation = new Education();
            System.out.println("education");

            System.out.println("degree:");
            newEducation.setDegree(keyboard.nextLine());
            System.out.println("college name:");
            newEducation.setCollegeName(keyboard.nextLine());
           // answer = keyboard.nextLine();
            System.out.println("year of graduation:");
            newEducation.setYearOfGraduation(keyboard.nextLine());
            answer = keyboard.nextLine();
            educationlist.add(newEducation);

           }while((answer.equalsIgnoreCase("yes"))||(answer.equalsIgnoreCase("no")));


            System.out.println("education: " +newEducation.getDegree());
            System.out.println( " " +newEducation.getCollegeName());
            System.out.println(" "+newEducation.getYearOfGraduation());
            System.out.println("................");

           do
           {
            newExperience = new Experience();
            System.out.println("experience:");
            newExperience.setExperience(keyboard.nextLine());
            System.out.println("jobTitle");
            newExperience.setTitleOfJob(keyboard.nextLine());
            System.out.println("years of experience");
            newExperience.setYearsOfExp(keyboard.next());
            answer = keyboard.nextLine();
            System.out.println(" enter year(MM/YYYY - MM/YYYY)");
            newExperience.setYear(keyboard.nextLine());
            answer = keyboard.nextLine();
            experiencelist.add(newExperience);
        }while((answer.equalsIgnoreCase("yes"))||(answer.equalsIgnoreCase("no")));

        System.out.println(" " +newExperience.getTitleOfJob()+ " " +newExperience.getYearsOfExp()
                + " " +newExperience.getYear());
        for(count = 1; count< 2;count++)
         {
            newSkills = new Skills();
            System.out.println("skills:");
            //System.out.println("listOfSkills");
            newSkills.setListOfSkills(keyboard.nextLine());
            answer = keyboard.nextLine();
            skilllist.add(newSkills);
           // System.out.println(" " +newSkills.getListOfSkills());
        }//while((answer.equalsIgnoreCase("yes"))||(!answer.equalsIgnoreCase("no")));
        System.out.println(".................");
        System.out.println(" " + newPerson.getName());
        System.out.println( " " + newPerson.getEmail());
        System.out.println(" EDUCATION");
        System.out.println(" " + newEducation.getDegree());
        System.out.println(" "  +newEducation.getCollegeName());
        System.out.println(" " +newEducation.getYearOfGraduation());
        System.out.println("EXPERIENCE");
        System.out.println( " " + newExperience.getTitleOfJob());
        System.out.println(" " +newExperience.getYearsOfExp());
        System.out.println(" "+newExperience.getYear());
        System.out.println("SKILLS");
        System.out.println(" " + newSkills.getListOfSkills());
        }
    }

