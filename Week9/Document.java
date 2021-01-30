package Week9;

//vấn đề của e bài này là phần đếm từ và phần định dạng vẫn còn case mà e chưa xử lí đc
// ví dụ e nhập chuỗi : "cao" sapce tab tab tab space space + "hiep" thì có khi nó lại trả về có một dấu tab ở trc từ thứ 2 và đếm thành 3 từ
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public int countA() {
        int count = 0;
        String temp = str.toLowerCase();
        for (int i = 0; i < temp.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }

    public String setFormat() {// khi chữa bài a giải thích rõ giúp e về cái split vs ạ,cách nó lưu trữ các từ
                               // sau khi bị tách
        str = str.trim();// remove leading and trailing spaces
        String regex = "[\\s]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str = matcher.replaceAll(" ");
        }
        return str;
    }

    public int countWord() {
        str = str.trim();// remove leading and trailing spaces
        String regex = "[\\s]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str = matcher.replaceAll(" ");
        }
        int count = 1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
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
        System.out.println(doc.countA());
        sc.close();
    }
}
