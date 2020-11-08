package Lesson5;

class Employee {

    // Создаем переменные
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;
    private String maritalStatus;

    Employee(String name, String position,
             String email, String phoneNumber,
             int salary, int age, String maritalStatus) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
        this.maritalStatus = maritalStatus;
    }
    // Создаем метод возвращающий возраст(age)
    public int findOutAge() {
        return age;
    }
    // Метод, выводящий в консоль данные сотрудников
    void data() {
        System.out.println(name + " ;" + position + " ;"
                + email + " ;" + phoneNumber + " ;" + salary + " ;"
                + age + " ;" + maritalStatus + " ;");
    }
}
