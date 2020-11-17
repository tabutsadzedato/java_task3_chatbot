package ge.edu.btu.chat.server;

import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args){
        try{
            ServerSocket sock=new ServerSocket(8090);
            System.out.println("გამარჯობა, მე ჩეტბოტი ვარ.");
            while(true) {
                Socket s = sock.accept();
                DataInputStream input = new DataInputStream(s.getInputStream());
                String msg = (String) input.readUTF();
                if(msg.equals("stop")) break;
                (new ServerThread(msg)).start();
            }
            System.out.println("ნახვამდის.");
            sock.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }

}