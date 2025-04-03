package OOPS.Interfaces;

public class NiceCar  {
    private Engine engine;
    public MusicPlayer music;

    public NiceCar()
    {
        this.engine = new  ElectricEngine();
    }

    public NiceCar(Engine engine)
    {
        this.engine = engine;
    }
    public void start()
    {
        engine.start();
    }
    public void stop()
    {
        engine.stop();
    }
    public void accelerate()
    {
        engine.accelerate();
    }
    public void upGradeEngine()
    {
        this.engine = new PowerEngine();
    }
    public void startMusic()
    {
        CDPlayer music = new CDPlayer();
        music.Start();
    }
    public void stopMusic()
    {
        CDPlayer music = new CDPlayer();
        music.Stop();
    }
}
