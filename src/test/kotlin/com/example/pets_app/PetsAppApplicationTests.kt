package com.example.pets_app

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.assertEquals

@SpringBootTest
class PetsAppApplicationTests {

	@Test
	fun contextLoads()  {
		assertEquals(1, 2)
	}

}
