package io.microsamples.testz.contract.producer;

import io.restassured.module.mockmvc.specification.MockMvcRequestSpecification;
import io.restassured.response.ResponseOptions;
import org.junit.jupiter.api.Test;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.assertj.core.api.Assertions.assertThat;

public class ContractVerifierTestForgetAboutIt extends BaseTest {

    @Test
    public void validate_shouldReturnChachkie() {
        // given:
        MockMvcRequestSpecification request = given();

        // when:
        ResponseOptions response = given().spec(request)
                .get("/chachkies");

        // then:
        assertThat(response.statusCode()).isEqualTo(200);

        // and:
        assertThat(response.getBody().asString()).isNotNull();
    }

}
