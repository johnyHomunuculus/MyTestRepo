package Task1;

public class Main {
    public static void main(String[] args) {
        var clazz = TestClass.class;
        var annotation = clazz.getAnnotation(IsLike.class);
        var isLike = annotation.isLike();
        System.out.println("class: " + clazz);
        System.out.println("annotation: " + annotation);
        System.out.println("isLike: " + isLike);

        var clazz2 = TestClass2.class;
        var annotation2 = clazz2.getAnnotation(IsLike.class);
        System.out.println("class2: " + clazz2);
        System.out.println("annotation2: " + annotation2);
    }

    @IsLike(isLike = true)
    public static class TestClass{

    }

    public static class TestClass2{

    }
}
