/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pesanBesar;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author mobu
 */
public class clientJar {
    public static void main(String[] args) throws UnknownHostException, IOException {
        System.out.println("client up");
        Socket socket = new Socket("80.79.23.193", 8881);
        while (true) {
            System.out.println("kaberreehh beuhhh");
        }
    }
    
}
