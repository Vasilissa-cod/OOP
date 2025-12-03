package classes;

// Создаем класс (чертеж)
public class Cat {

    // Состояние (поля класса)
    public String name;
    public int age;
    public String color;

    // Поведение (методы класса)
    public void meow() {
        System.out.println("Meay, i am  " + name);
    }

    public void eat() {
        System.out.println(name + " eating.");
    }
}

