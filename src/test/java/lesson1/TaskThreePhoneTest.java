package lesson1;


import org.testng.annotations.Test;

public class TaskThreePhoneTest {
    @Test
    public void testName() {
        TestTaskThreePhone endValueAndManufacturer = new TestTaskThreePhone("5000", "Xiaomi");
        System.out.println("Стоимость телефона: "+endValueAndManufacturer.getValue()+
                "\nПроизводитель телефона: "+endValueAndManufacturer.getManufacturer());
    }
}
