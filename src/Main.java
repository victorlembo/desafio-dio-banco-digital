public class Main {

    public static void main(String[] args) {
        Cliente victor = new Cliente();
        victor.setNome("Victor");

        Conta cc = new ContaCorrente(victor);
        Conta pp = new ContaPoupanca(victor);

        cc.depositar(100);
        cc.transferir(50, pp);

        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }
}
