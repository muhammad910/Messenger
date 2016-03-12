/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pesanBesar;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author mobu
 */
public class serverJar {
    public static void main(String[] args) throws IOException {
        System.out.println("server up");
        ServerSocket serv=new ServerSocket(8881);
        while (true) {
            Socket sock=serv.accept();
            System.out.println("koneksi telah berhasil");
            
        }
        
        
    }
}
