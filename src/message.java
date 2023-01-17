import java.util.ArrayList;

public class message {
    private String setMessage1D;

    public String getSetMassage1D() {
        return setMessage1D;
    }

    public void setSetMassage1D(String setMassage1D) {
        this.setMessage1D = setMassage1D;
    }

    public String getSetMassageName() {
        return setMessage1D;
    }

    public void setSetMassageName(String setMassageName) {
        this.setMassageName = setMassageName;
    }

    public ArrayList<String> getContext() {
        return context;
    }

    public void setContext(ArrayList<String> context) {
        this.context = context;
    }

    private String setMassageName;
    private ArrayList<String> context;

    public message(String setMassage1D, String setMassageName, ArrayList<String> context) {
        this.setMessage1D = setMassage1D;
        this.setMassageName = setMassageName;
        this.context = context;
    }

    public void FindWord(ArrayList<String> list, String Cari) {
        list.add(Cari);

        for (int index = 0; index < list.size(); index++) {
            list.get(index).indexOf(Cari);
        }
    }
}
