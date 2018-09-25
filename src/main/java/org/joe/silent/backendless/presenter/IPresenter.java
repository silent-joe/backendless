package org.joe.silent.backendless.presenter;

public interface IPresenter {

    void onCreate(String name);

    void onRead();

    void onUpdate(String objectId, String newName);

    void onDelete(String objectId);

}
