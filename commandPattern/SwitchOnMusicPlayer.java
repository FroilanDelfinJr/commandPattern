package commandPattern;

public class SwitchOnMusicPlayer implements Command{

    private MusicPlayer musicPlayer;

    public SwitchOnMusicPlayer(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String execute() {
        return musicPlayer.turnOn();
    }

}
