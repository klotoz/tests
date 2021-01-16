package homework7;

public class Test {

    @BeforeSuite
    public static void before(){
        System.out.println("Before test");
    }

 /*   @BeforeSuite
    public static void before1(){
        System.out.println("Before1 test");
    } */

    @Test1(priority = 2)
    public static void addTest1(){
        System.out.println("test 1, pr2");
    }

    @Test1(priority = 4)
    public static void addTest2(){
        System.out.println("test 2, pr4");
    }

    @Test1(priority = 6)
    public static void addTest3(){
        System.out.println("test 3, pr6");
    }

    @Test1(priority = 9)
    public static void addTest4(){
        System.out.println("test 4, pr9");
    }

    @Test1(priority = 6)
    public static void addTest5(){
        System.out.println("test 5, pr6");
    }

    @AfterSuite
    public static void after(){
        System.out.println("After test");
    }

/*    @AfterSuite
    public static void after1(){
        System.out.println("After1 test");
    } */
}
