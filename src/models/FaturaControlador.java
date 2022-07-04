package models;

import java.util.ArrayList;

public class FaturaControlador implements Crud<Fatura>{

    private ArrayList<Fatura> faturas;

    public FaturaControlador() {
        faturas = new ArrayList<>();
    }

    public void adicionarItem(Item item, int idFatura) {
        try {
            Fatura fatura = this.buscar(idFatura);
            fatura.getItems().add(item);
        } catch (NullPointerException e) {
            System.out.println("Fatura de id" + idFatura + "nao encontrado");
        }
    }

    @Override
    public void criar(Fatura obj) {
        this.faturas.add(obj);
    }

    @Override
    public void editar(Fatura obj) {
        return;
    }

    @Override
    public Fatura buscar(int id) {
        for (Fatura f : this.faturas) {
            if (f.getId() == id) {
                return f;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Fatura> listar() {
        System.out.println(this.faturas);
        return this.faturas;
    }

    @Override
    public void deletar(int id) {
        return;
    }
}
