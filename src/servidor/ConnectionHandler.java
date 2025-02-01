
package servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

//Class that defines the thread that handles communication with the user
public class ConnectionHandler extends Thread {
	private Socket clientSocket;
	private DataInputStream in;
	private DataOutputStream out;
	private int id;


	public ConnectionHandler(Socket sock, int id)
	{
		this.clientSocket = sock;
		this.id=id;
		try {
			//Create communication channels for the socket of the user
			this.in = new DataInputStream(clientSocket.getInputStream());
			this.out = new DataOutputStream(clientSocket.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	public void run()
	{

		try
		{
			String clientMsg;
			do {
				//Wait message from user
				clientMsg=this.in.readUTF();
				System.out.println("Message from client"+this.id+"="+clientMsg+ ".");
				
				//Send message to user
				this.out.writeUTF("CLI_MSG_OK:"+this.id);
				this.out.flush();
			}
			while(!clientMsg.toLowerCase().equals("exit"));//Execute while message is different from "exit"
			System.out.println("Cliente "+this.id+" saiu!!!");

			//Close communication channels with user
			this.in.close();
			this.out.close();
			this.clientSocket.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}



}