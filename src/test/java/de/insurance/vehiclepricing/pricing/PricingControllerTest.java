package de.insurance.vehiclepricing.pricing;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class PricingControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  void shouldComputeTheCorrectPriceForAValidRequest() throws Exception {
    mockMvc
        .perform(
            post("/pricing/calculations")
                .contentType(APPLICATION_JSON)
                .content(
                    """
                    {
                      "vehicleType": "CAR",
                      "postalCode": "53115",
                      "annualMileage": 10000
                    }
                    """))
        .andExpect(status().isOk())
        .andExpect(
            content()
                .json(
                    """
                    {
                      "vehicleType": "CAR",
                      "postalCode": "53115",
                      "annualMileage": 10000
                    }
                    """));
  }
}
