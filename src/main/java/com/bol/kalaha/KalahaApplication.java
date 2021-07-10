package com.bol.kalaha;

import com.bol.kalaha.domain.Board;
import com.bol.kalaha.domain.Player;
import com.bol.kalaha.web.rest.KalahaResource;
import com.bol.kalaha.web.rest.error.BadRequestAlertException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.net.URISyntaxException;

@SpringBootApplication
public class KalahaApplication {

	public static void main(String[] args) throws URISyntaxException, BadRequestAlertException {
		System.out.println("SSSS");
		ConfigurableApplicationContext context = SpringApplication.run(KalahaApplication.class, args);
		Player player = context.getBean(Player.class);

		KalahaResource kalahaResource = context.getBean(KalahaResource.class);
		Board board = kalahaResource.start();

	}

}
