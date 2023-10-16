package commandPattern;

public class PowerOnLights implements Command{

    private Lights lights;

    public PowerOnLights(Lights lights){
        this.lights = lights;
    }

    @Override
    public String execute() {
        return lights.switchOn();
    }
}
