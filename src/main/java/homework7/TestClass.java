package homework7;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;

public class TestClass {


    public static void start(Class obj) throws Exception {
        Class c = Test.class;
        Object testObj = c.newInstance();
        ArrayList<Method> arrList = new ArrayList<>();
        Method beforeMethod = null;
        Method afterMethod = null;
        for (Method o : c.getDeclaredMethods()) {
            if (o.isAnnotationPresent(Test1.class)) {
                arrList.add(o);
            }
            if (o.isAnnotationPresent(BeforeSuite.class)) {
                if (beforeMethod == null) beforeMethod = o;
                else throw new RuntimeException("Больше одного метода с аннотацией BeforeSuite");
            }
            if (o.isAnnotationPresent(AfterSuite.class)) {
                if (afterMethod == null) afterMethod = o;
                else throw new RuntimeException("Больше одного метода с аннотацией AfterSuite");
            }
            arrList.sort(Comparator.comparingInt(o2 -> o2.getAnnotation(Test1.class).priority()));
        }

        if (beforeMethod != null) beforeMethod.invoke(testObj, null);
        for (Method o : arrList) o.invoke(testObj, null);
        if (afterMethod != null) afterMethod.invoke(testObj, null);
    }
}
