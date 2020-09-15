package com.company;

public class Pram extends Shape
{
    private double a;
    private double b;
    public Pram( double a, double b, String color)
    {
        this.a = a;
        this.b = b;
        this.color = color;
    }


    public double Perim () {
        P = a + a + b + b;
        return P;
    }


    public double Plosh () {
        S = a * b;
        return S;
    }
    public String toString()
    {
        return "color "+color+"; P="+P+"; S="+S;
    }
}

