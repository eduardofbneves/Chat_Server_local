package cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientThread {
	public static void main(String[] args) throws IOException {

		String sndSTR;
		Scanner sc=new Scanner(System.in);
		//Create connection with server
		Socket serverCon = new Socket("localhost",12346);

		//Create communication channels
		DataInputStream in = new DataInputStream(serverCon.getInputStream());
		DataOutputStream out = new DataOutputStream(serverCon.getOutputStream());


		do {
			System.out.print("Insert message:");
			sndSTR=sc.nextLine();
			
			//Send string to server
			out.writeUTF(sndSTR);
			out.flush();
			
			//Wait and read message from the server
			String rcvStr=in.readUTF();
			
			//Interpret message from the server
			if(rcvStr.startsWith("CLI_MSG_OK"))
			{
				//Inform the user about the operation
				String strCliId=rcvStr.split(":")[1];
				System.out.println("Message receiver, user number "+strCliId);
			}
			else
			{
				System.out.println("Another mensage received.");//Run until the message equals exit
			}
		}while(!sndSTR.toLowerCase().equals("exit"));
		
		//Close community channels and socket
		in.close();
		out.close();
		serverCon.close();
		sc.close();

	}

}
