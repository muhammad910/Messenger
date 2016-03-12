package pesanBesar;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;

public class FileSender {
    
public static void main(String[] args) throws IOException {
        System.out.println("mulai..");     
        ServerSocket servsock = new ServerSocket(1234);
        Socket sock = servsock.accept();
        System.out.println("koneksi terbentuk");
        
//        int buffer_Size=102400000;
        byte[] buffer = new byte[1024];
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("D:\\cinema\\Ceramah\\ceramah.mp4"));
        BufferedOutputStream out = new BufferedOutputStream(sock.getOutputStream());
//        
        int len = 0;
        while ((len = in.read(buffer)) > 0) {
               out.write(buffer, 0, len);
          }
        out.flush();
        servsock.close();
        sock.close();
    }
}