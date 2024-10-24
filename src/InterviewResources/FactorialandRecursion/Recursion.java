package InterviewResources.FactorialandRecursion;

public class Recursion {


public int Recursion(int n){
    if (n == 0 || n == 1) {
        return 1;
    }
    else
       return n = n*Recursion(n-1);
}

public int ForLoopRecursion(int n){
    int value = 1;

    if (n == 0 || n == 1) {
        return 1;
    }

    for (int i = 1; i <= n; i++) {
     value *= i;
    }
    return value;

    /*
    *  Advanced for-loop
    *
    * for (int i : IntStream.rangeClosed(1, n).toArray())
    * {result *= i;}
    *
    * */
}

public String hey(){
    return "Hi";
}

}