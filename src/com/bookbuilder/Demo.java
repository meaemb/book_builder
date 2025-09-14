package com.bookbuilder;

public final class Demo {
    public static void main(String[] args) {
        BookDirector director = new BookDirector();

        Book math = director.makeMathTextbook(new SchoolBookBuilder());
        Book fantasy = director.makeFantasyNovel(new NovelBookBuilder());

        Book custom = new NovelBookBuilder()
                .titled("Q π Я")
                .authoredBy("Quansyh Shonbay")
                .ofGenre(Book.Genre.MOTIVATIONAL)
                .pages(244)
                .hardCover(true)
                .language("KZ")
                .build();

        System.out.println("TEXTBOOK: " + math);
        System.out.println("FANTASY:  " + fantasy);
        System.out.println("CUSTOM:   " + custom);
    }
}
