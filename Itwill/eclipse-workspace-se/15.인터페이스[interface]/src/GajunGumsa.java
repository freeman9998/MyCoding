/*
	- 난 절대로 자식클래스타입을 사용안할래요.
	- 난 부모타입[GajunOnOff,GajunVolume]만 사용할래요.
	- 그래야 가전검사 프로그램 한번만들어서 변경없이 (유지보수,확장성)
	   계속사용할수있으니까요.
	- 유지보수시 많이 바꾸지않아도된다.   
*/
public class GajunGumsa {
	private GajunOnOff[] gajuns;
	public GajunGumsa() {
		
	}
	public void setGajuns(GajunOnOff[] gajuns) {
		this.gajuns=gajuns;
	}
	
	public void gumsa() {
		for (int i = 0; i < gajuns.length; i++) {
			System.out.println("---검사----");
			gajuns[i].on();
			GajunVolume tempGajun = (GajunVolume)gajuns[i];
			tempGajun.up();
			tempGajun.down();
			gajuns[i].off();
			System.out.println("---출고----");
		}
	}
}
