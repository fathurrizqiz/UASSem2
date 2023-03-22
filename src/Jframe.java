import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;


public class Jframe extends JFrame{

    private JPanel FrameHome;
    private JTextField tfnamabarang;
    private JTextField tfhargabarang;
    private JButton SUBMITButton;
    private JTextField tfResult;
    private JLabel hasil;


    public Jframe(){
        setTitle("selamat datang");
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(FrameHome);

    }

    public static void main(String[] args) throws IOException {

        Jframe FrameSaya = new Jframe();

        tugas2 farmasi = new tugas2();
        URL myaddress = farmasi.buildURL("https://farmasi.mimoapps.xyz/mimoqss2auyqD1EAlkgZCOhiffSsFl6QqAEIGtM");
        String response = farmasi.getresponsefromhttpUrl(myaddress);
        System.out.println(response);

        assert response !=null;
        JSONArray responseJSON = new JSONArray(response);
        ArrayList<tugas3> models = new ArrayList();

        for (int index=0;index<responseJSON.length();index++) {
            tugas3 Tfrmasi = new tugas3();
            JSONObject myJSONObject = responseJSON.getJSONObject(index);
            Tfrmasi.setI_nama(myJSONObject.getString("i_name"));
            Tfrmasi.setI_Cogs(myJSONObject.getString("i_cogs"));
            Tfrmasi.setI_kdsell(myJSONObject.getString("i_kdsell"));
            Tfrmasi.setI_qty(myJSONObject.getString("i_qty"));

        }



        FrameSaya.SUBMITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int index =0;index<models.size();index++){
                    int StokBarang = Integer.parseInt(models.get(index).getI_qty());
                    int hargaBarang = Integer.parseInt(models.get(index).getI_kdsell());
                    String name = String.valueOf(models.get(index).getI_nama().charAt(0));

                    if (name.contains("S")&&hargaBarang<7000){

                        if (StokBarang > 0){


                            FrameSaya.tfResult.setText(FrameSaya.tfhargabarang.getText());
                        }
                    }
                }
            }

        });

    }
}
