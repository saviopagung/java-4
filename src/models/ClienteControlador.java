package models;

import java.util.List;
import java.util.ArrayList;

public class ClienteControlador implements Crud<Cliente>{

    private ArrayList<Cliente> clientes;

    public ClienteControlador() {
        clientes = new ArrayList<>();
    }

    @Override
    public void criar(Cliente obj) {
         clientes.add(obj);
    }

    @Override
    public void editar(Cliente obj) {

    }

    @Override
    public Cliente buscar(int id) {
        for (Cliente c : this.clientes) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Cliente> listar() {
        Utils.imprimirLista(this.clientes);
        return this.clientes;
    }

    @Override
    public void deletar(int id) {
        this.clientes.remove(id);
    }
}
