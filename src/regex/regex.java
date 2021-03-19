package regex;

import javax.imageio.stream.ImageInputStream;

public class regex {
    /**
     * Trường hợp: PASS_HAVE_SPECIAL_CHAR = 1, PASS_HAVE_UPPPER_CHAR  = 1
     * Mật khẩu phải thỏa mãn các điều kiện sau:
     * Có độ dài từ 8 đến 20 ký tự
     * Chứa ít nhất 01 ký tự số, 01 ký tự chữ Hoa và 01 ký tự đặc biệt
     * Ví dụ: B@123456; 123456@D; 151215V@
     */
    public static void test1(){
        String regex1 = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,20}$";
        String regex2 = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,20}$";
        String regex3 = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d@$!%*#?&]{8,20}$";
        String regex4 = "^(?=.*[a-zA-Z])(?=.*\\d)[A-Za-z\\d@$!%*#?&]{8,20}$";

    }

    public static void main(String[] args) {
        System.out.println("thangnd");
    }

}
