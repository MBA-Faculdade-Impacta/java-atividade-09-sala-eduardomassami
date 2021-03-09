package br.com.impacta.lab;

public class ContaPoupanca extends Conta {

  public ContaPoupanca(int numero, int agencia, String tipo) {
    super(numero, agencia, tipo);
  };

  public String montarResumoDaConta() {
    return "Numero: " + super.getNumero() + " - Agencia: " + super.getAgencia() + " - Tipo: " + super.getTipo();
  };
}