class Calculator {
    int a = 9; // For using this instance variable you have to use object name

    public int add(int a, int b) {
        return a + b;
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Calculator a1 = new Calculator();  // This is how you create a object
        Calculator a2 = new Calculator();
//        System.out.println(a1.add(4, 5));
        a2.a = 55; // This will change only this Object
        System.out.println(a1.a); // a1.a for using instance variable
        System.out.println(a2.a);
    }
}
