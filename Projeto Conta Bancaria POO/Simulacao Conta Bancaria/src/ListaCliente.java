import java.util.ArrayList;
import java.util.List;

public class ListaCliente {
    private List<Cliente> listaClientes;

    public ListaCliente() {
        this.listaClientes = new ArrayList<>();
    }

    public void adcionarInformacao(String nomeCompleto, int cpf, int telefone) {
        listaClientes.add(new Cliente(nomeCompleto, cpf, telefone));

    }

    public void alterarInformacao(int telefone) {
        List<Cliente> alterarInformacaotel = new ArrayList<>();
        if (!listaClientes.isEmpty()) {
            for (Cliente c : listaClientes) {
                if (c.getTelefone() == (telefone)) {
                    alterarInformacaotel.add(c);
                }
            }

            listaClientes.removeAll(alterarInformacaotel);
        } else {
            System.out.println("lista cliente estava vazia");

        }

    }

    public int obeterNumeroTotalClientes() {
        return listaClientes.size();
    }

    public void obterInclusaoCliente() {
        if (!listaClientes.isEmpty()) {
            System.out.println(listaClientes);
        } else {
            System.out.println("lista de cliente esta vazia!");
        }

    }

    public static void main(String[] args) {
        ListaCliente lClientes = new ListaCliente();

        lClientes.adcionarInformacao("Guilherme Monteiro", 115483736, 16998714);

    }

}
