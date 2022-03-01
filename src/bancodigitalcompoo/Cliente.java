
package bancodigitalcompoo;

public class Cliente {
protected String nome;
protected int dataDeNascimento;
protected String endereco;
protected ContaDigBank conta;

    public Cliente(String nome, Integer dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;

    }

    public String getNome() {
        return nome;
    }

    public Integer getdataDeNascimento() {
        return dataDeNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataDeNascimento(int dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public ContaDigBank getConta() {
        return conta;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", endereco='" + endereco + '\'' +
                ", conta=" + conta +
                '}';
    }
}
