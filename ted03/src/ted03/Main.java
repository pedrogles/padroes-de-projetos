package ted03;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marcela Ferreira Costa", "12/11/1996",
                "R.Doutor Guilherme Espinola",
                "(83)99608-2302", 2113, "Gerente", "Desenvolvedora");
        Funcionario funcionario01 = new Funcionario("Joaqui Felix Silva", "27/03/1983",
                "R. Maranhão luiz", "(84)98843-6753", 2112402, "Atendente",
                8300, "21/02/2022");

        System.out.println(
                "Nome: "+cliente1.getNome() +
                        "\nTelefone: "+cliente1.getTel() +
                        "\nCargo: "+cliente1.getCargo() +
                        "\nProfissão: "+cliente1.getProfissao());
        System.out.println("-------------------------------------");
        System.out.println(
                "Nome: "+funcionario01.getNome() +
                        "\nTelefone: "+funcionario01.getTel() +
                        "\nCargo: "+funcionario01.getCargo() +
                        "\nData de Admissão: "+funcionario01.getDataAdmissao());

    }
}
