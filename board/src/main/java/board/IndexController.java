package board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
//
	@RequestMapping("/")
	public String index(ModelMap model) throws Exception {
		1111111111111111111111
		1111111111111111111111
		1111111111111111111111
		1111111111111111111111
		1111111111111111111111
		1111111111111111111111
		
		model.addAttribute("name","jaehun");
		return "index";
	}
}
