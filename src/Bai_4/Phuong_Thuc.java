package Bai_4;

import javax.imageio.stream.ImageInputStream;

public class Phuong_Thuc {
    public double sum;
    public double res;

    // Hàm không trả về kết quả
    public void Cong2So() {
        int a = 5;
        int b = 10;
        sum = a + b;
    }
    ;
    public static void main(String[] args) {
        //Khỏi tạo object class, đối tượng class
        // gọi tên class đặt tên biến mới  = new tên class đó
        Phuong_Thuc phuongThuc = new Phuong_Thuc();
        phuongThuc.Cong2So();
        //Gọi biến thì lấy theo biến, gán biến phương thức đã khai báo, với biến cần gọi
        //Đối tượng class.tên biến hoặc gọi trực tiếp biến
        System.out.println(phuongThuc.sum);







        //số chăn là số chia hết cho 2
        for(int i = 0; i <= 50; i++) {
            if(i %2 == 0) {
                System.out.print(i + " ");
            }
        }
        // Hàm kiểm tra số lẻ
        for(int i = 0; i <= 50; i++) {

            if(i %2 != 0) {
                System.out.println(i + " ");
            }
        }

    }

}