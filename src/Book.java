public class Book {
    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getAgePublication() {
        return agePublication;
    }

    public void setAgePublication(int agePublication) {
        this.agePublication = agePublication;
    }

    public Author getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(Author authorBook) {
        this.authorBook = authorBook;
    }

    private String nameBook;
    private int agePublication;
    Author authorBook;

    public Book(String nameBook, int agePublication, Author authorBook) {
        this.nameBook = nameBook;
        this.agePublication = agePublication;
        this.authorBook = authorBook;
    }

    @Override
    public String toString() {
        String Book = String.format("%s \n %d \n %s", nameBook, agePublication, authorBook);
        return Book;
    }
}
