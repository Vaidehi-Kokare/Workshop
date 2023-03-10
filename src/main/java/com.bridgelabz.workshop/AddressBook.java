package com.bridgelabz.workshop;

import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {
    ArrayList<Contact> c1 = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    void addContact() {
        System.out.println("Enter first name");
        String firstName = scanner.next();
        System.out.println("Enter last name");
        String lastName = scanner.next();
        System.out.println("Enter address");
        String address = scanner.next();
        System.out.println("Enter city");
        String city = scanner.next();
        System.out.println("Enter phone");
        String phone = scanner.next();
        System.out.println("Enter email");
        String email = scanner.next();
        Contact contactName = new Contact(firstName, lastName, address, city, phone, email);
        c1.add(contactName);
    }

    public void editContact() {
        System.out.println("if you want to edit person details, y/n : ");
        String name = "";

        if (AddressBook.scanner.nextLine().equals("y")) {
            System.out.println("Enter name whose details you want to edit");
            AddressBook a1 = new AddressBook();
            for (Contact x : a1.c1) {
                if (x.getFirstName().equals(name)) {
                    System.out.println("Enter which details you want to edit eg. firstName, lastName etc ");
                    String check = AddressBook.scanner.nextLine();
                    switch (check) {
                        case "firstName":
                            System.out.println("Rename first Name to  ");
                            x.setFirstName(AddressBook.scanner.nextLine());
                            break;
                        case "lastName":
                            System.out.println("Rename last Name to  ");
                            x.setLastName(AddressBook.scanner.nextLine());
                            break;
                        case "address":
                            System.out.println("Rename address to  ");
                            x.setAddress(AddressBook.scanner.nextLine());
                            break;
                        case "city":
                            System.out.println("Rename city to  ");
                            x.setCity(AddressBook.scanner.nextLine());
                            break;
                        case "phone":
                            System.out.println("Rename phone to  ");
                            x.setPhone(AddressBook.scanner.nextLine());
                            break;
                        case "email":
                            System.out.println("Rename email to  ");
                            x.setEmail(AddressBook.scanner.nextLine());
                            break;
                        default:
                            System.out.println("Invalid entry");
                    }
                }
            }
        }
    }

}