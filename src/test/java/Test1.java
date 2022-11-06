import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void Test01()
    {
       // int code = RestAssured.given()
       //         .get("https://pay.foodics.dev/public-api/v1/App/Login").getStatusCode();

       // System.out.println("Response code :"+code);

        String url = "https://pay.foodics.dev/public-api/v1/App/Login";

        RequestSpecification request = RestAssured.given()
                .auth().basic("omarfoodics2+test2@gmail.com","sk190517225LM@$*");
        Response response = request.get(url);
        int statuscode = response.statusCode();

        System.out.println("status code :"+statuscode);
        System.out.println("response body :"+response.body().asString());
    }

    @Test
    public void Test02()
    {
        // int code = RestAssured.given()
        //         .get("https://pay.foodics.dev/public-api/v1/App/Login").getStatusCode();

        // System.out.println("Response code :"+code);

        String url = "https://pay.foodics.dev/public-api/v1/App/GetMerchantInfo";

        RequestSpecification request = RestAssured.given();
        Response response = request.get(url);
        int statuscode = response.statusCode();

        System.out.println("status code :"+statuscode);
        System.out.println("response body :"+response.body().asString());
    }


}
