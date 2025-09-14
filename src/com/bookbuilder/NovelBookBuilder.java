package com.bookbuilder;

public final class NovelBookBuilder implements BookBuilder {
    private String title = "Untitled Novel";
    private String author = "Unknown";
    private Book.Genre genre = Book.Genre.FICTION;
    private int pages = 250;
    private boolean hardCover = false;
    private String language = "EN";

    @Override public BookBuilder titled(String t) { this.title = t; return this; }
    @Override public BookBuilder authoredBy(String a) { this.author = a; return this; }
    @Override public BookBuilder ofGenre(Book.Genre g) { this.genre = g; return this; }
    @Override public BookBuilder pages(int p) { this.pages = p; return this; }
    @Override public BookBuilder hardCover(boolean e) { this.hardCover = e; return this; }
    @Override public BookBuilder language(String l) { this.language = l; return this; }

    @Override public Book build() {
        if (pages < 80) pages = 80; // роман тоже слишком маленьким не делаем
        return new Book(title, author, genre, pages, hardCover, language);
    }
}
