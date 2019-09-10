package board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TextController {

    @RequestMapping("/user/text")
    public String text() throws Exception {
        System.out.println("으앙");
        return null;
    }
}
