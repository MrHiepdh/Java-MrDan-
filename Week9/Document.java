package Week9;
//vấn đề của e bài này là phần đếm từ và phần định dạng vẫn còn case mà e chưa xử lí đc
// ví dụ e nhập chuỗi : "cao" sapce tab tab tab space space + "hiep" thì có khi nó lại trả về có một dấu tab ở trc từ thứ 2 và đếm thành 3 từ
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

    public int countA(){
        int count = 0;
        String temp = str.toLowerCase();
        for(int i=0;i<temp.length();i++){
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        return count;
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
            ss = ss.trim();
            count++;
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
