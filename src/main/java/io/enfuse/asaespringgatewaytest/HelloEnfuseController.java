package io.enfuse.asaespringgatewaytest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/api")
public class HelloEnfuseController {

    public HelloEnfuseController(){}

    @GetMapping("/test")
    public @ResponseBody String helloEnfuse(){
        return "Hello Enfuse!";
    }
}
