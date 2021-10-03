import java.net.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DayTimeServer {
    final static int port = 13;

    public static void main(String args[]) {
        while (true) {
            try {
                ServerSocket ss = new ServerSocket(port);
                System.out.println("Server started");

                System.out.println("Waiting for a client ...");

                Socket s = ss.accept();//establishes connection
                System.out.println("Client accepted");

                DataOutputStream dos = new DataOutputStream(s.getOutputStream());

                // creating Date object
                Date date = new Date();


                try {
                    DateFormat fordate = new SimpleDateFormat("yyyy/MM/dd");
                    DateFormat fortime = new SimpleDateFormat("hh:mm:ss");
                    String toreturnDate = fordate.format(date);
                    String toreturnTime = fortime.format(date);

                    dos.writeUTF(toreturnDate + "\n" + toreturnTime);

                } catch (IOException i) {
                    System.out.println(i);
                }
                System.out.println("Closing connection");
                ss.close();

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
