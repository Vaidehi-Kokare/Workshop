package com.bridgelabz.workshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBook {
    String name;
    private List<Contact> contacts;
    static Scanner scanner = new Scanner(System.in);
    public AddressBook(String name){
        this.name = name;
        this.contacts=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    void addContact(Contact contact) {
        contacts.add(contact);
    }
    public Map<String, List<Contact>> getContactsByCity() {
        return contacts.stream().collect(Collectors.groupingBy(Contact::getCity));
    }

    public Map<String, List<Contact>> getContactsByState() {
        return contacts.stream().collect(Collectors.groupingBy(Contact::getState));
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Address Book: ").append(name).append("\n");
        for (Contact contact : contacts) {
            s.append(contact).append("\n");
        }
        return s.toString();
    }
}