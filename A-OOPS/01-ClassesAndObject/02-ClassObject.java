class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Calculator a1 = new Calculator();  // This is how you create a object
        System.out.println(a1.add(4, 5));
    }
}
