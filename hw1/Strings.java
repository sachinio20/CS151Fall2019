
import java.util.*;


import java.lang.*;
import java.lang.StringBuilder;
import java.lang.Character;

public class Strings {

    public static String uniqueLetters(String str){
        ArrayList<Character> dontAdd = new ArrayList<>();
        StringBuilder uniqueBuilder =  new StringBuilder();

        for(int i = 0; i < str.length();i++){
            for(int j = i+1; j < str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    dontAdd.add(str.charAt(i));
                }
            }
            if(!dontAdd.contains(str.charAt(i))){
                uniqueBuilder.append(str.charAt(i));
            }
        }


        return uniqueBuilder.toString();
        
    }
    

    public static void main(String [] args){
        String test1 = Strings.uniqueLetters("harrasses");
        System.out.println(test1);
    }
}
