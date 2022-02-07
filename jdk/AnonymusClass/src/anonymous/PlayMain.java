package anonymous;

public class PlayMain {
	
	public static void play(AbstractClass abstractClass) {
		abstractClass.play();
	}
	
	public static void main(String[] args) {
		VideoPlay video = new VideoPlay();
		MusicPlayer music = new MusicPlayer();
		MusicPlayer m1 = new MusicPlayer();
		play(video);
		play(music);
		play(m1);
		
		SoundPlayer p1 = new SoundPlayer();
		p1.setAbstractClass(new AbstractClass() {
			@Override
			public void play() {
				System.out.println("play1");
			}
		});
		SoundPlayer p2 = new SoundPlayer();
		p2.setAbstractClass(music);
		p1.play();
		p2.play();
		
	}

}




