package homework7;

public class MainApp {
    public static void main(String[] args) {
        Class tc = Test1.class;
        try {
            TestClass.start(tc);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
