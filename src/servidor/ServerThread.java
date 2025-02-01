package servidor;


import java.net.ServerSocket;
import java.net.Socket;


public class ServerThread {
	public static void main(String[] args)
	{
		int id=1;
		
		try
		{
			//Create ServerSocket to execute in port 12345
			ServerSocket listen = new ServerSocket(12346);
			System.out.println("Listening in port:" + listen.getLocalPort());


			while (true)
			{
				//Wait for user connection
				Socket clientSocket = listen.accept();
				System.out.println("Received new connection...");
				//Delegate communication to the user in a thread and wait for another user
				Thread c = new Thread(new ConnectionHandler(clientSocket,id));
				c.start();
				id++;
			}
		}
		catch (Exception e)
		{
			System.out.println("Server terminated. Error:");
			e.printStackTrace();
		}
	}

}