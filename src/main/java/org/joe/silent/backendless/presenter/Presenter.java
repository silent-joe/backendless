package org.joe.silent.backendless.presenter;

import org.joe.silent.backendless.model.Model;
import org.joe.silent.backendless.view.IView;

public class Presenter implements IPresenter {

    private IView view;
    private Model model;

    public Presenter(IView view){
        this.view = view;
        this.model = new Model();
    }

    public void onCreate(String name) {
        model.create(name);
        view.show();
    }

    public void onRead() {
        model.read();
        view.show();
    }

    public void onUpdate(String objectId, String newName) {
        model.update(objectId, newName);
        view.show();
    }

    public void onDelete(String objectId) {
        model.delete(objectId);
        view.show();
    }
}
