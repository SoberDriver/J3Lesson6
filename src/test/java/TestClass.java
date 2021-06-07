
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class TestClass {
    private MainClass mainClass;
    //тесты для первого задания
    private int[] firstAttempt = {1,2,3,4,5,6};
    private int[] firstResult = {5,6};
    private int[] secondAttempt = {1,4,4,4,4,5};
    private int[] secondResult = {5};
    private int[] thirdAttempt = {4,1,2,3,5,6,7,8};
    private int[] thirdResult = {1,2,3,5,6,7,8};
    private int[] lastAttempt = {1,2,5,6,7,8};
    //тесты для второго задания
    private int[] firstTest = {1,1,1,1,1,1};
    private int[] secondTest = {4,4,1,4,4};
    private int[] thirdTest = {4,4,4,4};
    private int[] lastTest = {1,3,4,4,4,5};

    @BeforeEach
    public void init() {
        mainClass = new MainClass();
    }
    @Test
    public void firstArrayTest() {
        Assertions.assertArrayEquals(firstResult, mainClass.firstTask(firstAttempt));
    }
    @Test
    public void secondArrayTest() {
        Assertions.assertArrayEquals(secondResult, mainClass.firstTask(secondAttempt));
    }
    @Test
    public void thirdArrayTest() {
        Assertions.assertArrayEquals(thirdResult, mainClass.firstTask(thirdAttempt));
    }
    @Test
    public void lastArrayTest() {
        Assertions.assertThrows(RuntimeException.class, () ->{
             mainClass.firstTask(lastAttempt);
        });
    }
    @Test
    public void firstBooleanTest() {
        Assertions.assertTrue(mainClass.secondTask(firstTest));
    }
    @Test
    public void secondBooleanTest() {
        Assertions.assertTrue(mainClass.secondTask(secondTest));
    }
    @Test
    public void thirdBooleanTest() {
        Assertions.assertTrue(mainClass.secondTask(thirdTest));
    }@Test
    public void lastBooleanTest() {
        Assertions.assertTrue(mainClass.secondTask(lastTest));
    }

}