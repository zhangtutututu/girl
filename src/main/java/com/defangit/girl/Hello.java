package com.defangit.girl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class Hello {
    @Autowired
   private Girl girl;


//    @RequestMapping(value = "hello",method = RequestMethod.GET)
    @GetMapping(value = {"hello"})
   public String sayHello(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
        Logger logger = LoggerFactory.getLogger(Hello.class);
        logger.error("logger:"+id);
       return girl.toString();
   }
}
