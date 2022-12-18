package it.DevelHope.ExerciseJava29;

public class Start {

    public static void main(String[] args) {

        String string1 = "Hello";
        String string2 = "How are you?";

        //ASSIGN OF beginIndex AND endIndex TO THE SUBSTRING 1 AND 2
        String sub1 = string1.substring(0,2);
        String sub2 = string2.substring(10,12);

        //CONCATENATE THE SUB1 AND THE SUB2
        String sub3 = sub1 + sub2;

        //DEDICATED ARRAY
        char[] charArray = sub3.toCharArray();
        System.out.println(charArray);
    }
}
