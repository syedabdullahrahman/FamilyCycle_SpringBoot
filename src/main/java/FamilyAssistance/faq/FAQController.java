package FamilyAssistance.faq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Hashtable;

@RestController
@RequestMapping("/FamilyAssistance/faq")
public class FAQController {

    @Autowired  //need dependecy injection
    FAQService fq;

    @RequestMapping("/{question}")
    public Hashtable<String, String> getAns(@PathVariable("question") String question){
        return fq.getAnswer(question);
    }
    @RequestMapping("/all")
    public Hashtable<String, String> getAll() {
        return fq.getAll();
    }
}
