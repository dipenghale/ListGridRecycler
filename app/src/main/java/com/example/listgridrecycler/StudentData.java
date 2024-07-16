package com.example.listgridrecycler;

class studentData {
    String name;
    int age;

    public studentData(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }
}