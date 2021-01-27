package Week9;

import java.util.Scanner;

public class Document {
    public static final char tab = '\t';
    public static final char breakLine = '\n';
    public static final char space = ' ';
    private String str;

    public Document() {
    }

    public Document(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String setFormat() {// khi chữa bài a giải thích rõ giúp e về cái split vs ạ,cách nó lưu trữ các từ
                               // sau khi bị tách
        str = str.trim();// remove leading and trailing spaces
        String[] result = str.split(" \\s");// Separate words according to a space
        String temp = "";
        for (String ss : result) {
            ss = ss.trim();
            temp += ss + " ";
        }
        str = temp;
        return str;
    }

    public int countWord() {
        if (str == null) {
            return 0;
        }
        int count = 1;
        str = str.trim();// remove leading and trailing spaces
        String[] result = str.split(" \\s");
        for (String ss : result) {
            count++;
        }
        // return result[0].length();
        return count;
    }
}

class run5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Document doc = new Document(str);
        System.out.println(doc.setFormat());
        System.out.println(doc.countWord());
        sc.close();
    }
}
