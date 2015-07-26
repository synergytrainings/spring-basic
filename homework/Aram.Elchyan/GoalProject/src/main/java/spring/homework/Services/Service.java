package spring.homework.Services;

import java.util.List;

/**
 * Created by Aram on 7/25/2015.
 */
public interface Service<T> {
    public T save(T element);

    public void update(T element);

    public void delete(T element);

    public List<T> getAll();
}
