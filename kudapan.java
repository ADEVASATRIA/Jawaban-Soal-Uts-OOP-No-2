
package restaurant_uts_no_2;
public class kudapan {
    private String Kudapan;
    private String jenis3;
    private String harga3;

    public kudapan(String Kudapan, String jenis3, String harga3) {
        this.Kudapan = Kudapan;
        this.jenis3 = jenis3;
        this.harga3 = harga3;
    }

    public String getKudapan() {
        return Kudapan;
    }

    public String getjenis3() {
        return jenis3;
    }

    public String getharga3() {
        return harga3;  
    }
}