import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class BaseLibrary {

    @Test
    public void PostPet() {
        String bodyPayLoad = "{\n" +
                "  \"id\": 3,\n" +
                "  \"category\": {\n" +
                "    \"id\": 12,\n" +
                "    \"name\": \"Dragon\"\n" +
                "  },\n" +
                "  \"name\": \"Yami\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"https://artsphere.org/wp-content/uploads/2018/04/pixabay-mountains-8747922_1280-.jpg\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 4,\n" +
                "      \"name\": \"Flying\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";

        Map<String, String> headersPayLoad = new HashMap<>();
        headersPayLoad.put("accept", "application/json");
        headersPayLoad.put("Content-Type", "application/json");

        RestAssured
                .given()
                .headers(headersPayLoad)
                .body(bodyPayLoad)
                .when()
                .post("/pet")
                .then()
                .statusCode(200);
    }

    @Test
    public void PutPet() {
        String bodyPayLoad = "{\n" +
                "  \"id\": 3,\n" +
                "  \"category\": {\n" +
                "    \"id\": 12,\n" +
                "    \"name\": \"Dragon\"\n" +
                "  },\n" +
                "  \"name\": \"Ygdrasil\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"https://artsphere.org/wp-content/uploads/2018/04/pixabay-mountains-8747922_1280-.jpg\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 4,\n" +
                "      \"name\": \"Flying\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";

        Map<String, String> headersPayLoad = new HashMap<>();
        headersPayLoad.put("accept", "application/json");
        headersPayLoad.put("Content-Type", "application/json");

        RestAssured
                .given()
                .headers(headersPayLoad)
                .body(bodyPayLoad)
                .when()
                .post("/pet")
                .then()
                .statusCode(200);
    }

    @Test
    public void GetPet() {
        Map<String, String> headersPayLoad = new HashMap<>();
        headersPayLoad.put("accept", "application/json");

        RestAssured
                .given()
                .headers(headersPayLoad)
                .when()
                .get("/pet/3")
                .then()
                .statusCode(200);
    }

    @Test
    public void DeletePet() {
        Map<String, String> headersPayLoad = new HashMap<>();
        headersPayLoad.put("accept", "application/json");

        RestAssured
                .given()
                .headers(headersPayLoad)
                .when()
                .get("/pet/3")
                .then()
                .statusCode(200);
    }

}
