import java.util.*;

public class QuoteSwap{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        System.out.println(quoteSwap(list));
    }

    public static ArrayList<String> quoteSwap(ArrayList<String> mylist){
        Collections.swap(mylist, 2, 5);

        String quote = "";

        for (String words : mylist
             ) {
            quote += words + " ";
        }

        return mylist;

    }
}