package com.bol.kalaha.web.rest;

import com.bol.kalaha.domain.Board;
import com.bol.kalaha.domain.Game;
import com.bol.kalaha.service.KalahaService;
import com.bol.kalaha.web.rest.error.BadRequestAlertException;
import com.bol.kalaha.web.rest.util.HeaderUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

import static org.hibernate.id.IdentifierGenerator.ENTITY_NAME;

@RestController
@RequestMapping(path = "/api")
public class KalahaResource {

    private final Logger log = LoggerFactory.getLogger(KalahaResource.class);
    private static final String applicationName = "kalaha-game";
    private final KalahaService kalahaService;

    public KalahaResource(KalahaService kalahaService) {
        this.kalahaService = kalahaService;
    }

    /**
     * POST  /Kalaha : Create a new fruit.
     *
     * @param fruit the fruit to create
     * @return the ResponseEntity with status 201 (Created) and with body the new fruit, or with status 400 (Bad Request) if the fruit has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @GetMapping("/kalaha")
    public Board start() {
        log.debug("REST request to get all Fruits");
        return kalahaService.start();
    }

    @PostMapping("/kalaha/{p1}/{p2}/{board}")
    public ResponseEntity<Game> initializeGame(@PathVariable String p1,
                                               @PathVariable String p2,
                                               @RequestBody Board board) throws URISyntaxException, BadRequestAlertException {
        Game result = kalahaService.initialize(p1, p2, board);
        return ResponseEntity.created(new URI("/api/kalaha/" + result.getId()))
                .headers(HeaderUtil.createEntityCreationAlert(applicationName, false, ENTITY_NAME, result.getId().toString()))
                .body(result);
    }


}
