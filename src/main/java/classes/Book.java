package classes;

// Создаем класс (чертеж)
public class Book {

    // Состояние (поля класса)
    public String title;
    public String author;
    public int pages;

    // Поведение (методы класса)
    public void displayInfo() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Количество страниц: " + pages);
    }
}