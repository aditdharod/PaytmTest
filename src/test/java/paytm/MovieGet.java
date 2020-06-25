package paytm;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class MovieGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI= "https://apiproxy.paytm.com";
		String response = given().log().all()
		.when().get("/v2/movies/upcoming")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
		
		JsonPath js= new JsonPath(response);
		//js.getString(path)
		
		int count = js.getInt("upcomingMovieData.size()");
		for (int i=0;i<count;i++)
		{
			String moviePosterURL = js.get("upcomingMovieData["+i+"].moviePosterUrl");
			if(moviePosterURL.endsWith(".jpg"))
			{
				//assert true;
			}
		}

	}

}
