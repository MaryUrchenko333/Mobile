// Главный класс с методом main
public class Main {
    
    // Вложенный класс Сотрудник
    static class Сотрудник {
        private String fio;
        private String dolzhnost;
        private String email;
        private String telefon;
        private double zarplata;
        private int vozrast;

        // Конструктор
        public Сотрудник(String fio, String dolzhnost, String email, String telefon, double zarplata, int vozrast) {
            this.fio = fio;
            this.dolzhnost = dolzhnost;
            this.email = email;
            this.telefon = telefon;
            this.zarplata = zarplata;
            this.vozrast = vozrast;
        }

        // Метод для вывода информации о сотруднике
        public void printInfo() {
            System.out.println("ФИО: " + fio);
            System.out.println("Должность: " + dolzhnost);
            System.out.println("Email: " + email);
            System.out.println("Телефон: " + telefon);
            System.out.println("Зарплата: " + zarplata);
            System.out.println("Возраст: " + vozrast);
            System.out.println();
        }

        // Метод для получения возраста
        public int getVozrast() {
            return vozrast;
        }
    }

    public static void main(String[] args) {
        // Создание массива сотрудников
        Сотрудник[] sotrudniki = new Сотрудник[5];
        sotrudniki[0] = new Сотрудник("Иванов Иван Иванович", "Менеджер", "ivanov@example.com", "+7 (999) 123-45-67", 50000, 45);
        sotrudniki[1] = new Сотрудник("Петров Петр Петрович", "Разработчик", "petrov@example.com", "+7 (999) 234-56-78", 70000, 35);
        sotrudniki[2] = new Сотрудник("Сидоров Сидор Сидорович", "Директор", "sidorov@example.com", "+7 (999) 345-67-89", 100000, 50);
        sotrudniki[3] = new Сотрудник("Алексеева Александра Сергеевна", "HR", "aleksееva@example.com", "+7 (999) 456-78-90", 60000, 42);
        sotrudniki[4] = new Сотрудник("Кузнецов Николай Викторович", "Аналитик", "kuznetsov@example.com", "+7 (999) 567-89-01", 55000, 30);

        // Вывод информации о сотрудниках старше 40 лет
        for (Сотрудник sotrudnik : sotrudniki) {
            if (sotrudnik.getVozrast() > 40) {
                sotrudnik.printInfo();
            }
        }
    }
}
