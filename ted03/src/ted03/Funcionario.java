package ted03;

public class Funcionario extends Pessoa {
    private int matricula;
    private int salario;
    private String dataAdmissao;
    // Constructor
    public Funcionario(String nome, String dataNascimento, String endereco, String tel,
                       int matricula, String cargo, int salario, String dataAdmissao) {
        super(nome, dataNascimento, endereco, tel, cargo);
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }
    // Getters and Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}