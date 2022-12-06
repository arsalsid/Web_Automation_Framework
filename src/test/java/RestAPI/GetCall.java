package GetRequest;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.specification.RequestSpecification;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.*;
public class GetCall {

    public static void main(String[] args) {
        baseURI = "http://139.59.91.96:3000";
        RequestSpecification request = given();
        Header header = new Header("Content-Type", "applicaion/json");
        List<Header> listHeader = new ArrayList<Header>();
        listHeader.add(header);
        listHeader.add(new Header("Authorization", DEFAULT_SESSION_ID_VALUE));
       //  Headers headers = new Heade
    }
}
