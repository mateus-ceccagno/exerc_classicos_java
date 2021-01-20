package fibonacci;

public class Fibonacci {
    static long fibo(int n) {
        int atual = 0;
        int ant = 0;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                atual = 1;
                ant = 0;
                
            } else {
                atual += ant;
                ant = atual - ant;
            }   
            
        } 
        return atual;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print("Fibonacci(" + i + "):" + Fibonacci.fibo(i) + "\n");
        }
    }
}