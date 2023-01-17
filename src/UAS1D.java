import java.util.ArrayList;
import java.util.Scanner;

public class UAS1D {
    private String MESSAGEID;
    private String MESSAGENAME;
    private ArrayList<String> CONTEXT ;

    public String getMESSAGEID() {
        return MESSAGEID;
    }

    public void setMESSAGEID(String MESSAGEID) {
        this.MESSAGEID = MESSAGEID;
    }

    public String getMESSAGENAME() {
        return MESSAGENAME;
    }

    public void setMESSAGENAME(String MESSAGENAME) {
        this.MESSAGENAME = MESSAGENAME;
    }

    public ArrayList<String> getCONTEXT() {
        return CONTEXT;
    }

    public void setCONTEXT(ArrayList<String> CONTEXT) {
        this.CONTEXT = CONTEXT;
    }

    public void FindWord(ArrayList<String> list, String Cari ){
        list.add(Cari);

        for (int index = 0; index < list.size(); index++){
            list.get(index).indexOf(Cari);
        }

    }


}
