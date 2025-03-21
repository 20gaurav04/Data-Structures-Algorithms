package OOPS.Properties.Inheritance;

public class Box {

    double l = -1;
    double b = -1;
    double h = -1;

    Box()
    {
        this.l = l;
        this.b = b;
        this.h = l;
    }
    Box(int side)
    {
        this.l = side;
        this.b = side;
        this.h = side;
    }
    Box(double len , double bre , double hei)
    {
        this.l = len;
        this.b = bre;
        this.h = hei;
    }
}
