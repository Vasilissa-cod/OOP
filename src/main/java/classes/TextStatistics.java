package classes;

// Класс для подсчета статистики по тексту
public class TextStatistics {

    // Метод для подсчета количества слов в тексте
    public int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        // Разделяем текст по пробелам и считаем непустые слова
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    // Метод для подсчета количества символов в тексте
    public int countCharacters(String text) {
        if (text == null) {
            return 0;
        }
        return text.length();
    }

    // Метод для вывода полной статистики
    public void displayStatistics(String text) {
        System.out.println("--- Статистика по тексту ---");
        System.out.println("Количество символов: " + countCharacters(text));
        System.out.println("Количество слов: " + countWords(text));
    }
}


