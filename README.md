# Chat_Server_local

Local chat with server and multiple user capabilities.


## **Introduction**

This project was developed as an assignment in an Informatics Systems course, with special attention to Java as a main language throughout. The aim was to develop a server to be deployed locally with a localhost port. Many users could be connected to the server by running different instances of the Client class. The server should be able to assess the different connections and receive the messages, while delivering them to the rest of the users. 

The communication is done simply by the deployment in the java terminal generated from the run. This app is not fully developed as the server receives the messages but it does not send correctly or else the client is not able to show it.

## **Usage** 

This project was assembled in EclipseIDE and ran smoothly in that environment. To play the game:

1. Clone the repository: git clone https://github.com/eduardofbneves/Chat_Server_local.git.
2. Open the EclipseIDE in the cloned folder.
3. Run the ~/src/servidor/ServerThread.java file to initiate the server.
4. Run the desired instances of the file ~/src/cliente/ClientThread.java to initiate the user text prompt.
5. When desired to close the connection user-wise type "exit".

## **Authors and Acknowledgment**

This project was created by **[Eduardo Neves](https://github.com/eduardofbneves)**,  **Tiago Curado**.

## **Conclusion**

This application resulted in a simple but functional conversational server that can be improved and adapted to a variety of occasions, especially if put online for a restrict text channel between sockets.
