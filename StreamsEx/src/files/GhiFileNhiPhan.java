/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author Admin
 */
public class GhiFileNhiPhan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here\
        OutputStream os;
        // tạo vào file
        FileOutputStream FOut = new FileOutputStream("test.dat");
        // gắn os vào fout
        os = FOut;
        // tạo và gắn vào DataOutputStream
        DataOutputStream dtOut = new DataOutputStream(FOut);
        // ghi dl
        dtOut.writeInt(123);
        dtOut.writeDouble(4.5);
        dtOut.writeUTF("Lớp 60 61 MMT");
        
        os.close();
        FOut.close();
        System.out.println("Hoàn thành. Đã ghi xong file");
    }
    
}
