package Lesson5;

public class Main {
    public static void main(String[] args) {

        // Объявляем массив сотрудников
        Employee[] peoplesBox = new Employee[5];
        // Заполняем каждую ячейку массива данными
        peoplesBox[0] = new Employee("Erlan Akzhanov", "Teacher",
                "erlan-kz@mail.ru", "+7(937)111-11-11",
                200000, 36, "married");

        peoplesBox[1] = new Employee("Aleksandra Khornyuhina", "Senior curator",
                "sasha-msk@mail.ru", "+7(937)222-22-22",
                150000, 31, "single");

        peoplesBox[2] = new Employee("Kirill Kachalov", "Curator",
                "kirill-msk@mail.ru", "+7(937)333-33-33",
                100000, 26, "married");

        peoplesBox[3] = new Employee("Nataliya Sklyarenko", "Curator",
                "natasha-msk@mail.ru", "+7(937)444-44-44",
                100000, 27, "single");

        peoplesBox[4] = new Employee("Igor Zabaluev", "Student",
                "zabaluev-vlg@mail.ru", "+7(937)093-32-76",
                50000, 35, "married");

        // Создаем условие для вывода сотрудников старше 30 лет
        int i = 0;
        while (i < peoplesBox.length) {
            if (peoplesBox[i].findOutAge() > 30) {
                peoplesBox[i].data();
            }
            i++;
        }
    }
}
