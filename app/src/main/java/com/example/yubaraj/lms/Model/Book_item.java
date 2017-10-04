package com.example.yubaraj.lms.Model;

/**
 * Created by yubar on 9/26/2017.
 */

public class Book_item {
    private String name;
    private String code1;
    private String code2;
   // private int bookId;
   // private String Author;
   // private boolean status;


    public Book_item(String name, String code1, String code2) {
        this.name = name;
        this.code1 = code1;
        this.code2 = code2;
    }

    public String getName() {
        return name;
    }

    public String getCode1() {
        return code1;
    }

    public String getCode2() {
        return code2;
    }
}
