public class Smartphone implements VideoPlayer, MusicPlayer {

	@Override
	public void playMusic() { System.out.println("O smartphone está: Tocando a música!"); }

	@Override
	public void pauseMusic() { System.out.println("O smartphone está: Pausando a música!"); }

	@Override
	public void stopMusic() { System.out.println("O smartphone está: Parando a música!"); }

	@Override
	public void playVideo() { System.out.println("O smartphone está: reproduzindo o video!"); }

	@Override
	public void pauseVideo() { System.out.println("O smartphone está: Pausando o video!"); }

	@Override
	public void stopVideo() { System.out.println("O smartphone está: Parando o video!"); }
}
