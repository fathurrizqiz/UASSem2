import myaddress.JSONArray;
import myaddress.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class UAS3 {
    public static void main(String[] args) throws IOException {
        ConnectURI koneksijaringan = new ConnectURI();

        URL myadress = koneksijaringan.buildURL
                ("https://dummyjson.com/products/search?q=laptop");

        String response = koneksijaringan.getresponsefromhttpUrl(myadress);
        System.out.println(response);

        assert response != null;
        JSONArray responseJSON = new JSONArray(response);
        ArrayList<modelUAS3> modelUAS3s =
                new ArrayList();
        for (int i = 0; i < responseJSON.length(); i++) {
            modelUAS3 laptop = new modelUAS3();
            JSONObject jsonObject = responseJSON.getJSONObject(i);
            laptop.setId(jsonObject.getString("ID"));
            laptop.setTittle(jsonObject.getString("title"));
            laptop.setDescription(jsonObject.getString("description"));
            laptop.setPrice(jsonObject.getInt("price"));
            laptop.setRatting(jsonObject.getInt("rating"));
            laptop.setStock(jsonObject.getInt("stock"));
            laptop.setBrand(jsonObject.getString("brand"));
            laptop.setKategori(jsonObject.getString("category"));
            laptop.setThumbnail(jsonObject.getString("thumbnail"));
        }
        System.out.println("Data JSON:");
        for (modelUAS3 laptop : modelUAS3s) {
            System.out.println("ID: " + laptop.getId());
            System.out.println("Title : )" + laptop.getTittle());
            System.out.println("Price : " + laptop.getPrice());
            System.out.println("Description: " + laptop.getDescription());
            System.out.println("Stock : " + laptop.getStock());
            System.out.println("Rating : " + laptop.getRatting());
            System.out.println("Brand : " + laptop.getBrand());
            System.out.println("Thumbnail : " + laptop.getThumbnail());
            System.out.println("kategori : " + laptop.getKategori());
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan rating");
        double searchRating = input.nextDouble();
        modelUAS3 searchData = searchData(modelUAS3s, searchRating);
        if (searchData != null) {
            System.out.println("Data dengan rating " + searchRating + " :");
            System.out.println("ID: " + searchData.getId());
            System.out.println("Title: " + searchData.getTittle());
            System.out.println("Price : " + searchData.getPrice());
            System.out.println("Description: " + searchData.getDescription());
            System.out.println("Stock: " + searchData.getStock());
            System.out.println("Rating: " + searchData.getRatting());
            System.out.println("Brand: " + searchData.getBrand());
            System.out.println("Thumbnail: " + searchData.getThumbnail());
            System.out.println("kategori: " + searchData.getKategori());
        } else {
            System.out.println("data from Ratings " + searchRating + " Data not Request.");
        }

            int n = modelUAS3s.size();

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (modelUAS3s.get(j).getRatting() < modelUAS3s.get(minIndex).getRatting()) {
                        minIndex = j;
                    }
                }

                if (minIndex != i) {
                    // Swap the elements
                    modelUAS3 temp = modelUAS3s.get(i);
                    modelUAS3s.set(i, modelUAS3s.get(minIndex));
                    modelUAS3s.set(minIndex, temp);
                }
            }
        }


            for (modelUAS3 laptop : modelUAS3s) {
                // Print laptop details before sorting
                System.out.println("ID: " + laptop.getId());
                System.out.println("Title : )" + laptop.getTittle());
                System.out.println("Price : " + laptop.getPrice());
                System.out.println("Description: " + laptop.getDescription());
                System.out.println("Stock : " + laptop.getStock());
                System.out.println("Rating : " + laptop.getRatting());
                System.out.println("Brand : " + laptop.getBrand());
                System.out.println("Thumbnail : " + laptop.getThumbnail());
            }
    }

    private static modelUAS3 searchData(ArrayList<modelUAS3> modelUAS3s, double searchRating) {
    }

}
