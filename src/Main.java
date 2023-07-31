public class Main {
    public static void main(String[] args){
        Book book1 = new Book();
        book1.setId(542290);
        book1.setBookNumber(1);
        book1.setName("Granny in the kitchen");
        book1.setPrice(12);


        Laptop laptop1 = new Laptop();
        laptop1.setId(2334);
        laptop1.setLaptopNumber(1);
        laptop1.setModel("Dell");
        laptop1.setName("Gillian's laptop");
        laptop1.setPrice(500);

        Student  student1 = new Student();
        student1.setId(1);
        student1.setFirstName("Gillian");
        student1.setLastName("James");
        student1.setAge(20);
        student1.setIdNumber("63-2281605N05");
        student1.setLaptop(laptop1);
        student1.setBook(book1);

        LaptopServiceImp serviceImp = new LaptopServiceImp();
                Laptop laptop = serviceImp.createLaptop(laptop1);
        System.out.println("You have managed to create a laptop file with the following details:");
        System.out.println(laptop.getName());
        System.out.println(laptop.getModel());
        System.out.println(laptop.getLaptopNumber());
        System.out.println(laptop.getPrice());

        BookServiceImp serviceImp1 = new BookServiceImp();
        Book book = serviceImp1.createBook(book1);
        System.out.println("You have managed to create a book file with the following details:");
        System.out.println(book.getName());
        System.out.println(book.getBookNumber());
        System.out.println(book.getPrice());
    }
}