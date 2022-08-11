package Principal;

public class FibonacciAula {
    private int n;

    public FibonacciAula(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    private int recursivo(int n){
        if(n==0 || n==1) return n;
        return(recursivo(n-1) + recursivo(n-2));
    }

    public int calculo(){
        return(recursivo(this.n));
    }
}
