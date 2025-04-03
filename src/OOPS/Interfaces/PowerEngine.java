package OOPS.Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Start Power Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop Power Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate Power Engine");
    }
}
