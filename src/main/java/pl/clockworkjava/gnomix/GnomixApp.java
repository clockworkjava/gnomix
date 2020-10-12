package pl.clockworkjava.gnomix;

import pl.clockworkjava.gnomix.ui.text.TextMainView;

import java.io.IOException;

public class GnomixApp {

    public static void main(String[] args) throws IOException {
        TextMainView view = new TextMainView();
        view.init();
    }
}
