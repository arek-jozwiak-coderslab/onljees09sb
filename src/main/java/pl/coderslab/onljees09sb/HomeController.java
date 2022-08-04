package pl.coderslab.onljees09sb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Value("${app.homepage.articles.size}")
    private int articlesSize;

    @GetMapping("/")
    @ResponseBody
    public String start(){
        return "aaaa";
    }


}
