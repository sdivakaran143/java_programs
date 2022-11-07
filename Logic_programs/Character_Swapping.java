/*
 Character Swapping

Digiro likes character swapping, So help him by writing a code to implement
character swapping with his rules. A sentence is given as input which contains one
or more words and the words are separated by space only. You need to swap
characters with in every pair of words from left to right in the given
sentence.

Character Swapping rules are given below for every pair of
words(two words in pair called as first word and second word)

1. First character in the first word is swapped with first character in second
word for swapping, second character in the first word is swapped with second
character in second word,...so on.

2. If a character in the first word does not contains a matching character in
the second word for swapping, then simply move that character to beginning of
second word.

3. If a character in the second word does not contains matching character in
the first word, then simply move that character to beginning of first word.

4. If a word in a sentence is not having pair, then simply reverse that word.

5. After performing above set of operations, Change the first character in
every word as upper case and all other characters are lower case.



Example 1:

Input: Tody is preassessment

  Take first pair of words: Tody & is

               
replace T with i,

               
replace o with s,

                the
characters from first word d and y are not have the matching character in the
pair word(second word), so simply move thse character in to second word
begining   

                so
after swapping words are is & ydTo

               
Third word is not have the pair so reverse it.i.e. tnemssessaerp.

               
After applying fifth(5) rule the output: Is Ydto Tnemssessaerp

Output: Is Ydto Tnemssessaerp


Note: Every word in
the given sentence contains only alphabetic characters.



Input format: A line contains input sentence.

Output format: A line contains output sentence.
 */
import java.util.Scanner;
 public class Character_Swapping {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        String str ="Tody is preassessment";
        // String str ="iam harish preassessment is";

        String[] arr=str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            int slen=arr[i].length();
            int s=i;int t=i+1;
            try{if(arr[i].length()>arr[i+1].length()){
                slen=arr[i+1].length();s=i+1;t--;
            }}
            catch(Exception e){
                arr[i]=new StringBuilder(arr[i]).reverse().toString();
                break;
            }
            String st=new StringBuilder(arr[t].substring(slen)).reverse().toString();
            arr[t]=st+arr[t].substring(0,slen);
            String sub=arr[t];
            arr[t]=arr[s];
            arr[s]=sub;i++;
        }
        String output="";
        for (String string : arr) {
            output+=string+" ";
        }
        System.out.print(output);
    }
}
