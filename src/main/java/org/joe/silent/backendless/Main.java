package org.joe.silent.backendless;

import org.joe.silent.backendless.presenter.Presenter;
import org.joe.silent.backendless.view.View;

public class Main {

    public static void main(String[] args) {
        Presenter presenter = new Presenter(new View());
        System.out.println("We added a new person with the Name1, now the table looks like this:");
        presenter.onCreate("Name1");
        System.out.println("Read table:");
        presenter.onRead();
        System.out.println("We update person BobUpdate, now the table looks like this:");
        presenter.onUpdate("A8450494-D94A-5268-FF55-5B7CF1540300", "BobUpdate");
        System.out.println("We delete person BobDelete, now the table looks like this:");
        presenter.onDelete("623BBF0B-34C3-4B15-FF9C-484B00829800");
    }

}
