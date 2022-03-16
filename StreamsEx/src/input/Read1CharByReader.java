/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author Admin
 */
public class Read1CharByReader {
    public static void main(String[] args) throws IOException{
        InputStreamReader isrdr;
        isrdr = new InputStreamReader(System.in);
        //Đọc 1 kí tự 
        System.out.print("Mời nhập 1 kí tự: ");
        int kt = isrdr.read();
        System.out.println("Kí tự bạn vừa nhập là: " + (char)kt);
    }
}
