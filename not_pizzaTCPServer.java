import java.io.*;
import java.net.*;
class not_pizzaTCPServer {
	public static void main(String argv[]) throws Exception
		{
			String consultaDelCliente;
			String respuesta;
			ServerSocket welcomeSocket = new ServerSocket(1234);
			while(true){
				Socket connectionSocket = welcomeSocket.accept();
				BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
				DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
				consultaDelCliente = inFromClient.readLine();
				if (consultaDelCliente.equals("pizza")) {
					respuesta = "¡Si es pizza!" + '\n';
				} else {
					respuesta = "No es pizza.. :(" + '\n';
				}
				outToClient.writeBytes(respuesta);
			}
		}
}
	