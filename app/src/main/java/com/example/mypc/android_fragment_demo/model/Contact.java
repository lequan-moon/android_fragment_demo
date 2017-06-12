package com.example.mypc.android_fragment_demo.model;

import com.example.mypc.android_fragment_demo.R;

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
    int imgThumb;

    public Contact(String id, String name, String phoneNumber, String email, int imgThumb) {
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

    public int getImgThumb() {
        return imgThumb;
    }

    public void setImgThumb(int imgThumb) {
        this.imgThumb = imgThumb;
    }

    public static List<Contact> dummyData() {
        List<Contact> dummyData = new ArrayList<>();
        dummyData.add(new Contact("0", "Selena Gomez", "202-555-0166", "SelenaGom@example.com", R.drawable.image1));
        dummyData.add(new Contact("1", "Allen Walker", "01632 960424", "AllenWal@example.com", R.drawable.image2));
        dummyData.add(new Contact("2", "George Clooney", "613-555-0149", "GeorgeClo@example.com", R.drawable.image3));
        dummyData.add(new Contact("3", "Obama", "1900 654 321", "BarrackOba@example.com", R.drawable.image4));
        dummyData.add(new Contact("4", "Scarlett Johansson", "06 55 540 916", "ScarlettJoh@example.com", R.drawable.image5));
        dummyData.add(new Contact("5", "Danielle Lineker", "020 918 5654", "DenialleLin@example.com", R.drawable.image6));
        dummyData.add(new Contact("6", "Thor", "06 55 749 656", "Thor@example.com", R.drawable.image7));
        dummyData.add(new Contact("7", "Brad Pitt", "06 55 136 264", "BradPit@example.com", R.drawable.image8));
        dummyData.add(new Contact("8", "Katy Perry", "020 916 6868", "KatyPer@example.com", R.drawable.image9));
        return dummyData;
    }
}
