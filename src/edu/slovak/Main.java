package edu.slovak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 *  1. Task2: IMPLEMENT THE FOLLOWING INTERFACE.
 *
 *
 *  @author Vladyslav Zavada KHNUE
 *  @version 1.0 [23] [06] [2020]
 *  Classname Main
 *
 **/
public class Main {

    public static void main(String[] args) {

        CompanyImpl service = new CompanyImpl();

        // create Company objects
        Company chief = new Company("chief", null, 60);
        Company accounting = new Company("accounting", null, 25);
        Company lawyer = new Company("lawyer", chief, 20);
        Company developer1 = new Company("developer1", chief, 5);
        Company tester = new Company("tester", tester, 4);
        Company developer2 = new Company("frontEnd", developer2, 4);

        // add all companies to ArrayList
        List<Company> companies = new ArrayList<>(
                Arrays.asList(
                        chief,
                        accounting,
                        lawyer,
                        developer1,
                        tester,
                        developer2
                )
        );

        System.out.println("All existing companies: ");
        for (Company company : companies) {
            System.out.println(company.getName());
        }
    }
}
