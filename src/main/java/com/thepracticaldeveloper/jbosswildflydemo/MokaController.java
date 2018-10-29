package com.thepracticaldeveloper.jbosswildflydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author moises.macero
 */
@RestController
@RequestMapping("/moka")
public final class MokaController {

    @GetMapping
    public String dimeHola(){
        //var message = "Hola Amigo!";
        return "mokamoka mysql la";
    }
}
