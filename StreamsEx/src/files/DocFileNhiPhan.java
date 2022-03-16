/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Admin
 */
public class DocFileNhiPhan {
    public static void main(String[] args) throws IOException{
        // TODO code application logic here\
        InputStream is;
        // tạo vào file
        FileInputStream FIn = new FileInputStream("test.dat");
        // gắn is vào fin
        is = FIn;
        // tạo và gắn vào DataInputStream
        DataInputStream dtIn = new DataInputStream(FIn);
        // doc dl
        int a = dtIn.readInt();
        double b = dtIn.readDouble();
        String chuoi = dtIn.readUTF();
        
        dtIn.close();
        is.close();
        FIn.close();
        
        System.out.println("Đọc xong file. Dữ liệu là \n");
        System.out.println(a);
        System.out.println(b);
        System.out.println(chuoi);
    }
    
    
}
