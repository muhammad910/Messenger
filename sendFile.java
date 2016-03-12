/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pesanBesar;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author mobu
 */
public class sendFile {
    public static void main(String[] args) throws IOException {
        System.out.println("tes Debug");
        ServerSocket serv=new ServerSocket(8881);
        while (true) {
            Socket sock=serv.accept();
            Path alamatFolder= Paths.get("D:\\Data Thesis\\paper thesis I\\mas\\patens.pdf");
            byte [] mybytearray=Files.readAllBytes(alamatFolder);
            OutputStream os=sock.getOutputStream();
            os.write(mybytearray, 0,mybytearray.length);
            os.flush();
            sock.close();
            
        }
        
    }
}
