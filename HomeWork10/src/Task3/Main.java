package Task3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        aPrintCustom(new APrinter());
    }

    public static void aPrintCustom(APrinter printer) {
        try {
            Method aPrintMethod = printer.getClass().getDeclaredMethod("print", int.class);
            aPrintMethod.invoke(printer, 123);
        } catch (NoSuchMethodException | InvocationTargetException |
                 IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
