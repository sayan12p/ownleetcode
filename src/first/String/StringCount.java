package first.String;

public class StringCount {

    public static void main(String[] args) {
//        String s="good morning have a nice morning nice are nothing";
//        String[] sarray=s.split(" ");
//        String collect = Arrays.stream(sarray).distinct().collect(Collectors.joining(" "));
//        System.out.println(collect);
        //output="k2p4a2b1z3x2k3";
        String s = "kkppppaabzzzxxkkk";
        int count = 1;
        StringBuilder sb = new StringBuilder();
        char current = s.charAt(0);int i=0;
        for (; i < s.length()-1; i++) {
            if (current == s.charAt(i+1)) {
                count++;
                continue;
            }
            if (current != s.charAt(i + 1)) {
                sb = sb.append(current);
                sb = sb.append(count);
                current = s.charAt(i + 1);
                count = 1;
            }
        }
        sb.append(s.charAt(s.length()-1));
        sb.append(count);
        System.out.println(sb);
    }
}
