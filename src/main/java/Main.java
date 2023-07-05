import java.time.LocalDate;

public class Main {


    public static void main(String[] args){
        SistemaDeVendas sistema = new SistemaDeVendas();

//Realiazar cadastro de clientes

        Cliente cliente1 = new Cliente("Rotman", "03804013636", "desenvolver@aol.com.br");
        Cliente cliente2 = new Cliente("Marinho", "55932698071", "marinho@globo.com");
        Cliente cliente3 = new Cliente("Paul", "72867948096", "paul@ig.com.br");

        sistema.cadastrarCliente(cliente1);
        sistema.cadastrarCliente(cliente2);
        sistema.cadastrarCliente(cliente3);

//Realizar cadastro de vendedores

        Vendedor vendedor1 = new Vendedor("Leandro", "44978196043", "leouai@gmail.com");
        Vendedor vendedor2 = new Vendedor("Luisa", "46797480019", "luisa@gmail.com");
        Vendedor vendedor3 = new Vendedor("Juan", "49214108013", "juan@ig.com.br");

        sistema.cadastrarVendedor(vendedor1);
        sistema.cadastrarVendedor(vendedor2);
        sistema.cadastrarVendedor(vendedor3);

//Realizar o cadastro das vendas

        Venda venda1 = new Venda(cliente1,vendedor1,500.0, LocalDate.now());
        Venda venda2 = new Venda(cliente2, vendedor2, 200.0, LocalDate.now());
        Venda venda3 = new Venda(cliente3, vendedor3, 300.0, LocalDate.now());

        sistema.cadastrarVenda(venda1);
        sistema.cadastrarVenda(venda2);
        sistema.cadastrarVenda(venda3);

//Exibir lista de vendas

        sistema.listarVendas();

//Exibir lista de vendedores

        sistema.listarVendedores();

//Exibir lista de clientes

        sistema.listarClientes();

//Realizar busca de vendas para cliente específico

        sistema.pesquisarVendasCliente("03804013636");

//O sistema permite pesquisar todas as vendas de um vendedor em específico através de seu e-mail.


//O sistema contém uma cobertura de testes de 100%.








    }
}
