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
//        this will call the constructor just above it which is taking 3 arguments i.e., Box;
        this.weight = weight;
    }
    WeightedBox(WeightedBox other)
    {
        super(other);
        weight = other.weight;
    }
    static void greeting()
    {
        System.out.println("hello from super-class !");
    }
}
