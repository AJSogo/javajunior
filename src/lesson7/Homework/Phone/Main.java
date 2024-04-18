package lesson7.Homework.Phone;

public class Main {


    public static void main(String[] args) {
        Phone phone1 = new Phone(79384662, "IPhone", 300 );
        Phone phone2 = new Phone(79882638, "Samsung", 350);
        Phone phone3 = new Phone(791845656, "Meizu", 400);

        phone1.display(); //phone - это ссылка на объект под именем аккаунт
        phone2.display();
        phone3.display();

    }
}
