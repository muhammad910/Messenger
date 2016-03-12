
package pesanBesar;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author mobu
 */
public class FileReceiver {
    public static void main(String[] args) throws UnknownHostException, IOException {
         
         Socket socket = new Socket("127.0.0.1", 1234);
        
         
         
//         int buffer_Size=102400000;
        byte[] buffer = new byte[1024];
//         
         BufferedInputStream in = new BufferedInputStream(socket.getInputStream());
          BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("D:\\DataDiterima.mp4"));
               
          int len = 0;
          while ((len = in.read(buffer)) > 0) {
               out.write(buffer, 0, len);
          }
          
          out.flush();
          socket.close();
          in.close();
          out.close();
    }
    
}
