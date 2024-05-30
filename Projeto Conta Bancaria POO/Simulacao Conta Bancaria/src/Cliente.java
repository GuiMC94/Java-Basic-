public class Cliente {
    private String nomeCompleto;
    private int cpf;
    private int telefone;

    Cliente(String nomeComPleto, int cpf, int telefone) {
        this.nomeCompleto = nomeComPleto;
        this.cpf = cpf;
        this.telefone = telefone;

    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public int getCpf() {
        return cpf;
    }

    public int getTelefone() {
        return telefone;
    }

}
