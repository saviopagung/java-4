import models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBonus {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        ClienteControlador clienteControlador = new ClienteControlador();

        clienteControlador.criar(new Cliente(1 , "Guilherme", "Blanck"));
        clienteControlador.criar(new Cliente(2 , "Melina", "Araujo"));
        clienteControlador.criar(new Cliente(3 , "Hellena", "Pagung"));

        System.out.println("## Percorrer a lista de clientes e mostrar ");
        clienteControlador.listar();

        System.out.println("\n## Excluir da lista e listar os restantes ");
        clienteControlador.deletar(2);
        clienteControlador.listar();

        System.out.println("\n## Solicite o número de identificação de um cliente pelo teclado para\n" +
                "procurá-lo. Se o cliente estiver na lista, mostre seus dados, caso\n" +
                "contrário, mostre uma mensagem informando a situação.");

        System.out.print("\nInsira o ID do cliente para busca: ");
        int idCliente;
        idCliente = Integer.parseInt(cs.next());
        Cliente clienteFiltrado = clienteControlador.buscar(idCliente);

        //valida se o cliente foi encontrado ou nao
        if (clienteFiltrado == null) {
            System.out.println(" --> Não há cliente com o ID " + idCliente + "!!!");
            return;
        } else {
            System.out.println(clienteFiltrado);
        }

        // ======= PRATICA 2
        Fatura fatura = new Fatura(1, clienteFiltrado, new ArrayList<>(), 0);
        FaturaControlador faturasControlador = new FaturaControlador();
        faturasControlador.criar(fatura);

        Item biscoito = new Item(123, "Biscoito", 100, 10.0);
        Item biscoito2 = new Item(123, "Biscoito", 100, 10.0);
        faturasControlador.adicionarItem(biscoito, 1);
        faturasControlador.adicionarItem(biscoito2, 1);

        System.out.println(" ==== Fatura ====");
        faturasControlador.listar();
    }
}
