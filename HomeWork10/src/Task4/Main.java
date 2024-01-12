package Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var interfaces = getAllInterfaces(ArrayList.class);

        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }
    }

    public static List<Class<?>> getAllInterfaces(Class<?> clazz) {
        List<Class<?>> interfaces = new ArrayList<>();

        while (clazz != null) {
            var classInterfaces = Arrays.asList(clazz.getInterfaces());
            interfaces.addAll(classInterfaces);
            for (Class<?> anInterface : classInterfaces) {
                interfaces.addAll(getAllInterfaces(anInterface));
            }

            clazz = clazz.getSuperclass();
        }
        return interfaces;
    }
}
