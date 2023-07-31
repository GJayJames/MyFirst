
    public class Student {
        private int id;
        private String firstName;
        private String lastName;
        private int age;
        private String idNumber;

        private Laptop laptop;
        private Book book;

        public Student(int id, String firstName, String lastName, int age, String idNumber, Laptop laptop, Book book) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.idNumber = idNumber;

            this.laptop = laptop;
            this.book = book;
        }
            public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getIdNumber() {
            return idNumber;
        }

        public void setIdNumber(String idNumber) {
            this.idNumber = idNumber;
        }



        public Student() {

        }

        public Laptop getLaptop() {
            return laptop;
        }

        public void setLaptop(Laptop laptop) {
            this.laptop = laptop;
        }

        public Book getBook() {
            return book;
        }

        public void setBook(Book book) {
            this.book = book;
        }
    }