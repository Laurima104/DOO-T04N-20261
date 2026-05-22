package weather;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.LocalDate;

public class main {

	public static void main(String[] args) throws Exception{
		Consulta();
	}
	
	public static void Consulta() throws URISyntaxException, IOException, InterruptedException {
		LocalDate data = LocalDate.now();
		
		HttpClient client = HttpClient.newHttpClient();
		URI url = new URI("https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/Cascavel,BR/"
		+ data 
		+ "?key=5YDGGFYSZ29DDEPL83HHEHD52&&unitGroup=metric");
		
		HttpRequest request = HttpRequest.newBuilder(url)
			.GET()
			.build();
		
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		
		if (response.statusCode() == 200) {
			System.out.println(response.body());
		}
	}

}
