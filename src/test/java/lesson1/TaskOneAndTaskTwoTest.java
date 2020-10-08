package lesson1;


import org.testng.annotations.Test;

public class TaskOneAndTaskTwoTest {

    @Test
    public void testName() {
        int[] array = new int[15];
        TestTaskOneAndTaskTwo.testArraysSort(array);
    }




}
