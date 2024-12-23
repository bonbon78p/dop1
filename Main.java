public class Main {
    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell", 1949);
        book.go();

        Women woman = new Women("Alice", 25);
        woman.inputAge(30);
        woman.printAge();
    }
}