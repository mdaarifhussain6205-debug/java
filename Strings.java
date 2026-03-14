import java.util.*;
public class Strings {
    public static void main(String args[]) {

     
      // String name1 = "Aarif";
      // String name2 = "Aarif2 ";

      // // compare name1 and name2
      // if(name1.compareTo(name2)==0){
      //   System.out.println("name are same");
      // }else {
      //   System.out.println("name are not same");
      // }
    //   String sentence = " my name is Aarif";
    //   String name = sentence.substring(0,11);

    //  System.out.println(name);
    // StringBuilder sb = new StringBuilder("Aarif");
    // System.out.println(sb);
    // System.out.println(sb.charAt(0));
    // sb.setCharAt(0, 't');
    // System.out.println(sb);
    // sb.insert(2 ,'a');
    // System.out.println(sb);
    // sb.delete(3,4);
    // System.out.println(sb);

    // StringBuilder sb = new StringBuilder("hello");
    // for ( int i =0; i < sb.length()/2;i++){
    //   int front = i;
    //   int back = sb.length()-1-i;

    //   char frontChar = sb.charAt(front);
    //   char backChar = sb.charAt(back);


    //   sb.setCharAt(front, backChar);
    //   sb.setCharAt(back, frontChar);
    // }
    // System.out.println(sb);

    Scanner sc = new Scanner(System.in);
    int oper = sc.nextInt();
    int n = 5;
    int pos = 1 ;


    int bitMask = 1<<pos;
    if (oper ==1){
      int newNumber  = bitMask | n;
      System.out.println(newNumber);
    }else {
      int newBitMask = ~(bitMask);
      int newNumber = newBitMask & n;
      System.out.println(newNumber);
    }
    // int notBitMask = ~(bitMask);

    // int newNumber = notBitMask & n;
    // System.out.println(newNumber);

    sc.close();
    }
}
