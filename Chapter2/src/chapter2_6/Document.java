
package chapter2_6;

import java.util.HashMap;
import java.util.StringTokenizer;

/*
 * @author Bui Truong Minh Tuan
 * Date : 8/9/2016
 * Version : 1.0
 * 
 */
public class Document {

    private HashMap<String, Integer> words;

    public Document() {
        this.words = new HashMap<String, Integer>();
    }

    public void tokenize(String document) {
        //Split sentence;
        StringTokenizer multiTokenizer = new StringTokenizer(document);
        while (multiTokenizer.hasMoreTokens()) {
            String word = multiTokenizer.nextToken();
            if (this.words.containsKey(word)) {
                int oldValue = this.words.get(word);
                this.words.replace(word, oldValue + 1);
            } else {
                this.words.put(word, 1);
            }
        }
    }

    public void showInfo() {
        System.out.println("== Tokens in document ==");
        for (Object object : words.keySet()) {
            System.out.print("["+object+"]");
            System.out.println(" Has "+this.words.get(object));
        }
    }
}
