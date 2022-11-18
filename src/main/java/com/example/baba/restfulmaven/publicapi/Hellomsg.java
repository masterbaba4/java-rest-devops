package com.example.baba.restfulmaven.publicapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Hellomsg {
   @GetMapping(path = "/baba")
   public String helloBaba(){ return "Baba is live now";}
}
