package com.bol.kalaha;

import com.bol.kalaha.web.rest.KalahaResource;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

//@SpringBootTest
@RunWith(SpringRunner.class)
@WebMvcTest(KalahaResource.class)
class KalahaApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void saveFruit() throws Exception {
//				String exampleFruitJson = dataToJson(null, "Banana", "Tropical", 5.0);
//				MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/api/fruits")
//						.contentType(MediaType.APPLICATION_JSON_VALUE).content(exampleFruitJson)).andReturn();
//
//				MockHttpServletResponse response = mvcResult.getResponse();
//				Assert.assertEquals(HttpStatus.OK.value(), response.getStatus());


	}
}
