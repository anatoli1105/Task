
public class Main {
    public static void main(String[] args) {
        Author author1=new Author("александр","пушкин",34);
        Book book1=new Book("сказка",1666,author1);
        System.out.println(book1);
        System.out.println("===========================");
        Author author2=new Author("иван","иванов",23);
        Book book2=new Book("мурзилка",1999,author2);
        System.out.println(book2+"\n=======================");
        Author author3=new Author("bill","geitc",19);
        Book book3=new Book("Windows",1990,author3);
        System.out.println(book3+"\n==============================");
        book2.setAgePublication(2021);
        System.out.println(book2);
        Author author4=new Author("александр","пушкин",34);
        Book book4=new Book("текст",234,author4);

        System.out.println("============================");

        if (author4.equals(author1)){
            System.out.println("у книг  автор "+ book1.getAuthorBook());
        }
        else {
            System.out.println("у книг разные авторы");
        }




    }



}