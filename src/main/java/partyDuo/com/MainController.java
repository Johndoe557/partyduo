package partyDuo.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MainController {
	
	@Autowired
	HttpSession session;
	
	@GetMapping({"/","/main"})
	public String home() {
	

		//session.setAttribute("user_id","admin");
		//session.setAttribute("user_character","페이커");
		log.info("session:{}", session.getAttribute("user_id"));
		log.info("session:{}", session.getMaxInactiveInterval());
		log.info("/main");
		return "main";
	}
	
	@GetMapping("/admin")
	public String admin() {
	

		//session.setAttribute("user_id","admin");
		//session.setAttribute("user_character","페이커");
		
		log.info("/admin");
		return "admin";
	}
	
}
