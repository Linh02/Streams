/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Admin
 */
public class Read1CharByInputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //tạo một đối tượng của lớp InputStream
        InputStream is;
        //gắn nó với luồng nhập chuẩn (bàn phím)
        is = System.in;
        //Đọc 1 kí tự
        try {
            int kt = is.read();
            // in ra
            System.out.println("Ký tự vừa nhập là: " + kt);
        } catch (IOException e){
            e.printStackTrace();
            //nơi xử lý nếu có ngoại lệ xảy ra
        }
    }
    
}
