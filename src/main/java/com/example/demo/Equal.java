package com.example.demo;

// TODO: 05.05.2022 Найти результат выражения
//
//| a- b | / (a + b) ^3 - √c
//
//В переменные a, b, c можете подставить любые значения 

public class Equal {
    //initializing variables with type of data - double
    public double a;
    public double b;
    public double c;

    //Constructor of class Equal creation with 3 parameters
    public Equal(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Method for calculating equal - | a- b | / (a + b) ^3 - √c
    public double Equals() {
        double z = ((Math.abs(a - b))/(Math.pow((a + b), 3))-Math.sqrt(c));
        return z;
    };

    //Object creation, with needed parameters a, b, c
    public static void main(String[] args) {
        Equal x = new Equal(2,1,1);
        System.out.println(x.Equals());
    }
}
