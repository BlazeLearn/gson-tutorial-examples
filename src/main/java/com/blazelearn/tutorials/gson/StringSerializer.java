package com.blazelearn.tutorials.gson;

import com.google.gson.Gson;

public class StringSerializer {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String serializedJson  = gson.toJson("Hello World");
        System.out.println(serializedJson);
    }
}
