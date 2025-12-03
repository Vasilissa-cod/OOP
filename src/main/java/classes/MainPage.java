package classes;

// Класс для хранения информации о веб-странице
public class MainPage {

    // Поля класса
    public String url;
    public String title;
    public int size;

    // Конструктор без параметров
    public MainPage() {
        this.url = "";
        this.title = "";
        this.size = 0;
    }

    // Конструктор с одним параметром (только url)
    public MainPage(String url) {
        this.url = url;
        this.title = "";
        this.size = 0;
    }

    // Конструктор с тремя параметрами
    public MainPage(String url, String title, int size) {
        this.url = url;
        this.title = title;
        this.size = size;
    }

    // Метод проверки размера страницы
    public void isSizeLessThen(int maxSize) {
        if (this.size < maxSize) {
            System.out.println("Page \"" + title + "\" (" + url + "): size " + size + " < " + maxSize + " - TRUE");
        } else {
            System.out.println("Page \"" + title + "\" (" + url + "): size " + size + " >= " + maxSize + " - FALSE");
        }
    }
}

