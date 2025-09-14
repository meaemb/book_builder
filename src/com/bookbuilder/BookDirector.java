package com.bookbuilder;

public final class BookDirector {
    public Book makeMathTextbook(BookBuilder b) {
        return b.titled("Calculus 1")
                .authoredBy("A. Herman")
                .ofGenre(Book.Genre.EDUCATION)
                .pages(874)
                .hardCover(true)
                .language("EN")
                .build();
    }

    public Book makeFantasyNovel(BookBuilder b) {
        return b.titled("Tar jol taigaq keshu")
                .authoredBy("S.Seifulin")
                .ofGenre(Book.Genre.FICTION)
                .pages(350)
                .hardCover(true)
                .language("KZ")
                .build();
    }
}
