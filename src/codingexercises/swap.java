package codingexercises;

public class swap {

int var1 , var2;

public swap () {

}

    public int [] swapValues (int a , int b) {
    int temp;

    temp = b;
    b = a;
    a = temp;

   return new int [] {a , b};

    }

    public static void main (String[] args) {
     swap sw = new swap();
     int [] answer = sw.swapValues(5,10);
     System.out.println("\n Swapped values: a = "+answer[0]+ ", b = " +answer[1]);
    }

}

/*
* 10.2.24
*
* Simple class created to swap two variables
*
*
*
* */