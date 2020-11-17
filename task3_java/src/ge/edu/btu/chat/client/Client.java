package ge.edu.btu.chat.client;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    private String msg;
    public Client(String msg) {
        this.msg = msg;
    }
    public void sendMessage(){
        try {
            Socket sock = new Socket("localhost", 8090);
            DataOutputStream output = new DataOutputStream(sock.getOutputStream());
            output.writeUTF(this.msg);
            output.flush();
            output.close();
            sock.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        while(true) {
            System.out.println("Enter message: ");
            Scanner scanner = new Scanner(System. in);
            String str = scanner.nextLine();
            (new Client(str)).sendMessage();
            if(str.equals("stop")) break;
        }
    }

}
