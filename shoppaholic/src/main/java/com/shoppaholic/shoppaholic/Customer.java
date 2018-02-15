package com.shoppaholic.shoppaholic;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String firstName;
	private String lastName;
    private String mail;
    private String password;
    private String address;
    private long telephone;
    private String imageUrl;

	protected Customer() {
		// Used by SpringData
	}

	public Customer(String firstName, String lastName, String mail, String password, String address, long phone, String imageUrl) {
		this.firstName = firstName;
		this.lastName = lastName;
        this.mail = mail;
        this.password = password;
        this.address = address;
        this.telephone = phone;
        this.imageUrl = imageUrl;
	}

	public String getFirstName() {
		return firstName;
	}

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public long getTelephone() {
        return telephone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%d, firstName='%s', lastName='%s', mail='%s', address='%s', telephone='%s' ]",id, firstName, lastName, mail, address, telephone);
	}
}