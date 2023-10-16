package commandPattern;

public class SwitchOffThermostat implements Command{
    private Thermostat thermostat;

    public SwitchOffThermostat(Thermostat thermostat){
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return thermostat.turnOff();
    }
}
