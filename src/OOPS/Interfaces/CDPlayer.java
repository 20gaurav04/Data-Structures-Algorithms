package OOPS.Interfaces;

public class CDPlayer implements MusicPlayer{

    public void Start()
    {
        System.out.println("Playing music");
    }
    public void Stop()
    {
        System.out.println("Stopped music");
    }
}
