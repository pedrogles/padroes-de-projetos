package ted03;

public class Pessoa {
    private String endereco;
    private String tel;
    private String nome;
    private String dataNascimento;
    private String cargo;

    // Constructor.
    public Pessoa(String nome, String dataNascimento, String endereco, String tel, String cargo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.tel = tel;
        this.cargo = cargo;
    }
    // Metodos.

    // Getters and Setters.
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco (String endereco) {
        this.endereco = endereco;
    }
    public String getTel() {
        return tel;
    }
    public void setTel (String tel) {
        this.tel = tel;
    }
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
