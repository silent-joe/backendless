package org.joe.silent.backendless.model;

public class Model implements IModel {

    public void create(String name) {
        Requests.create(name);
    }

    public void read() {
        Requests.read();
    }

    public void update(String objectId, String newName) {
        Requests.update(objectId, newName);
    }

    public void delete(String objectId) {
        Requests.delete(objectId);
    }

}
