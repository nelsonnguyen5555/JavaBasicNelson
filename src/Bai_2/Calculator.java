package Bai_2;

import java.sql.SQLOutput;

// BÀI TẬP PHẦN METHOD (PHƯƠNG THỨC) VÀ DATA TYPE (KIỂU DỮ LIỆU)
//
//*** Tại class Calculator:
//- Tạo hàm tính tổng 2 số nguyên
//
//- Tạo hàm tính tích 2 số thực
//
//*** Gọi lại 2 hàm trên và truyền tham số vào dưới hàm main để chạy
public class Calculator {
    public static void main(String[] args) {
        // Kiểu dữ liệu byte (-128-0-127)
        byte So_nguyen_kieu_byte_1 = -128;
        byte So_nguyen_kieu_byte_2;
        byte So_nguyen_kieu_byte_3 = 127;
        // Kiểu dữ liệu int
        int So_Nguyen_kieu_int_1 = -2147483648;
        int So_Nguyen_kieu_int_2;
        int So_Nguyen_kieu_int_3 = 2147483447;
// Kiểu dữ liệu short
        short So_Nguyen_kieu_short_1 = 32767;
        short So_Nguyen_kieu_short_2 = -32768;
        // Kiểu dữ liệu dang float
        float So_Thuc_kieu_float_1 = 2.5F;
        float So_Thuc_kieu_float_2 = 3.5F;
        // Kiểu dữ liệu dang float
        double So_thuc_kieu_double_1 = 0;
        double So_thuc_kieu_double_2 = 2.33D;


        long So_Nguyen_1 = 10L;
        long So_Nguyen_2 = 199L;

        // Tính tổng 2 số Nguyên
        System.out.println("Kết quả tổng 2 số Nguyên là " + (So_Nguyen_1 + So_Nguyen_2));
        System.out.println("Kết quả tổng 2 sô Nguyên kiểu " + (So_Nguyen_kieu_short_1 + So_Nguyen_kieu_short_2));

        // Tính tích 2 số Nguyên
        System.out.println("Kết quả tích 2 số Nguyên là " + (So_Nguyen_1 * So_Nguyen_2));
        System.out.println("Kết quả tích 2 số Nguyên là " + (So_thuc_kieu_double_1 * So_thuc_kieu_double_2));
        System.out.println("Kết quả tích 2 số Nguyên dạng double " + (So_Thuc_kieu_float_1 * So_thuc_kieu_double_2));
        //Tính thương
        System.out.println("kết quả chia cho 0 " + (So_thuc_kieu_double_2 / So_thuc_kieu_double_1));

        //Phép lấy modul
        System.out.println("Phần dư của phép chia là " + So_Nguyen_1 % So_Nguyen_2);

        // So sánh bằng
        System.out.println("kiểm tra 2 toán tử " + (So_nguyen_kieu_byte_1 == So_Nguyen_kieu_int_1));

        // So sánh khac
        System.out.println("kiểm tra 2 toán tử " + (So_nguyen_kieu_byte_1 != So_Nguyen_kieu_int_1));
    }
}
