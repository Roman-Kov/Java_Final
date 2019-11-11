public class Test1 {
    private static Calc calc;

    @BeforeSuite
    public static void init(){
        System.out.println("BeforeSuite");
        calc = new Calc(10, 5);
    }

    @Test (priority = 1)
    public static void test1(){
        System.out.println("Test 1 summ");
        if (calc.summ() == 15) System.out.println("OK");
        else System.out.println("Fail");
    }

    @Test (priority = 2)
    public static void test2(){
        System.out.println("Test 2 diff");
        if (calc.diff() == 5) System.out.println("OK");
        else System.out.println("Fail");

    }

    @Test (priority = 3)
    public static void test3(){
        System.out.println("Test 3 mult");
        if (calc.mult() == 50) System.out.println("OK");
        else System.out.println("Fail");

    }

    @AfterSuite
    public static void fin(){
        System.out.println("AfterSuite");
    }
}
