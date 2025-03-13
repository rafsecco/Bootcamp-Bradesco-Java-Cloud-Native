/* Vamos cria um exemplo de uma classe para representar uma SmartTV onde:
	1. Ela tenha as características: ligada (boolean), canal (int) e volume (int)
	2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada
	3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
	4. Nossa TV poderá mudar de cana de 1 em 1 ou definindo o número correspondente
*/

public class SmartTv {
	boolean ligada = false;
	int canal = 1;
	int volulme = 25;

	public void ligar() {
		ligada = true;
	}

	public void desligar() {
		ligada = false;
	}

	public void aumentarVolume() {
		volulme++;
	}

	public void diminuirVolume() {
		volulme--;
	}

	public void aumentarCanal() {
		canal++;
	}
	public void diminuirCanal() {
		canal--;
	}

	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
	}
}
