/**
 * Workflow
 * @author: Ashna Tirougnaname
 * @version: 3.0
 */

public class Workflow{
    
    //private default constructor
    private Workflow(){
        
    }
    
    //creating object
    public static Workflow createWorkflow()
    {
        Workflow wf = new Workflow();
        return wf;
    }

    //workflow methods
    private boolean saveAttorneyDetails(String attorneyDetails)
    {
        return true;
    }


    private int sendRequestForm(int requestFormNumber){
        return 0;
    }

    public int sendForm(int requestFormNumber) {
        return sendRequestForm(requestFormNumber);  
    }



    public boolean attorneyResponse(int requestFormNumber) {
        return false;
    }
    

    private boolean sendAttorneyResponse(int requestFormNumber) {
        return true;
    }

    public boolean sendAttResponse(int requestFormNumber)
    {
        return sendAttorneyResponse(requestFormNumber);
    }

}