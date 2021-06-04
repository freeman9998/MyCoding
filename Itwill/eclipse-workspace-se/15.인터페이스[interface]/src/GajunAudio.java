public class GajunAudio implements GajunOnOff, GajunVolume {
	@Override
	public void up() {
		System.out.println("Audio.volumeUp()");
	}
	@Override
	public void down() {
		System.out.println("Audio.volumeDown()");
	}
	@Override
	public void on() {
		System.out.println("Audio.on()");
	}
	@Override
	public void off() {
		System.out.println("Audio.off()");
	}
}
