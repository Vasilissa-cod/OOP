import classes.Book;

public class BookWorld {

    public static void main(String[] args) {
        // Создаем первый объект book1 по чертежу Book
        Book book1 = new Book();

        // Задаем состояние объекта book1
        book1.title = "Война и мир";
        book1.author = "Лев Толстой";
        book1.pages = 1274;

        // Вызываем метод displayInfo для book1
        System.out.println("--- Книга 1 ---");
        book1.displayInfo();

        // Создаем второй объект book2 по чертежу Book
        Book book2 = new Book();

        // Задаем состояние объекта book2
        book2.title = "Преступление и наказание";
        book2.author = "Федор Достоевский";
        book2.pages = 671;

        // Вызываем метод displayInfo для book2
        System.out.println("\n--- Книга 2 ---");
        book2.displayInfo();
    }
}


