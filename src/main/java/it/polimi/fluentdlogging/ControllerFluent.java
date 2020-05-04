package it.polimi.fluentdlogging;

import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/logger")
public class ControllerFluent {

    private static final Logger LOGGER =  org.slf4j.LoggerFactory.getLogger(ControllerFluent.class);


    @GetMapping
    @RequestMapping("/spam")
    public ResponseEntity<String>  getDati(@RequestParam String param)
    {

        LOGGER.info("Sono un log info Slf4j");
        LOGGER.debug("Sono un log info Slf4j");

       return new ResponseEntity<>("ok", HttpStatus.OK);

    }
}