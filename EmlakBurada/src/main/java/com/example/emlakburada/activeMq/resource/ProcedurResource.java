package com.example.emlakburada.activeMq.resource;


import com.example.emlakburada.activeMq.service.ActiveMqService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/publish")
@RequiredArgsConstructor
public class ProcedurResource {

    private final ActiveMqService activeMqService;

    @GetMapping("/{message}")
    public String publish(@PathVariable("message") final String message){
        activeMqService.sendMessage(message);
        return "Published";
    }

}
