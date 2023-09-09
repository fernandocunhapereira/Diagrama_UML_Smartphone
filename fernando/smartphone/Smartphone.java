package br.com.fernando.smartphone;

import br.com.fernando.interfaces.AparelhoTelefonico;
import br.com.fernando.interfaces.NavegadorInternet;
import br.com.fernando.interfaces.ReprodutorMusical;

public class Smartphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
	
	public static void main(String[] args) {
		Smartphone iphone = new Smartphone();
		
		iphone.ligarCelular();
		iphone.selecionarFuncionalidade();
		iphone.selecionarMusica();
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarFuncionalidade();
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();
		iphone.selecionarFuncionalidade();
		iphone.exibirPagina();
		iphone.AdicionarAba();
		iphone.atualizarPagina();
		iphone.desligarCelular();
	}

	public void ligarCelular() {
		System.out.println("Ligando celular");
	}
	
	public void desligarCelular() {
		System.out.println("Desligando celular");
	}
	
	public void selecionarFuncionalidade() {
		System.out.println("Selecionando funcionalidade");
	}
	
	@Override
	public void tocar() {
		System.out.println("Tocando musica");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando musica");
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo pagina");
	}

	@Override
	public void AdicionarAba() {
		System.out.println("Adicionando aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina");
	}

	@Override
	public void ligar() {
		System.out.println("Fazendo ligação");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}
}
