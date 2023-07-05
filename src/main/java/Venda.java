import java.time.LocalDate;

    public class Venda {
        private Cliente cliente;
        private Vendedor vendedor;
        private double valor;
        private LocalDate data;

        public Venda(Cliente cliente, Vendedor vendedor, double valor, LocalDate data) {
            this.cliente = cliente;
            this.vendedor = vendedor;
            this.valor = valor;
            this.data = data;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public Vendedor getVendedor() {
            return vendedor;
        }

        public double getValor() {
            return valor;
        }

        public LocalDate getData() {
            return data;
        }

        @Override
        public String toString() {
            return "Venda{" +
                    "cliente=" + cliente +
                    ", vendedor=" + vendedor +
                    ", valor=" + valor +
                    ", data=" + data +
                    '}';
        }
    }

