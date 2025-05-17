package diobootcamp.gof;

import diobootcamp.gof.facade.Facade;
import diobootcamp.gof.singleton.SingletonEager;
import diobootcamp.gof.singleton.SingletonLazy;
import diobootcamp.gof.singleton.SingletonLazyHolder;
import diobootcamp.gof.strategy.Comportamento;
import diobootcamp.gof.strategy.ComportamentoAgressivo;
import diobootcamp.gof.strategy.ComportamentoDefensivo;
import diobootcamp.gof.strategy.ComportamentoNormal;
import diobootcamp.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {

		// Singleton

		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);

		// Strategy

		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();

		// Facade

		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");
	}

}
