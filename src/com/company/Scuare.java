package com.company;

public class Scuare extends Shape
{
    private double a;

    public Scuare(double a, String color)
    {
        this.a = a;
        this.color = color;
    }

    @Override
    public double Perim() {
        P = a*4;
        return P;
    }

    @Override
    public double Plosh() {
        S = a * a;
        return S;
    }
    public String toString()
    {
        return "color "+color+"; P="+P+"; S="+S;
    }
}