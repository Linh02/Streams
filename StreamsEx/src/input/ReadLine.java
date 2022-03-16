/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Admin
 */
public class ReadLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        // Tạo 1 dt của lớp InputStreamReader
        InputStreamReader isRdr;
        // gắn nó với luồng nhập chuẩn 
        isRdr = new InputStreamReader(System.in);
        // tạo dt BufferedReader
        BufferedReader buffReader = new BufferedReader(isRdr);
        // đọc 1 chuỗi từ bàn phím 
        System.out.println("Mời nhập 1 chuỗi kí tự: ");
        String strLine = buffReader.readLine();
        // xuất ra màn hình 
        System.out.println("Chuỗi kí tự bạn nhập là : " + strLine);
        
        
    }
    
}
