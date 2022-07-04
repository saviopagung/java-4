import models.Cliente;
import models.Fatura;
import models.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // =======  PRATICA 1
        Scanner cs = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente(1 , "Guilherme", "Blanck"));
        clientes.add(new Cliente(2 , "Melina", "Araujo"));
        clientes.add(new Cliente(3 , "Hellena", "Pagung"));

        System.out.println("## Percorrer a lista de clientes e mostrar ");
        imprimirLista(clientes);

        System.out.println("\n## Excluir da lista e remover os restantes ");
        clientes.remove(1);
        imprimirLista(clientes);

        System.out.println("\n## Solicite o número de identificação de um cliente pelo teclado para\n" +
                "procurá-lo. Se o cliente estiver na lista, mostre seus dados, caso\n" +
                "contrário, mostre uma mensagem informando a situação.");

        System.out.print("\nInsira o ID do cliente para busca: ");
        int idCliente;
        idCliente = Integer.parseInt(cs.next());
        Cliente clienteFiltrado = buscarCliente(clientes, idCliente);

        //valida se o cliente foi encontrado ou nao
        if (clienteFiltrado == null) {
            System.out.println(" --> Não há cliente com o ID " + idCliente + "!!!");
            return;
        } else {
            System.out.println(clienteFiltrado);
        }

        // ======= PRATICA 2
        List<Fatura> faturas = new ArrayList<>();

        Item biscoito = new Item(123, "Biscoito", 100, 10.0);
        List<Item> items = new ArrayList<>();
        items.add(biscoito);

        //double valorTotal = items.stream().reduce(0, (subtotal, element) -> element.getPreco() + subtotal  )
        double valorTotal = 0;
        for (Item i : items) {
            valorTotal += i.getPreco();
        }

        Fatura fatura = new Fatura(clienteFiltrado, items, valorTotal);

        System.out.println(" ==== Fatura ====");
        System.out.println(fatura);
    }

    public static void imprimirLista(List list){
        list.forEach(System.out::println);
    }

    public static Cliente buscarCliente(List<Cliente> clientes, int id) {
        for (Cliente c : clientes) {
            if (c.getId() == id){
                return c;
            }
        }
        return null;
    }
}
