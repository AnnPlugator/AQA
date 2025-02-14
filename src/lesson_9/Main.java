package lesson_9;

public class Main {
    public static void main(String[] args) {
        // Task 1
        String[] words = {
                "яблоко", "банан", "апельсин", "яблоко", "киви", "банан",
                "виноград", "груша", "киви", "яблоко", "персик", "манго",
                "виноград", "апельсин", "персик"
        };

        // Создаем объект WordProcessor и запускаем метод processWords
        UniqueWords wordProcessor = new UniqueWords();
        wordProcessor.processWords(words);

        // Разделяем вывод
        System.out.println("\n--- Телефонный справочник ---");

        // Task 2
        // Создаем объект PhoneBook
        PhoneBook phoneBook = new PhoneBook();

        // Добавляем записи в телефонный справочник
        phoneBook.add("Иванов", "8-0214-434550");
        phoneBook.add("Ночевной", "8-029-2906089");
        phoneBook.add("Волчинский", "8-033-6112365");
        phoneBook.add("Кириллов", "8-017-2545632");
        // Поиск номеров по фамилии
        System.out.println("Телефоны Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Ночевной: " + phoneBook.get("Ночевной"));
        System.out.println("Телефоны Волчинский: " + phoneBook.get("Волчинский"));
        System.out.println("Телефоны Кириллов: " + phoneBook.get("Кириллов"));
    }
}
