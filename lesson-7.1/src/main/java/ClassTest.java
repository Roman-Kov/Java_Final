import br.com.objectos.core.util.ArrayListMultimap;
import br.com.objectos.core.util.Multimap;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;


public class ClassTest {
    public static void start(Class testClass) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = testClass.getDeclaredMethods();

        //Multimap<Integer, Method> sortedMethods = ArrayListMultimap.create();
        TreeMap sortedMethods = new TreeMap<Integer, Method>();

        //Запускаем BeforeSuite
        int counter = 0;
        for (Method o : methods) {
            if(o.getAnnotation(BeforeSuite.class) != null) {
                if (counter == 0) o.invoke(null);
                else throw new RuntimeException("BeforeSuite больше 1 раза");
            }
        }


        //Запускаем Тесты
        for (Method o : methods) {
            if(o.getAnnotation(Test.class) != null) {
                //o.invoke(null);
                sortedMethods.put(o.getAnnotation(Test.class).priority(), o);
            }
        }

        Set keys = sortedMethods.keySet();
        for (Iterator i = keys.iterator(); i.hasNext();) {
            Integer key = (Integer) i.next();
            Method value = (Method) sortedMethods.get(key);
            //System.out.println(key + " = " + value);
            value.invoke(null);
        }



        //Запускаем AfterSuite
        counter = 0;
        for (Method o : methods) {
            if(o.getAnnotation(AfterSuite.class) != null) {
                if (counter == 0) o.invoke(null);
                else throw new RuntimeException("AfterSuite больше 1 раза");
            }
        }
    }
}
