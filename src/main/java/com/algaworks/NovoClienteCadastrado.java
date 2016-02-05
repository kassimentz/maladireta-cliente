package com.algaworks;

import javax.swing.JOptionPane;

import com.algaworks.maladireta.MalaDireta;
import com.algaworks.maladireta.xml.MalaDiretaXML;

public class NovoClienteCadastrado {
	
	public static void main(String[] args) {
		MalaDireta maladireta = new MalaDiretaXML("contatos.xml");
		String mensagem = JOptionPane.showInputDialog(null, "Digite a mensagem do email para novo cliente: ");

		boolean status = maladireta.enviarEmail(mensagem);

		JOptionPane.showConfirmDialog(null, "E-mails enviados: " + status);
	}

}
