
public class GajunMP3 implements GajunOnOff, GajunVolume {
	public void up() {
		System.out.println("MP3.volumeUp()");
	}
	public void down() {
		System.out.println("MP3.volumeDown()");
	}
	public void on() {
		System.out.println("MP3.on()");
	}
	public void off() {
		System.out.println("MP3.off()");
	}
}
