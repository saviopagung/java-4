package models;

import java.util.ArrayList;

public interface Crud <T>{
    void criar(T obj);
    void editar(T obj);
    T buscar(int id);
    ArrayList<T> listar();
    void deletar(T obj);
}
