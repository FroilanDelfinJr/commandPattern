package commandPattern;

public class IncreaseVolume implements Command{

    private MusicPlayer musicPlayer;

    public IncreaseVolume(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String execute() {
        return musicPlayer.increaseVolume();
    }

}
