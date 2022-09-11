package aula01;

public class Main {
    public static void main (String[] args) {
        Conta usuario1 = new Conta();
        usuario1.numero = 0001;
        usuario1.nome = "Laecio";
        usuario1.limite = 1000;
        usuario1.saldo = 300;
        usuario1.sacar(200);

    }
}
