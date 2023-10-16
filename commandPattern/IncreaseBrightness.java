package commandPattern;

public class IncreaseBrightness implements Command {

    private Lights lights;

    public IncreaseBrightness (Lights lights){
        this.lights = lights;

    }

    @Override
    public String execute() {
        return lights.increaseBrightness();
    }
}
