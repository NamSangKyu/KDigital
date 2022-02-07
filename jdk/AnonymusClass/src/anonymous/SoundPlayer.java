package anonymous;

public class SoundPlayer {
	private AbstractClass abstractClass;

	public void setAbstractClass(AbstractClass abstractClass) {
		this.abstractClass = abstractClass;
	}

	public void play() {
		if(abstractClass != null)
			abstractClass.play();
	}

}
