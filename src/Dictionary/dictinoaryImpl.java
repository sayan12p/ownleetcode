package Dictionary;



import java.util.HashMap;


 class Dictionary {

     boolean iswordend;
     public HashMap<Character, Dictionary> trieHashMap;
     public String meaning;

     public Dictionary() {
         this.iswordend = false;
         this.trieHashMap = new HashMap<>();
         this.meaning = "";
     }
 }
 public class dictinoaryImpl {
     public static void insertWord( Dictionary root,String s, String meaning) {
         Dictionary temp = root;
         for (int i = 0; i < s.length(); i++) {
             char c = s.charAt(i);
             if (!temp.trieHashMap.containsKey(c)) {
                 temp.trieHashMap.put(c, new Dictionary());
             }
             temp = temp.trieHashMap.get(c);
         }
         temp.iswordend = true;
         temp.meaning = meaning;
     }

     public static String getmeaning(Dictionary d, String word) {
         Dictionary temp = d;
         for (int i = 0; i < word.length(); i++) {
             char c = word.charAt(i);
             if (temp.trieHashMap.containsKey(c)) temp = temp.trieHashMap.get(c);
             else return "";
         }
         if (temp.iswordend) {
             return temp.meaning;
         }
         return "";
     }

     public static void main(String[] args) {
         Dictionary root=new Dictionary();
         insertWord(root, "language", "the method of human communication");
         insertWord(root, "computer", "A computer is a machine that can be instructed to carry out sequences of arithmetic or logical operations automatically via computer programming");
         insertWord(root, "map", "a diagrammatic representation of an area");
         insertWord(root, "book", "a written or printed work consisting of pages glued or sewn together along one side and bound in covers.");
         insertWord(root, "science", "the intellectual and practical activity encompassing the systematic study of the structure and behaviour of the physical and natural world through observation and experiment.");
         System.out.println(getmeaning(root,"language"));
     }
 }


