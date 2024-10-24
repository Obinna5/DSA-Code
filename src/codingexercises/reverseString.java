package codingexercises;

import codingexercises.Arithmetic;

public class reverseString extends Arithmetic{

    String str;

    public reverseString(){
     //   this.str = str;
    }

    public String reverse(String s){
        String newStr = "";
        char [] charStr = s.toCharArray();
        for (int i = charStr.length-1; i>=0; i--)
        {
            newStr += charStr[i];
        }
       return newStr;
    }

    public void addition(){
        int result = add(5,5);
        System.out.println(result);
    }
}

/*
* 10.2.24
*
* Create new string variable to populate
* Convert input string into character array
* Create for-loop where "i" is the end of the word length, while decrementing down to 0.
* Reverse the string by creating a loop to concatenate each letter starting from the end of the string
*
* !! Eventually create a terminal condition: if (str = null) -> Output error or return.
*
* Users can also use a built-in function: StringBuilder(), append(), and the reverse() function.
* StringBuilder SB = new StringBuilder();
* SB.append(s1);
* SB.reverse();
*
*
* */