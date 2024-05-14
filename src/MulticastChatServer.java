import java.net.*;

public class MulticastChatServer {

    public static void main(String[] args) throws Exception {
        // Default port number we are going to use
        int portnumber = 8001;
        if (args.length >= 1) {
            portnumber = Integer.parseInt(args[0]);
        }

        // Create a MulticastSocket
        MulticastSocket serverMulticastSocket = new MulticastSocket(portnumber);
        System.out.println("MulticastSocket is created at port " + portnumber);

        // Determine the IP address of a host, given the host name
        InetAddress group = InetAddress.getByName("225.4.5.6");


    }
}
