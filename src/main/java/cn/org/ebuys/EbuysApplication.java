package cn.org.ebuys;

import cn.org.ebuys.entity.Author;
import cn.org.ebuys.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@SpringBootApplication
public class EbuysApplication {

    @Autowired
    private Author author;

    @RequestMapping("/")
    public String index(Model model){
        Person signle = new Person("aa", 11);
        model.addAttribute("singlePerson", signle);
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(EbuysApplication.class, args);
    }


}
