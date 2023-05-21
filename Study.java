class Calculator {
    int result = 0;

    int add(int num){
        result += num;
        return result;
    }

    int sub(int num){
        result -= num;
        return result;
    }
}

public class Study {
    public static void main(String[] args) {
        Calculator ca = new Calculator();
        Calculator ca1 = new Calculator();

        
        System.out.println(ca.add(3));
        System.out.println(ca1.add(4));

        System.out.println(ca.sub(1));
        System.out.println(ca1.sub(2));
    }
}

