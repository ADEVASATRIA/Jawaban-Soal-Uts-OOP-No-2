//Adeva Stria Arif Wibawa
//2502012464 - LA20;
package restaurant_uts_no_2;


public class makanan {
    private String Makanan;
    private String jenis;
    private String harga;
    

    makanan(String Makanan,String jenis,String harga){
        this.Makanan = Makanan;
        this.jenis = jenis;
        this.harga = harga;
    }
    
    public String getMakanan(){
        return Makanan;
    }
    public String getjenis(){
        return jenis;
    }
    public String getharga(){
        return harga;
    }
    
}
