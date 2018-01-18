package com.thephoenixit.mygymclub.services;

import java.util.Collection;

/**
 * Created by root on 18/01/19.
 */

public interface IEntityRepository<T> {

    T create(T entity);

    T update(T entity, Object entity_id);

    void delete(Object entity_id);

    T findOneById(Object entity_id);

    Collection<T> findAll();
}
