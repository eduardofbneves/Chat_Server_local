package servidor;

import java.io.Serializable;

public class Client implements Serializable {
	
	private String username;
	private int id;
	private boolean connected;
	private int lastMsg = 0;

	//Getters and Setters para as diferentes variáveis 
	
	public Client(String username, int id) {
		this.username = username;
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public boolean getConnected() {
		return connected;
	}
	
	public void setConnected(boolean con) {
		this.connected = con;
	}
	
	public String toString() {
		return username + " "+ id + " " + connected;
	}

	public int getLastMsg() {
		return lastMsg;
	}

	public void setLastMsg(int lastMsg) {
		this.lastMsg = lastMsg;
	}
	

}