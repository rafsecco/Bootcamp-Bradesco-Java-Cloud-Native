public class Computador implements VideoPlayer, MusicPlayer {

	@Override
	public void playMusic() { System.out.println("O computador está: Tocando a música!"); }

	@Override
	public void pauseMusic() { System.out.println("O computador está: Pausando a música!"); }

	@Override
	public void stopMusic() { System.out.println("O computador está: Parando a música!"); }

	@Override
	public void playVideo() { System.out.println("O computador está: Reproduzindo o video!"); }

	@Override
	public void pauseVideo() { System.out.println("O computador está: Pausando o video!"); }

	@Override
	public void stopVideo() { System.out.println("O computador está: Parando o video!"); }
}
