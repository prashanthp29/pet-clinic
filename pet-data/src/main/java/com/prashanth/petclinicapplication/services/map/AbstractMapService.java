package com.prashanth.petclinicapplication.services.map;

import com.prashanth.petclinicapplication.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        /*object.getId() cannot to resolve to type - is not identifying the object here so T extends BaseEntity
        * and T save(ID id, T object) - id is never used we ll remove it*/
        if(object != null) {
            if(object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        }
        else {
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId() {
        /*max(java.util.Collections<? extends ?>) cannot be applied to (java.util.Set<ID>)
        * So changing AbstractMapService<ID extends Long> and Map<ID> to Map<Long> */

        /*if the set has null element then throw the exception and add nextId = 1
        * else increment the nextId and hold it - to pass the value to save() while creating new Set*/

        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        }
        catch (NoSuchElementException nsee) {
            nextId = 1L;
        }
        return nextId;
    }
}
