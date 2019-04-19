import java.io.*;
import java.net.*;
public class not_pizzaTCPClient {
	public static void main(String argv[]) throws Exception
		{
			while (true) {
			String consulta;
			String respuesta;
			BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
			//Configurar la ip del hostname (se puede obtener aca https://myhostname.net/ o bien desde el cmd con ipconfig, usar la ipv6 temporal
			//por ejemplo: 1111:1111:111:11111:1111:11:11:11
			Socket clientSocket = new Socket("1111:1111:111:11111:1111:11:11:11", 1234); 
			
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
	
}