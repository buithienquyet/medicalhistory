package testpkg;


import com.eighteengroup.medicalhistory.models.*;
import com.eighteengroup.medicalhistory.dao.*;
/**
 *
 * @author quyet
 */
public class Test {
    public static void main(String[] args) {
           AnalysisRequestDAOInterface analysisRequestDAO = new AnalysisRequestDAO();
           analysisRequestDAO.getAnalysisRequestByID(0);
    }    
}
