import classes.MainPage;

public class MainPageDemo {

    public static void main(String[] args) {
        // Создаем первый объект с помощью конструктора без параметров
        MainPage page1 = new MainPage();
        page1.url = "https://example.com";
        page1.title = "Example";
        page1.size = 500;

        // Создаем второй объект с помощью конструктора с одним параметром
        MainPage page2 = new MainPage("https://google.com");
        page2.title = "Google";
        page2.size = 1500;

        // Создаем третий объект с помощью конструктора с тремя параметрами
        MainPage page3 = new MainPage("https://github.com", "GitHub", 3000);

        // Проверяем размер для каждой страницы
        System.out.println("--- Page size check ---");
        page1.isSizeLessThen(1000);  // 500 < 1000 - true
        page2.isSizeLessThen(1000);  // 1500 < 1000 - false
        page3.isSizeLessThen(5000);  // 3000 < 5000 - true
    }
}

