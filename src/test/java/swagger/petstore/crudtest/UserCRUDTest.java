package swagger.petstore.crudtest;


import io.restassured.response.Response;
import org.junit.Test;
import swagger.petstore.model.PetsPojo;
import swagger.petstore.model.UserPojo;
import swagger.petstore.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class UserCRUDTest extends TestBase {
    @Test
    public void createUser() {

        UserPojo userPojo = new UserPojo();
        userPojo.setId(11);
        userPojo.setUserName("abc123");
        userPojo.setFirstName("savitri");
        userPojo.setLastName("Patel");
        userPojo.setEmail("savu1@gmail.com");
        userPojo.setPassword("savu12");
        userPojo.setPhone("01234456789");
        userPojo.setUserStatus("1");

        Response response = given().log().all()
                .header("Content-Type", "application/json")
                .when()
                .body(userPojo)
                .post("/user");
        response.prettyPrint();
        response.then().log().all().statusCode(200);
    }

    @Test
    public void updateUser() {
        UserPojo userPojo = new UserPojo();
        userPojo.setId(1);
        userPojo.setUserName("Savu");
        userPojo.setFirstName("Savitri");
        userPojo.setLastName("Alagiya");
        userPojo.setEmail("savu1@gmail.com");
        userPojo.setPassword("savu123");
        userPojo.setPhone("0123456789");
        userPojo.setUserStatus("1");

        Response response = given().log().all()
                .header("Content-Type", "application/json")
                .when()
                .body(userPojo)
                .put("/user/11");
        response.prettyPrint();
        response.then().log().all().statusCode(200);

    }
    @Test
    public void getUser() {
        Response response = given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .when()
                .get("/user/Kat");
        response.then().statusCode(200);
        response.prettyPrint();

    }

    @Test
    public void DeleteUser() {
        Response response = given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .when()
                .delete("/user/Kat");
        response.then().statusCode(200);
        response.prettyPrint();

    }

    }


