package com.mvc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaAuditing
@EnableScheduling
public class Project1Application {
	private static final Logger LOGGER = LoggerFactory.getLogger(Project1Application.class);

	public static void main(String[] args) throws FileNotFoundException {
		LOGGER.info("inside main method");
		SpringApplication.run(Project1Application.class, args);

		/*
		 * LOGGER.error("inside main method error"); LOGGER.error("error:", new
		 * GenericException("logger.error"));
		 * 
		 * LOGGER.warn("inside main method warn"); LOGGER.warn("error:", new
		 * GenericException("logger.error"));
		 * 
		 * LOGGER.info("inside main method Info"); LOGGER.info("error:", new
		 * GenericException("logger.error"));
		 * 
		 * LOGGER.debug("inside main method debug");
		 * LOGGER.trace("inside main method trace");
		 */

		/*FileReader reader = new FileReader(new File("D:/aarti/project/project-1/project-1/project-1/lib/index.json"));

		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(reader);
		// Returns Root element( which is a JsonElement,can be object,array, null or primitive)

		if (element.isJsonObject()) {
			JsonObject car = element.getAsJsonObject();
			System.out.println(car.get("name"));// read as string
			System.out.println(car.get("model").getAsInt()); // read as integer
			System.out.println(car.get("price").getAsDouble());// read as double
			car.remove("price");
			car.addProperty("hii", "hello");
			System.out.println(car.get("hii").getAsString()); // read as integer
			System.out.println("after price "+car.get("price"));// read as double

			JsonArray arr = car.getAsJsonArray("colors");// read as array
			for (int i = 0; i < arr.size(); i++) {
				System.out.println(arr.get(i).getAsString());

				JsonElement el = car.get("colors");// read as array
			if (el.isJsonObject()) {System.out.println("hhii");}
			if (el.isJsonArray()) {System.out.println("hello");}
			if (el.isJsonNull()) {System.out.println("hello");}
			if (el.isJsonPrimitive()) {System.out.println("hello");}

			}
			
			
		}*/

	}

}
