# Book Builder Project (Java)

## Description
This project shows how to use the **Builder design pattern** in Java.  
The example product is a **Book**. With the builder we can create a book step by step (title, author, genre, etc.) without writing long constructors.

## Project Files
Book.java-the product (book object, has validation, immutable)

BookBuilder.java-the builder interface (methods for setting parts)

SchoolBookBuilder.java-concrete builder for textbooks

NovelBookBuilder.java-concrete builder for novels

BookDirector.java-helps to create predefined books (math textbook, fantasy novel)

Demo.java-main class with examples

## How to Run
1. Open the project in IntelliJ IDEA.
2. Run Demo.java.
3. You will see three books printed in the console: a school book, a novel and a custom one.

## Clean Code Notes
Method names are clear (titled, authoredBy, pages, etc.).

Each method does one thing.

The Book object cannot be changed after creation.

Builder collects the data, and build() makes the final book.

## Why Builder?
It makes the code easier to read and understand.  
Instead of one big constructor, we build the object step by step.  
It also allows different types of books using the same process.
