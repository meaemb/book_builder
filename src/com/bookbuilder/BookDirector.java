package com.bookbuilder;

public final class BookDirector {
    public Book makeMathTextbook(BookBuilder b) {
        return b.titled("Algebra Basics")
                .authoredBy("A. Smith")
                .ofGenre(Book.Genre.EDUCATION)
                .pages(180)
                .hardCover(true)
                .language("EN")
                .build();
    }

    public Book makeFantasyNovel(BookBuilder b) {
        return b.titled("Dragon Valley")
                .authoredBy("L. Green")
                .ofGenre(Book.Genre.FANTASY)
                .pages(320)
                .hardCover(false)
                .language("EN")
                .build();
    }
}
