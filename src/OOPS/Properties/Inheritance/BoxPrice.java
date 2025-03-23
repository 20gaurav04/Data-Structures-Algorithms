package OOPS.Properties.Inheritance;

public class BoxPrice extends WeightedBox{

    double cost;

    BoxPrice()
    {
        super();
        this.cost = 2;
    }
    BoxPrice(double l , double b , double h , double weight , double cost)
    {
        super(l,b,h,weight);
//        this will call the constructor just above it which is the weightedBox taking 4 arguments
        this.weight = weight;
    }
}
