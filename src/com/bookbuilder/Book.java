package com.bookbuilder;

import java.util.Objects;

public final class Book {
    public enum Genre { EDUCATION, FICTION, NONFICTION, FANTASY, SCIENCE, MOTIVATIONAL }

    private final String title;
    private final String author;
    private final Genre genre;
    private final int pages;
    private final boolean hardCover;
    private final String language;

    Book(String title, String author, Genre genre, int pages, boolean hardCover, String language) {
        this.title = Objects.requireNonNull(title, "title").trim();
        this.author = Objects.requireNonNull(author, "author").trim();
        this.genre = Objects.requireNonNull(genre, "genre");
        this.pages = pages;
        this.hardCover = hardCover;
        this.language = Objects.requireNonNull(language, "language").trim();
        validate();
    }

    private void validate() {
        if (title.isEmpty()) throw new IllegalArgumentException("title must not be blank");
        if (author.isEmpty()) throw new IllegalArgumentException("author must not be blank");
        if (pages < 1) throw new IllegalArgumentException("pages must be >= 1");
        if (language.isEmpty()) throw new IllegalArgumentException("language must not be blank");
    }

    public String title() { return title; }
    public String author() { return author; }
    public Genre genre() { return genre; }
    public int pages() { return pages; }
    public boolean hardCover() { return hardCover; }
    public String language() { return language; }

    @Override public String toString() {
        return "Book{title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre=" + genre +
                ", pages=" + pages +
                ", hardCover=" + hardCover +
                ", language='" + language + '\'' +
                '}';
    }
}
