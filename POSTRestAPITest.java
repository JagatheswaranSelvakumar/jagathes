import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public class POSTRestAPITest {

    public static void main(String[] args) {
	try {
	    DefaultHttpClient httpClient = new DefaultHttpClient();
	    HttpPost postRequest = new HttpPost("https://services-qa.walgreens.com/api/stores/search");
	    StringEntity input = new StringEntity(
		    "{\"addr\":\"53207\",\"requestType\":\"locator\",\"srchOpt\":\"\",\"srl\":\"99157\",\"affId\":\"photon\",\"apiKey\":\"d12ddc87a36f1cfb422dccb4ff0a7184\",\"act\":\"fndStore\",\"appver\":\"6.3\",\"atkn\":\"lE3IFylIpJ02rvTz2ohoyz3uIec\u003d\",\"devinf\":\"android 6.0.1 SAMSUNG-SAMSUNG-\",\"transId\":\"\",\"view\":\"fndStoreJSON\"}");
	    input.setContentType("application/json");
	    postRequest.setEntity(input);
	    HttpResponse response = httpClient.execute(postRequest);

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
	} catch (MalformedURLException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
