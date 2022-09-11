package ted03;

public class Cliente extends Pessoa {
    private int cod;
    private String cargo;
    private String profissao;
    // Constructor
    public Cliente(String nome, String dataNascimento, String endereco,
                   String tel, int cod, String cargo, String profissao) {
        super(nome, dataNascimento, endereco, tel);
        this.cod = cod;
        this.cargo = cargo;
        this.profissao = profissao;
    }
    // Getters and Setters
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}