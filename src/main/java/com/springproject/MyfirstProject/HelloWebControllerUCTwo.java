package com.springproject.MyfirstProject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebControllerUCTwo {
    @GetMapping("/hello/query")
    public String hello(@RequestParam(name = "name", defaultValue = "World") String name)
    {
        return "Hello " + name + " from BridgeLabz";
    }
}
//import org.springframework.web.bind.annotation.*;
//
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class HelloWebController {
//
//    @GetMapping("/web")
//    public String sayHello(){
//        return"hello";
//    }
//
////    @GetMapping("/web/message")
////    public String message(Model model){
////        model.addAttribute("message","this is a custom message");
////        return"message";
////    }
//
//    @RequestMapping(value = {"","/","/home"})
//    public String sayHelloo(){
//        return"Hello from BridgeLabz";
//    }
//
//
//
//}
