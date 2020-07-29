package com.example.demo.Controller;

import com.example.demo.LoginService;
import com.example.demo.dao.UserRepo;
import com.example.demo.user.User;
import com.example.demo.user.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@CrossOrigin(origins = "*")
public class HomeController {


    private User user = new User();
    @Autowired
    UserRepo repo;
    @Autowired
    UserDetails userDetails;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        StringTrimmerEditor trim = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class, trim);
    }

    @GetMapping("/")
    public String login() {

        return "newlogin";
    }

    @PostMapping("saved")
    public String save(@RequestParam String email, @RequestParam String password, ModelMap model) {
        LoginService service = new LoginService();
        int userId = service.getUsers(repo.findAll(), email, password);
        if (userId == 0) {
            model.put("error", "Email id and password doesn't Match");
            return "newlogin";
        }
        User user = repo.findById(userId).orElse(new User());
        model.put("user", user);

        System.out.println("user = " + user);
        return "welcome";
    }

    @GetMapping("/signup")
    public String sign(ModelMap model) {
        model.put("user", user);
        return "signup";
    }

    @GetMapping("/users")
    @ResponseBody
    public List<User> users() {

        return repo.findAll();
    }
    @GetMapping("/use")
    public String use() {

        return "data";
    }

    @GetMapping("/users/{userID}")
    @ResponseBody
    public Optional<User> user(@PathVariable int userID) {

        return repo.findById((userID));
    }

    @PostMapping("/signedup")
    public String successful_sighup(@Valid User user, BindingResult result) {

        System.out.println(result);
        
        if (result.hasErrors()) {
            return "signup";
        }
        repo.save(user);

        return "newlogin";
    }


}















