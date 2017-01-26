package tdd.bdd.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by samanthapeuriere on 26/01/17.
 */
@Controller
public class HomeController {

    @Autowired
    private Validator validator;

    @RequestMapping("/home")
    public String servePage(@RequestParam(value="guess", required=false, defaultValue="0") String guess, Model model) {
        model.addAttribute("correct", validator.validate(guess));
        return "home";
    }
}
