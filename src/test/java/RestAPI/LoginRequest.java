package RestAPI;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginRequest {
    public static void main(String[] args) {
       RestAssured.baseURI = "http://139.59.91.96:3000";
       Header header = new Header("Content-Type", "applicaion/json");
       RequestSpecification request = RestAssured.given();
       request.header(header);
       request.body("");

       Response response = request.post("/user/signin");
       System.out.println(response.asPrettyString());

    }
}
