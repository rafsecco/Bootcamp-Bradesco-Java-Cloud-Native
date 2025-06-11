import devices.IPhone;

public class Main {
	public static void main(String[] args) throws Exception {
		IPhone iPhone = new IPhone();
		iPhone.showPage("https://github.com/rafsecco");
		iPhone.addTab();
		iPhone.reload();
		iPhone.play();
		iPhone.pause();
		iPhone.selectSong("Dias de luta, dias de gloria - Charlie Brown Jr.");
		iPhone.call("123456789");
		iPhone.accept();
		iPhone.startVoiceMail();
	}
}
