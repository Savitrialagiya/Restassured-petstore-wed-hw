package swagger.petstore.crudtest;

import io.restassured.response.Response;
import org.junit.Test;
import swagger.petstore.model.PetsPojo;
import swagger.petstore.testbase.TestBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

public class PetsCRUDTest extends TestBase {
    @Test
    public void addNewPet() {

        PetsPojo petsPojo = new PetsPojo();
        petsPojo.setId(12);

        HashMap<String, String> category = new HashMap<>();
        category.put("id", "12");
        category.put("name", "dogs");
        petsPojo.setCategory(category);

        petsPojo.setName("woof");

        List<String> photoUrl = new ArrayList<>();
        photoUrl.add("NameDog");
        petsPojo.setPhotoUrls(photoUrl);

        HashMap<String, String> tag = new HashMap<>();
        tag.put("id", "121");
        tag.put("name", "babydog");

        List<HashMap<?, ?>> tags = new ArrayList<>();
        tags.add(tag);

        petsPojo.setTags(tags);

        petsPojo.setStatus("available");

        Response response = given()
                .header("Content-Type", "application/json")
                .header("accept", "application/json")
                .when()
                .body(petsPojo)
                .post("/pet");
        response.prettyPrint();
        response.then().statusCode(200);
    }

    @Test
    public void findPetById() {
        Response response = given()
                .header("Content-Type", "application/json")
                .header("accept", "application/json")
                .when()
                .get("/pet/12");
        response.prettyPrint();
        response.then().statusCode(200);

    }

    @Test
    public void updateExistingPetDetails() {

        PetsPojo petsPojo = new PetsPojo();
        petsPojo.setId(12);

        HashMap<String, String> category = new HashMap<>();
        category.put("id", "123");
        category.put("name", "dogs");
        petsPojo.setCategory(category);

        petsPojo.setName("woof");

        List<String> photoUrl = new ArrayList<>();
        photoUrl.add("NameDog");
        petsPojo.setPhotoUrls(photoUrl);

        HashMap<String, String> tag = new HashMap<>();
        tag.put("id", "121");
        tag.put("name", "babydog");

        List<HashMap<?, ?>> tags = new ArrayList<>();
        tags.add(tag);

        petsPojo.setTags(tags);

        petsPojo.setStatus("available");

        Response response = given()
                .header("Content-Type", "application/json")
                .header("accept", "application/json")
                .when()
                .body(petsPojo)
                .put("/pet");
        response.prettyPrint();
        response.then().statusCode(200);
    }
    @Test
    public void deletePet() {
        Response response = given()
                .header("Content-Type", "application/json")
                .header("accept", "application/json")
                .when()
                .get("/pet/12");
        response.prettyPrint();
        response.then().statusCode(200);

    }
}
