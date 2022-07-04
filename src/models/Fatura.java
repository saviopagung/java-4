package models;

import java.util.List;

public class Fatura {
    private int id;
    private Cliente cliente;
    private List<Item> items;
    private double valorTotal;

    public Fatura(Cliente cliente, List<Item> items, double valorTotal) {
        this.cliente = cliente;
        this.items = items;
        this.valorTotal = valorTotal;
    }

    public Fatura() {
        this.cliente = null;
        this.items = null;
        this.valorTotal = 0;
    }

    public Fatura(int id, Cliente cliente, List<Item> items, double valorTotal) {
        this.id = id;
        this.cliente = cliente;
        this.items = items;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void setItem(Item item) {
        this.items.add(item);
    }

    public void set(List<Item> items) {
        this.items = items;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Item> getItems() {
        return items;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Fatura{" +
                "cliente=" + cliente +
                ", items=" + items +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
