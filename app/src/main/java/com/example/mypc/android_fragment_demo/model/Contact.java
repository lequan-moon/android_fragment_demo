package com.example.mypc.android_fragment_demo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MyPC on 11/06/2017.
 */

public class Contact {
    String id;
    String name;
    String phoneNumber;
    String email;
    String imgThumb;

    public Contact(String id, String name, String phoneNumber, String email, String imgThumb) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.imgThumb = imgThumb;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImgThumb() {
        return imgThumb;
    }

    public void setImgThumb(String imgThumb) {
        this.imgThumb = imgThumb;
    }

    public static List<Contact> dummyData() {
        List<Contact> dummyData = new ArrayList<>();
        dummyData.add(new Contact("0", "test1", "11-1111-1111", "test1@example.com", "url1"));
        dummyData.add(new Contact("1", "test2", "22-2222-2222", "test2@example.com", "url1"));
        dummyData.add(new Contact("2", "test3", "33-3333-3333", "test3@example.com", "url1"));
        dummyData.add(new Contact("3", "test4", "44-4444-4444", "test4@example.com", "url1"));
        dummyData.add(new Contact("4", "test5", "55-5555-5555", "test5@example.com", "url1"));
        dummyData.add(new Contact("5", "test6", "66-6666-6666", "test6@example.com", "url1"));
        dummyData.add(new Contact("6", "test7", "77-7777-7777", "test7@example.com", "url1"));
        dummyData.add(new Contact("7", "test8", "88-8888-8888", "test8@example.com", "url1"));
        dummyData.add(new Contact("8", "test9", "99-9999-9999", "test9@example.com", "url1"));
        return dummyData;
    }
}
