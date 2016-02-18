package com.synisys.spring.project.service;

import java.util.List;

/**
 * @author vahe.marikyan
 * @since 2/13/2016.
 */
public interface Service<T> {
    void save(T element);

    void update(T element);

    void delete(T element);

    List<T> loadAll();
}
