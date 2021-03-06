package FamilyAssistance.marriedCouple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MarriedCoupleService {
    @Autowired
    MarriedCoupleRepository mcRepository;

    public MarriedCoupleService() {
    }

    public MarriedCouple getMarriedCouple(String email) {

        return mcRepository.findByMcemail(email);
    }

    public MarriedCouple getMcByemailAndPassword(String email, String password) {

        return mcRepository.findByMcemailAndPassword(email, password);
    }

    public Iterable<MarriedCouple> getAll() {
        return mcRepository.findAll();
    }

    public String addmc(MarriedCouple temp) {
        try {
            if (!getMarriedCouple(temp.mcemail).equals(new MarriedCouple()))
                return "Couple Exists";
        } catch (Exception e) {

        }
        mcRepository.save(temp);
        return "Success";
    }

    public String updateMC(MarriedCouple temp) {
        mcRepository.save(temp);
        return "Success";
    }
}
