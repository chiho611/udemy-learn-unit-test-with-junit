package junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MyBeforeAfterTest {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("beforeAll");
    }
    @BeforeEach
    public void beforeEach() {
        System.out.println("BeforeEach");
    }
    @Test
    public void test1() {
        System.out.println("test1");
    }
    @Test
    public void test2() {
        System.out.println("test2");
    }
    @Test
    public void test3() {
        System.out.println("test3");
    }
    @AfterEach
    public void afterEach() {
        System.out.println("AfterEach");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("AfterAll");
    }
}
