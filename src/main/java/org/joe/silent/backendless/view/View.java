package org.joe.silent.backendless.view;

import org.joe.silent.backendless.model.Requests;
import org.joe.silent.backendless.presenter.IPresenter;
import org.joe.silent.backendless.presenter.Presenter;

public class View implements IView{

    private IPresenter presenter;

    public View(){
        this.presenter = new Presenter(this);
    }

    public void show() {
        System.out.println(Requests.show());
    }

}
