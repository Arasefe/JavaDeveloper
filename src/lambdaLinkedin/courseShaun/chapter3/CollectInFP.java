package lambdaLinkedin.courseShaun.chapter3;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectInFP {
    public static void main(String[] args) {
        String[]wordsArr={"Hello","functional","programming","is","cool"};
        List<String> words=new ArrayList<>(Arrays.asList(wordsArr));

        words.stream().filter(w->w.length()>5).collect(Collectors.toList());
        words.stream().filter(w->w.length()>5).collect(Collectors.toSet());
        words.stream().filter(w->w.length()>5).collect(Collectors.joining());
        Map<Integer,List<String>>wordLengthMap=words.stream().filter(w->w.length()>5).collect(Collectors.groupingBy(
                (word)->word.length()
        ));
        System.out.println(wordLengthMap);
    }
}
