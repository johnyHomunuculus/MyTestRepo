package Task2;

import Task1.IsLike;

import java.lang.annotation.AnnotationTypeMismatchException;

public class Main {
    public static void main(String[] args) {
        printIsLike(TestClass.class);
        printIsLike(TestClass2.class);
    }

    public static void printIsLike(Class<?> clazz) throws AnnotationTypeMismatchException {
        var annotation = clazz.getAnnotation(IsLike.class);

        if (annotation == null){
            System.out.println("Аннотация IsLike в классе " + clazz.getName() + " не найдена.");
            return;
        }

        System.out.println(annotation.isLike());
    }

    @IsLike(isLike = true)
    public static class TestClass{

    }

    public static class TestClass2{

    }
}
