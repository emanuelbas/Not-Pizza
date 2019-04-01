import java.io.*;
import java.net.*;
public class not_pizzaTCPClient {
	public static void main(String argv[]) throws Exception
		{
			String consulta;
			String respuesta;
			BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
			Socket clientSocket = new Socket("1111:1111:111:11111:1111:11:11:11", 1234); //Configurar la ip del hostname (se puede obtener aca https://myhostname.net/ )
			DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
			BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			System.out.println("A continuacion ingrese una palabra para consultar al servidor:");
			consulta = inFromUser.readLine();
			outToServer.writeBytes(consulta + '\n');
			respuesta = inFromServer.readLine();
			System.out.println("Respuesta desde el servidor: " + respuesta);
			clientSocket.close();
		}
	
}