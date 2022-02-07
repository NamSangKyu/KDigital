package anonymous;

public class PlayMain {
	
	public static void play(AbstractClass abstractClass) {
		abstractClass.play();
	}
	
	public static void main(String[] args) {
		VideoPlay video = new VideoPlay();
		MusicPlayer music = new MusicPlayer();
		
		play(video);
		play(music);
	}

}
