package devices;

// import contracts.iBrowser;
// import contracts.iMusicPlayer;
// import contracts.iPhone;
import contracts.*;

public class IPhone implements iBrowser, iMusicPlayer, iPhone {
	@Override
	public void showPage(String url) {
		System.out.println("Showing page: " + url);
	}

	@Override
	public void addTab() {
		System.out.println("Adding tab");
	}

	@Override
	public void reload() {
		System.out.println("Reloading page");
	}

	@Override
	public void play() {
		System.out.println("Playing music");
	}

	@Override
	public void pause() {
		System.out.println("Pausing music");
	}

	@Override
	public void selectSong(String song) {
		System.out.println("Selecting song: " + song);
	}

	@Override
	public void call(String number) {
		System.out.println("Calling " + number);
	}

	@Override
	public void accept() {
		System.out.println("Accepting call");
	}

	@Override
	public void startVoiceMail() {
		System.out.println("Starting voice mail");
	}
}