public class Banco {
   private String nome;
   private Int numeroConta;
   private double saldo;


public Banco(String nome, Int numeroConta) {
    this.nome = nome;
    this.numeroConta = numeroConta;
    this.saldo=0;
}

 public Banco(String nome, Int numeroConta, double saldo) {
    this.nome = nome;
    this.numeroConta = numeroConta;
    this.saldo = saldo;
}
   
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public Int getNumeroConta() {
    return numeroConta;
}
public void setNumeroConta(Int numeroConta) {
    this.numeroConta = numeroConta;
}
public double getSaldo() {
    return saldo;
}
public void setSaldo(double saldo) {
    this.saldo = saldo;
}
@Override
public String toString() {
    return "Banco [nome=" + nome + ", numeroConta=" + numeroConta + ", saldo=" + saldo + "]";
}
}
