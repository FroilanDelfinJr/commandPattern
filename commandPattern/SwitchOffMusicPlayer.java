package commandPattern;

public class SwitchOffMusicPlayer implements Command{

    private MusicPlayer musicPlayer;

    public SwitchOffMusicPlayer(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String execute() {
        return musicPlayer.turnOff();
    }

}
