package OOPS.Enums;

public class Basic
{
    enum Week implements  A
//        this enum already  explicitly extends java.lang.enum so cannot extend any other class
//        but it can implement multiple interfaces
    {
        Monday , Tuesday , Wednesday , Thursday , Friday , Saturday , Sunday;
//        these are enum constants
//        public , static , final
//        since its final , we can create child enums

        Week()
        {
            System.out.println("Day of the week" + this);
        }
        @Override
        public void hello()
        {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        for(Week day : Week.values())
        {
            System.out.println(day);
        }
        week.hello();
    }
}
