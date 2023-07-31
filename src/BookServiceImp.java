public class BookServiceImp implements BookInterface{

    @Override
    public Book createBook(Book book) {
        Book book1=new Book();
        book1.setBookNumber(56);
        book1.setName("Introduction to Programming");
        book1.setPrice(12);
        return book1;
    }
}
