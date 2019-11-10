public class Test1 {
    @BeforeSuite
    public void init(){
        System.out.println("BeforeSuite");
        Calc calc = new Calc(10, 5);
    }

    @Test
    public void test1(){
        System.out.println("Test 1");
        Assert.assertEquals(15, calc.summ());
    }

    @Test
    public void test2(){

    }

    @Test
    public void test3(){

    }

    @AfterSuite
    public void fin(){
        System.out.println("AfterSuite");
    }
}
