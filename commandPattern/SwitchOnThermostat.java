package commandPattern;

public class SwitchOnThermostat implements Command{
    private Thermostat thermostat;

    public SwitchOnThermostat(Thermostat thermostat){
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return thermostat.turnOn();
    }

}
