package com.company;

public class Test
{
    public static void main(String[] args) {
        Scuare x = new Scuare(5, "red");
        Pram y = new Pram(3, 4, "green");

        x.Perim();
        x.Plosh();
        y.Perim();
        y.Plosh();

        System.out.println(x);
        System.out.println(y);
    }
}