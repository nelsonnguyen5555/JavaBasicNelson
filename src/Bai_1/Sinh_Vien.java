package Bai_1;//BÀI TẬP PHẦN VARIABLES (BIẾN)
//- Tạo project mới dành cho bài tập
//- Tạo class: SinhVien, ThongTin
//- Class SinhVien: khai báo 3 loại biến (local, instance, static) gọi lại in ra ở hàm main


public class Sinh_Vien {
    public void getInfo() {
        String Tinh_Thanh_Pho = "Cần Thơ";
        String Quan = "Ninh Kiều";
        System.out.println(Tinh_Thanh_Pho);
    }
    // Tạo Bien Static ngoài hàm Main (Tiết kiệm bộ nhớ và khai báo 1 lần dùng chung cho nhiều lần)
    public static String Truong = "Trường Phan Ngọc Hiển";
    public static int So_bao_danh = 1;
    public static String Ho_va_Ten = "Nguyễn Văn A";
    public static String Ngay_Sinh = "01/01/1991";
    public static String Gender = "Nam";
    //Hàm Main chính
    public static void main(String[] args) {

        Sinh_Vien bienLocal1 = new Sinh_Vien();    //Khỏi tạo object class
        // gọi tên class đặt tên biến mới  = new tên class đó
       bienLocal1.getInfo();  // Gọi biến biên vừa tao
        System.out.println(bienLocal1.Tinh_Thanh_Pho);
        int Khoi = 12;
       String Lop = "12B1";
        System.out.println(Truong);
        System.out.println(So_bao_danh);
        System.out.println(Ho_va_Ten);
        System.out.println(Ngay_Sinh);
        System.out.println(Gender);
        System.out.println(Khoi);
        System.out.println(Lop);
    }
}
