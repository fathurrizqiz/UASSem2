import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.xml.namespace.QName;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;



public class tugas4 {
    public static void  main(String[]args)throws IOException {
        tugas2 farmasi = new tugas2();

        URL myaddress = farmasi.buildURL("https://farmasi.mimoapps.xyz/mimoqss2auyqD1EAlkgZCOhiffSsFl6QqAEIGtM");
        String response = farmasi.getresponsefromhttpUrl(myaddress);
        System.out.println(response);


        //JSON
        assert response !=null;
        JSONArray responseJSON = new JSONArray(response);
       ArrayList <tugas3> models = new ArrayList<>();


        for (int index=0;index<responseJSON.length();index++) {
            tugas3 Tfrmasi = new tugas3();
            JSONObject myJSONObject = responseJSON.getJSONObject(index);
            Tfrmasi.setI_cogs(myJSONObject.getString("i_cogs"));
            Tfrmasi.setI_kdsell(myJSONObject.getString("i_kdsell"));
            Tfrmasi.setI_qty(myJSONObject.getString("i_qty"));
            Tfrmasi.setI_nama(myJSONObject.getString("i_nama"));



            models.add(Tfrmasi);

        }


        System.out.println("response are");

        for (int index =0;index<models.size();index++){

            System.out.println(models.get(index).getI_nama());

            int harga = Integer.parseInt(models.get(index).getI_sell());

            if (harga < 7000){
                System.out.println("harga barang : " + harga);
            }

        }




            }



}
