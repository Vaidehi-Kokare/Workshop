package com.bridgelabz.workshop;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class AddressBookMain {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome To AddressBook Program ");
        AddressBook addressBook1 = new AddressBook("Friends");
        addressBook1.addContact(new Contact("Vaidehi", "Kokare", "Khar", "Mumbai", "MH", "90942521264", "abc@sjfhh"));
        addressBook1.addContact(new Contact("Ayush", "Sharma", "Loni", "Pune", "MH", "9141033885", "kjas@fgh.org"));
        addressBook1.addContact((new Contact("Prakash", "Kiran", "Sector-8", "Chennai", "TN", "9831131322", "pra3@gml.com")));
        addressBook1.addContact((new Contact("Tanuja", "Datar", "SPC", "Pune", "MH", "8901590609", "kjl@jkl.in")));
        addressBook1.addContact((new Contact("Deepti", "Bans", "SectorX", "Delhi", "Delhi", "800872218", "deb3@gma.com")));

        AddressBook addressBook2 = new AddressBook("Colleagues");
        addressBook2.addContact(new Contact("Vidushi", "Khandel", "PinkCity", "Jaipur", "RJ", "98994567890", "vk@kjlk.org"));
        addressBook2.addContact(new Contact("Rushi", "Patil", "Indiranagar", "Hyderabad", "TS", "9890485091", "kj@rtyu.com"));
        Map<String, List<Contact>> contactsByCity = addressBook1.getContactsByCity();
        System.out.println("Contacts by city:");
        for (Map.Entry<String, List<Contact>> entry : contactsByCity.entrySet()) {
            String city = entry.getKey();
            List<Contact> contacts = entry.getValue();
            System.out.println(city + ":");
            contacts.forEach(System.out::println);
            System.out.println();
        }
        Map<String, List<Contact>> contactsByState = addressBook1.getContactsByState();
        System.out.println("Contacts by state:");
        contactsByState.forEach((state, contacts) -> {
            System.out.println(state + ":");
            contacts.forEach(System.out::println);
            System.out.println();
        });

        List<AddressBook> addressBooks = List.of(addressBook1,addressBook2);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("addressBooks.txt"));
            for (AddressBook book : addressBooks) {
                writer.write(book.toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
