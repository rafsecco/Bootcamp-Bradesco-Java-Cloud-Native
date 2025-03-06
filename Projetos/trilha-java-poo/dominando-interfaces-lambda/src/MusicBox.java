public class MusicBox implements MusicPlayer {
	@Override
	public void playMusic() { System.out.println("O caixa de música está: Tocando a música!"); }

	@Override
	public void pauseMusic() { System.out.println("O caixa de música está: Pausando a música!"); }

	@Override
	public void stopMusic() { System.out.println("O caixa de música está: Parando a música!"); }
}
