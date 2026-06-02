public class exercicio6 {
    public static void main(String[] args) {
        Conta conta = new Conta("Ana");
        conta.depositar(1000.00);
        conta.sacar(980.00);
        conta.exibirSaldo();
    }
}