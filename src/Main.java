public class Main {
    public static void main(String[] args) {
        System.out.println("Olá Keith, seja bem-vindo!");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua das Palmeiras");

        cliente.setCodigo(1);
        System.out.println("Código: " + cliente.getCodigo());
        cliente.imprimirEndereco();
    }
}
