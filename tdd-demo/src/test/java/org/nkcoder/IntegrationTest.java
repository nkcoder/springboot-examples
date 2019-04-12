package org.nkcoder;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.nkcoder.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class IntegrationTest {

  @Autowired
  private TestRestTemplate testRestTemplate;

  @Test
  public void getEmployee_shouldReturnEmployee() {
    // arrange

    // act

    // test
    ResponseEntity<Car> response = testRestTemplate.getForEntity("/employees/daniel", Car.class);

    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    assertThat(response.getBody().getName()).isEqualTo("daniel");
    assertThat(response.getBody().getGrade()).isEqualTo("junior");

  }

}