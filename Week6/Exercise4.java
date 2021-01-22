package Week6;

public class Exercise4 {
    // sử dụng hàm cắt chuỗi và viết hoa chữ cái đầu
    public static void solve(String str) {
        String[] form = str.split("\\s");
        int n = form.length;
        String form1[] = new String[n];
        String result = "";
        for (int i = 0; i < n; i++) {
            form1[i] = form[i].toLowerCase();
        }
        result += form1[n - 1].substring(0, 1).toUpperCase() + form1[n - 1].substring(1) + " ";
        for (int i = 0; i < n - 1; i++) {
            result += form1[i].substring(0, 1).toUpperCase() + form1[i].substring(1) + " ";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        solve("Nguyen Van NAM");
    }
}
