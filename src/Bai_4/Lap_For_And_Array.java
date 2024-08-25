package Bai_4;
//BÀI TẬP PHẦN VÒNG LẶP FOR VÀ MẢNG
//
//- Tạo vòng lặp FOR để in ra các số chẵn từ 0 đến 50
//- Tạo mảng để lưu những số chẵn đó vào
//- Duyệt mảng để in ra kết quả sau khi nạp vào
public class Lap_For_And_Array {
    //câu lệnh if (condition){}
    public static void main(String[] args) {
        int age = 20;
        String Address = "Cần Thơ, Bình Dương, Sóc Trăng, Vĩnh Long, Hậu Giang";
        // Hàm if else như excel, nếu đúng lấy giá trị true, nếu sai lâý giá trị false
        //Có thể dùng nhiều if lồng vào nhau
        if (age > 18 && Address.equals ("Bình Dương"))
        // So sánh bằng
        // Số nên sử dụng ==
        // Chuỗi nên sử dụng " .equals"
        {
            System.out.println("Đi Nghĩa vụ quân sự");
        } else {
            System.out.println("miễn nghĩa vụ quân sự");
        }
    };
}