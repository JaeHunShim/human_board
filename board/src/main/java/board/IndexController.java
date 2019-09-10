package board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
//
	@RequestMapping("/")
	public String index(ModelMap model) throws Exception {
		
		model.addAttribute("name","jaehun");
		return "index";
	}
}
