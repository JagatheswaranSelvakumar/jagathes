import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

@SuppressWarnings("deprecation")
public class GETHttpClientEg {

    public static void main(String[] args) {
	try {
	    DefaultHttpClient httpClient = new DefaultHttpClient();
	    HttpGet getRequest = new HttpGet("http://maps.googleapis.com/maps/api/geocode/json?address=chicago&sensor=false&#8221;");
	    getRequest.addHeader("accept", "application/json");
	    HttpResponse response = httpClient.execute(getRequest);
	    if (response.getStatusLine().getStatusCode() != 200) {
		throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
	    }
	    BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
	    String output;
	    System.out.println("Output from Server .... \n");
	    while ((output = br.readLine()) != null) {
		System.out.println(output);
	    }
	    httpClient.getConnectionManager().shutdown();
	} catch (ClientProtocolException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}