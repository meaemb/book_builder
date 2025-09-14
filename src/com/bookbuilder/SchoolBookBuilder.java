package com.bookbuilder;

public final class SchoolBookBuilder implements BookBuilder {
    private String title = "Untitled";
    private String author = "Unknown";
    private Book.Genre genre = Book.Genre.EDUCATION;
    private int pages = 120;
    private boolean hardCover = true;
    private String language = "EN";

    @Override public BookBuilder titled(String t) { this.title = t; return this; }
    @Override public BookBuilder authoredBy(String a) { this.author = a; return this; }
    @Override public BookBuilder ofGenre(Book.Genre g) { this.genre = g; return this; }
    @Override public BookBuilder pages(int p) { this.pages = p; return this; }
    @Override public BookBuilder hardCover(boolean e) { this.hardCover = e; return this; }
    @Override public BookBuilder language(String l) { this.language = l; return this; }

    @Override public Book build() {
        if (pages < 60) pages = 60; // учебник не может быть слишком тонким
        return new Book(title, author, genre, pages, hardCover, language);
    }
}
