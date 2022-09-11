package ted03;

public class Funcionario extends Pessoa {
    private int matricula;
    private String cargo;
    private int salario;
    private String dataAdmissao;
    // Constructor
    public Funcionario(String nome, String dataNascimento, String endereco, String tel,
                       int matricula, String cargo, int salario, String dataAdmissao) {
        super(nome, dataNascimento, endereco, tel);
        this.matricula = matricula;
        this.cargo = cargo;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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