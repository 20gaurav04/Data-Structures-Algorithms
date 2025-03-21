package OOPS.Properties.Inheritance;

public class WeightedBox extends Box{

    double weight = -1;

    WeightedBox()
    {
        this.weight = -1;
    }
    public WeightedBox(double l , double b , double h , double weight)
    {
        super(l,b,weight);
        this.weight = weight;
    }
}
