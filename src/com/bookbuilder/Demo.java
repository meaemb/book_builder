package com.bookbuilder;

public final class Demo {
    public static void main(String[] args) {
        BookDirector director = new BookDirector();

        Book math = director.makeMathTextbook(new SchoolBookBuilder());
        Book fantasy = director.makeFantasyNovel(new NovelBookBuilder());

        Book custom = new NovelBookBuilder()
                .titled("Midnight City")
                .authoredBy("I. Petrov")
                .ofGenre(Book.Genre.FICTION)
                .pages(200)
                .hardCover(true)
                .language("RU")
                .build();

        System.out.println("TEXTBOOK: " + math);
        System.out.println("FANTASY:  " + fantasy);
        System.out.println("CUSTOM:   " + custom);
    }
}
