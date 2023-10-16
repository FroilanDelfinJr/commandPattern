package commandPattern;

public class Thermostat {

    int temperature = 0;

    public String turnOn(){
        return "Thermostat is turned-on!";
    }

    public String turnOff(){
        return "\tThermostat is turned-off!";
    }

    public String increaseTemperature(){
        if (temperature < 90){
            temperature++;
            return  "\tThe temperature of the thermostat increases to " + temperature + "ºF";
        }

        else{
            return "\tThe temperature of the thermostat is at full temperature";
        }

    }

    public String decreaseTemperature(){
        if (temperature > 50){
            temperature--;
            return  "\tThe temperature of the thermostat decreases to " + temperature + "ºF";
        }

        else{
            return "\tThe temperature of the thermostat is at lowest temperature";
        }
    }

}
