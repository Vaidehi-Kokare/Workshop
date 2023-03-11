package com.bridgelabz.workshop;

public class Contact {
    private String firstName, lastName, address, city, state, phone, email;

    Contact(){

    }

    Contact(String firstName,String lastName,String address, String city, String state, String phone, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phone = phone;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getAddress() {
        return address;
    }
    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public String toString() {
        return "Contact:First Name- " + firstName + " Last Name- " + lastName + " Address- " + address + " City- " + city + " State " + state+ " Phone Number- " +phone + " Email-Id- " + email;
    }
}

