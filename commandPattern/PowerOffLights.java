package commandPattern;

public class PowerOffLights implements Command{

    private Lights lights;

    public PowerOffLights(Lights lights){
        this.lights = lights;
    }

    @Override
    public String execute() {
        return lights.switchOff();
    }


}
