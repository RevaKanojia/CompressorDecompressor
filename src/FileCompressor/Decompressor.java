/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filecompressor;

import java.io.*;
import java.util.zip.GZIPInputStream;
public class Decompressor {
    public static void method(File file) throws IOException {
        String fileDir = file.getParent();
        System.out.print(fileDir);
        FileInputStream in = new FileInputStream(file);
        FileOutputStream out = new FileOutputStream(fileDir + "DCompressed.txt");
        GZIPInputStream zip = new GZIPInputStream(in);
        
        byte [] read = new byte [1024];
        int len = 0;
        while((len = zip.read(read)) != -1) {
            out.write(read, 0, len);
        }
        zip.close();
        in.close();
        out.close();
    }
}
/*
String fileDir = file.getParent(); 
        System.out.print(fileDir);
        FileInputStream fin = new FileInputStream(file);
        FileOutputStream fout = new FileOutputStream(fileDir + "/newww.gz");
        
        GZIPOutputStream gzip = new GZIPOutputStream(fout);
        
        byte [] buffer = new byte[2048];
        int len;
        while((len = fin.read(buffer)) != -1)  {
        gzip.write(buffer, 0, len);
        }
     
        gzip.close();
        fout.close();
        fin.close();
*/
