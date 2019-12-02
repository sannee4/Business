package dao;

import java.util.List;

public interface DAO<T> {
    void insert(T adr);
    T getById(int id);
    void update(T adr);
    void delete(int id);
    List<T> getAll();
}
