import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente("Venilton");
        Cliente ezequiel = new Cliente("Ezequiel");
        Banco santander = new Banco("Santander", new ArrayList<Conta>());

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);
        Conta cc2 = new ContaCorrente(ezequiel);
        Conta poupanca2 = new ContaPoupanca(ezequiel);
        santander.adicionarConta(cc);
        santander.adicionarConta(cc2);
        santander.adicionarConta(poupanca);
        santander.adicionarConta(poupanca2);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        poupanca.sacar(50);
        cc2.depositar(200);
        cc2.transferir(100, poupanca2);
        poupanca2.sacar(50);

        santander.imprimirContas();

    }

}