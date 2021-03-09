package br.com.impacta.lab;

public class ContaCorrente extends Conta {

  public ContaCorrente(int numero, int agencia, String tipo) {
    super(numero, agencia, tipo);
  };

  public String montarResumoDaConta() {
    return "Numero: " + this.getNumero() + " - Agencia: " + this.getAgencia() + " - Tipo: " + this.getTipo();
  };
}