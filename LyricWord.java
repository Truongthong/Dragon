package usinglist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LyricWord {

    private static final String[] lyric = {
            "you","say", "it " , "best" , "when" , "you" , "say","nothing","at","all"};

    public static void main(String[] args){
         // tạo một list implement từ ArrayList
        List words = new ArrayList();

        for (String w : lyric){
            words.add(w);

            for (Object o : words){
                System.out.print(o + " ");
                System.out.println("\n=============================");
                System.out.println("Contains [you] ?: " + words.contains("you"));
                System.out.println("Contains [me]?:"+ words.contains("me"));
                System.out.println("Where's [say]?:" + words.indexOf("say"));
                System.out.println("When's the last [say]?:"+words.lastIndexOf("say"));

            }
            System.out.println("\n=====================");
            Collections.sort(words);
            for (Object o : words){
                System.out.println(o + " ");
            }
        }
    }
}
