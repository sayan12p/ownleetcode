package first.String;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimplifyPath {
    public static String simplifyPath(String path) {
    String[] dir=path.split("/");
    ArrayDeque queue=new ArrayDeque();
    for(String s:dir){
        if(s.equals(".") || s.isEmpty())
            continue;
        else if(s.equals("..")){
            if(!queue.isEmpty())
                queue.pollLast();
        }
        else
            queue.offer(s);
    }
    StringBuilder sb=new StringBuilder();
        while(!queue.isEmpty())
        sb.append("/"+queue.pollFirst());
        return sb.length()>0?sb.toString():"/";
}
    public static void main(String[] args) {
        String path="/a/../b/c";
        System.out.println(simplifyPath(path));
    }
}
