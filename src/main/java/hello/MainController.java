package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController    // This means that this class is a Controller
public class MainController {
    @Autowired // This means to get the bean called userRepository
    private CustomerRepository customerRepository;

    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody String addNewUser () {
        Customer n = new Customer();
        n.setFirstName("linh");
        n.setLastName("xuanlnh91@gmail.com");
        customerRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Customer> getAllUsers() {
        return customerRepository.findAll();
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello from container";
    }
}