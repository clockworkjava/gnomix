package pl.clockworkjava.gnomix;

import pl.clockworkjava.gnomix.domain.book.BookRepository;
import pl.clockworkjava.gnomix.domain.book.BookService;
import pl.clockworkjava.gnomix.ui.text.TextMainView;

import java.io.IOException;

public class GnomixApp {

    public static void main(String[] args) throws IOException {

        BookRepository bookRepository = new BookRepository();
        BookService bookService = new BookService(bookRepository);

        TextMainView view = new TextMainView(bookService);
        view.init();
    }
}
