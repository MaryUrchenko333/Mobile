import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Интерфейс для телефонного справочника
interface PhoneBook {
    void add(String surname, String phoneNumber);
    List<String> get(String surname);
}

// Реализация интерфейса PhoneBook
class SimplePhoneBook implements PhoneBook {
    private Map<String, List<String>> phoneBook;

    public SimplePhoneBook() {
        phoneBook = new HashMap<>();
    }

    // Метод для добавления записи
    @Override
    public void add(String surname, String phoneNumber) {
        phoneBook.putIfAbsent(surname, new ArrayList<>());
        phoneBook.get(surname).add(phoneNumber);
    }

    // Метод для получения номеров по фамилии
    @Override
    public List<String> get(String surname) {
        return phoneBook.getOrDefault(surname, new ArrayList<>());
    }
}

// Класс для демонстрации работы телефонного справочника
public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр телефонного справочника
        PhoneBook phoneBook = new SimplePhoneBook();

        // Добавляем записи
        phoneBook.add("Иванов", "123-456");
        phoneBook.add("Иванов", "987-654");
        phoneBook.add("Петров", "555-555");
        phoneBook.add("Сидоров", "111-222");

        // Ищем номера по фамилии
        System.out.println("Телефоны Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Петрова: " + phoneBook.get("Петров"));
        System.out.println("Телефоны Сидорова: " + phoneBook.get("Сидоров"));
        System.out.println("Телефоны несуществующего: " + phoneBook.get("Неизвестный"));
    }
}
