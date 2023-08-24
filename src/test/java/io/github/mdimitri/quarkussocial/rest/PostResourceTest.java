/**
 * 
 */
package io.github.mdimitri.quarkussocial.rest;

import static io.restassured.RestAssured.given;

import javax.inject.Inject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.github.mdimitri.domain.model.User;
import io.github.mdimitri.repository.UserRepository;
import io.github.mdimitri.rest.PostResource;
import io.github.mdimitri.rest.dto.CreatePostRequest;
import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import jakarta.transaction.Transactional;

/**
 * @author Marcus Dimitri 
 *
 */
@QuarkusTest
@TestHTTPEndpoint(PostResource.class)
class PostResourceTest {

    @Inject
    UserRepository userRepository;
    Long userId;

    @BeforeEach
    @Transactional
    public void setUP(){
        var user = new User();
        user.setAge(30);
        user.setName("Fulano");
        userRepository.persist(user);
        userId = user.getId();
    }

    @Test
    @DisplayName("should create a post for a user")
    public void createPostTest(){
        var postRequest = new CreatePostRequest();
        postRequest.setText("Some text");

        given()
            .contentType(ContentType.JSON)
            .body(postRequest)
            .pathParam("userId", userId)
        .when()
            .post()
        .then()
            .statusCode(201);
    }

    @Test
    @DisplayName("should return 404 when trying to make a post for an inexistent user")
    public void postForAnInexistentUserTest(){
        var postRequest = new CreatePostRequest();
        postRequest.setText("Some text");

        var inexistentUserId = 999;

        given()
                .contentType(ContentType.JSON)
                .body(postRequest)
                .pathParam("userId", inexistentUserId)
            .when()
                .post()
            .then()
                .statusCode(404);
    }
}
