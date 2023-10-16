package commandPattern;

import org.w3c.dom.ls.LSOutput;

public class Lights {

    int brightness = 0;

    public String switchOn(){
        return"The Lights are on!";
    }

    public String switchOff(){
        return "\tThe Lights are off!";
    }

    public String increaseBrightness(){
        if (brightness < 100){
            brightness++;
            return  "\tThe brightness of the light increases to " + brightness;
        }

        else{
            return "\tThe brightness of the light is at full brightness";
        }
    }

    public String decreaseBrightness(){
        if (brightness > 0){
            brightness--;
            return  "\tThe brightness of the light decreases to " + brightness;
        }

        else{
            return "\tThe brightness of the light is at lowest brightness";
        }
    }
}
