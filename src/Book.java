public class Book {


    private String nameBook;
    private int agePublication;
    private Author authorBook;

    public String getNameBook()
    {
        return nameBook;
    }

    public void setNameBook(String nameBook)
    {
        this.nameBook = nameBook;
    }

    public int getAgePublication()
    {
        return agePublication;
    }

    public void setAgePublication(int agePublication)
    {
        this.agePublication = agePublication;
    }

    public Author getAuthorBook()
    {
        return authorBook;
    }

    public void setAuthorBook(Author authorBook)
    {
        this.authorBook = authorBook;
    }

    public Book(String nameBook, int agePublication, Author authorBook) {
        this.nameBook = nameBook;
        this.agePublication = agePublication;
        this.authorBook = authorBook;
    }
    @Override
    public boolean equals(Object O) {
        if (this.getClass() != O.getClass()) {
            return false;
        }
        Book book = (Book) O;
        return nameBook.equals(book.nameBook);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash();
    }


    @Override
    public String toString() {
        String Book = String.format("название книги -%s \n год написания -%d \n автор книги-%s",
                nameBook, agePublication, authorBook);
        return Book;
    }
}


