/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pesanBesar;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author mobu
 */
public class receiveBesar {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket sock=new Socket("127.0.0.1",8881);
        byte [] mybyteArray=new byte [1024000000];
        InputStream is =sock.getInputStream();
        FileOutputStream fos=new FileOutputStream("D:\\data1.pdf");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        int byteRead=is.read(mybyteArray,0,mybyteArray.length);
        bos.write(mybyteArray, 0, byteRead);
        bos.close();
        sock.close();
        
    }
    
}
