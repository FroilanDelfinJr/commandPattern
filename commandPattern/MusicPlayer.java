package commandPattern;

public class MusicPlayer {

    int volume = 0;

    public String turnOn(){
        return "Music Player is turned-on!";
    }

    public String turnOff(){
        return "\tMusic Player is turned-off!";
    }

    public String increaseVolume(){
        if(volume <= 100){
            volume++;
            return  "\tThe volume of the Music Player increases to " + volume;
        }

        else{
            return  "\tThe volume of the Music Player is at full volume";
        }
    }

    public String decreaseVolume(){
        if(volume <= 100){
            volume--;
            return  "\tThe volume of the Music Player decreases to " + volume;
        }

        else{
            return  "\tThe volume of the Music Player is at lowest volume";
        }
    }

}
