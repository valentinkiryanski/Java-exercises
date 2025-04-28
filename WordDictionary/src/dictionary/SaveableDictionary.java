package dictionary;
import java.io.PrintWriter;
import java.util.*;
import java.nio.file.Paths;

public class SaveableDictionary {

    public static void main(String[] args) {
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        boolean wasSuccessful = dictionary.load();

        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }

        dictionary.add("alpha","jfjfj");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));
        dictionary.save();
    }

    private String file;

    private HashMap<String,String> dictionary;

    public SaveableDictionary(){
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file){
        this.file = file;
        this.dictionary = new HashMap<>();
    }

    public boolean save(){
        try(PrintWriter pw = new PrintWriter(file)){
            for(String key : dictionary.keySet()){
                pw.println(key + ":" + dictionary.get(key));
            }
            pw.close();
            return true;

        }catch(Exception e ){

            return false;
        }
    }

    public boolean load(){
        boolean isTrue = true;
        try(Scanner reader = new Scanner(Paths.get(this.file))){
            isTrue = true;
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String [] words = line.split(":");
                dictionary.put(words[0],words[1]);


            }

        }catch(Exception e) {
            System.out.println("No such file");
            isTrue = false;
        }
        return isTrue;
    }

    public void add(String words, String translation){
        for(String word : dictionary.keySet()){
            if(word.equals(words)){
                return;
            }
        }
        dictionary.put(words,translation);
    }

    public String translate(String word){
        for(String s : dictionary.keySet()){
            if(s.equals(word)){
                return dictionary.get(word);
            }
        }
        for(String s : dictionary.values()){
            if(s.equals(word)){
                for(String w : dictionary.keySet()){
                    if(dictionary.get(w).equals(word)){
                        return w;
                    }
                }
            }
        }

        return null;
    }

    public void delete(String word){
        for(String s : dictionary.keySet()){
            if(s.equals(word)){
                dictionary.remove(s);
                return;
            }
        }
        String key = null;
        for(String ss : dictionary.keySet()){
            if(dictionary.get(ss).equals(word)){
                key = ss;
            }
        }
        dictionary.remove(key);

    }

}
