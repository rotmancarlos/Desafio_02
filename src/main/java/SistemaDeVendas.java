import java.util.ArrayList;
import java.util.List;

public class SistemaDeVendas {
    private List<Cliente> clientes;
    private List<Vendedor> vendedores;
    private List<Venda> vendas;


    public SistemaDeVendas() {
        this.clientes = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.vendas = new ArrayList<>();
    }


    public void cadastrarCliente(Cliente cliente) {
        if (validarCliente(cliente)) {
            clientes.add(cliente);
            System.out.println("Sucesso,cliente cadastrado!");
        }
    }


    public void cadastrarVendedor(Vendedor vendedor) {
        if (validarVendedor(vendedor)) {
            vendedores.add(vendedor);
            System.out.println("Sucesso, vendedor cadastrado!");
        }
    }


    public void cadastrarVenda(Venda venda) {
        if (clienteExiste(venda.getCliente().getCpf()) && vendedorExiste(venda.getVendedor().getCpf())) {
            vendas.add(venda);
            System.out.println("Sucesso, venda cadastrada!");
        } else {
            System.out.println("Erro: Cliente ou vendedor não cadastrado.");
        }
    }


    public void listarVendas() {
        if (vendas.isEmpty()) {
            System.out.println("Nenhuma venda cadastrada.");
        } else {
            System.out.println("Vendas cadastradas:");
            for (Venda venda : vendas) {
                System.out.println(venda);
            }
        }
    }


    public void listarVendedores() {
        if (vendedores.isEmpty()) {
            System.out.println("Nenhum vendedor cadastrado.");
        } else {
            System.out.println("Exibir os vendedores cadastrados:");
            for (Vendedor vendedor : vendedores) {
                System.out.println(vendedor);
            }
        }
    }



    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.println("Exibir clientes cadastrados:");
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }


    public void pesquisarVendasCliente(String cpf) {
        List<Venda> vendasCliente = new ArrayList<>();
        for (Venda venda : vendas) {
            if (venda.getCliente().getCpf().equals(cpf)) {
                vendasCliente.add(venda);
            }
        }
        if (vendasCliente.isEmpty()) {
            System.out.println("Nenhuma venda encontrada para o Cliente com CPF: " + cpf);
        } else {
            System.out.println("Exibir vendas do cliente com o CPF " + cpf + ":");
            for (Venda venda : vendasCliente) {
                System.out.println(venda);
            }
        }
    }


    private boolean clienteExiste(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }


    private boolean vendedorExiste(String cpf) {
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }


    private boolean validarCliente(Cliente cliente) {
        if (!clienteExiste(cliente.getCpf())) {
            if (!emailRepetido(cliente.getEmail())) {
                if (validarEmail(cliente.getEmail())) {
                    clientes.add(cliente);
                    return true;
                } else {
                    System.out.println("Erro: E-mail inválido.");
                }
            } else {
                System.out.println("Erro: E-mail já cadastrado.");
            }
        } else {
            System.out.println("Erro: CPF já cadastrado.");
        }
        return false;
    }


    private boolean validarVendedor(Vendedor vendedor) {
        if (!vendedorExiste(vendedor.getCpf())) {
            if (!emailRepetido(vendedor.getEmail())) {
                if (validarEmail(vendedor.getEmail())) {
                    vendedores.add(vendedor);
                    return true;
                } else {
                    System.out.println("Erro: E-mail inválido!");
                }
            } else {
                System.out.println("Erro: E-mail já cadastrado!");
            }
        } else {
            System.out.println("Erro: CPF já cadastrado!");
        }
        return false;
    }


    private boolean emailRepetido(String email) {
        for (Cliente cliente : clientes) {
            if (cliente.getEmail().equals(email)) {
                return true;
            }
        }
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }


    private boolean validarEmail(String email) {
        return email.contains("@");
    }

}
