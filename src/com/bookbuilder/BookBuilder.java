package com.bookbuilder;

public interface BookBuilder {
    BookBuilder titled(String title);
    BookBuilder authoredBy(String author);
    BookBuilder ofGenre(Book.Genre genre);
    BookBuilder pages(int pages);
    BookBuilder hardCover(boolean enabled);
    BookBuilder language(String language);
    Book build();
}
