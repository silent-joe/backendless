package org.joe.silent.backendless.model;

public interface IModel {

    void create(String name);

    void read();

    void update(String objectId, String newName);

    void delete(String objectId);

}
