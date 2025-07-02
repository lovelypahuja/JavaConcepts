package JavaConcepts;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class apiStatusCodeChecker {

    public static int getStatusCode(String url){
        Response response= RestAssured.given().when().get(url);
        response.getStatusCode();
        int  statusCode=response.getStatusCode();
        return statusCode;
    }

    public static void main(String[] args) {
        String url= "https://reqres.in/api/users?page=2";
        System.out.println(getStatusCode(url));
    }
}
