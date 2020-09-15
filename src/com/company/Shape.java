package com.company;

public abstract class Shape
{
        public double P;
        public double S;
        public String color;

        public abstract double Perim();
        public abstract double Plosh();

        public void SetColor(String color)
        {
            this.color = color;
        }
        public String GetColor()
        {
            return color;
        }

}

