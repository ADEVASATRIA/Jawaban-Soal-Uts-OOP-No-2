//Adeva Stria Arif Wibawa
//2502012464 - LA20;
package restaurant_uts_no_2;
import java.util.Scanner;
import java.util.*;
import static restaurant_uts_no_2.RESTAURANT_UTS_NO_2.main;



public class Admin {
    public static void menu(){
        List <makanan> c = new ArrayList <makanan> (); // data base makanan
        List <minuman> d = new ArrayList <minuman> (); // data base minuman
        List <kudapan> e = new ArrayList <kudapan> (); // data base kudapan
        int ch; // int digunakan untuk memilih menu
        Scanner s = new Scanner(System.in); // input pilihan admin
        Scanner s1 = new Scanner(System.in);  // variabel digunakan saat admin ingin memasukkan data makanan baru
        Scanner input_string = new Scanner (System.in);  // variabel digunakan saat admin ingin meng edit makanan
        Scanner input_string_minuman = new Scanner (System.in); // variabel digunakan admin untuk meng edit minuman
        Scanner input_string_dessert = new Scanner(System.in);
        int nomor = 0; // variabel nomor digunakan agar mempermudah saat file makanan akan di add,edit,hapus, dan tampilkan
        int minuman = 0;// variabel minuman digunakan agar mempermudah saat file minuman akan di add,edit,hapus, dan tampilkan
        int kudapan = 0;// variabel kudapan digunakan agar mempermudah saat file kudapan akan di add,edit,hapus, dan tampilkan
        int pilihan; // variabel pilihan digunakan untuk admin ingin mengedit data makanan 
        int pilihan2; // variabel pilihan2 digunakan unntuk admin ingin mengedit data minuman 
        int pilihan3;

        do{
            System.out.println("\n");
            System.out.println("=================================================");
            System.out.println("|+++++++++ Menu Admin Restaurant Malang ++++++++|");
            System.out.println("=================================================");
            System.out.println("1. Menambahkan Data makanan (main Course)       |");
            System.out.println("2. Menambahkan Data Minuman (Hot / ice  )       |");
            System.out.println("3. Menambahkan Data Kudapan (Desert / Appetizer)|");
            System.out.println("4. Edit data                                    |");
            System.out.println("5. Hapus Data                                   |");
            System.out.println("6. Tampilkan data                               |");
            System.out.println("0. exit");
            System.out.print("Masukkan Pilihan Anda [1...3]: ");
            ch = s.nextInt();
            switch(ch){
                case 1:// menambah data makanan
                    System.out.println("\n");
                    System.out.println("========================================================");
                    System.out.println("|+++++ Silahkan Masukkan data yang ingin dimasukkan +++|");
                    System.out.println("========================================================");
                    nomor++;
                    System.out.print("Nama Makanan   : ");
                    String Makanan = s1.nextLine();
                    System.out.print("Jenis Makanan  : ");
                    String jenis = s1.nextLine();
                    System.out.print("Harga Makanan  : ");
                    String harga = s1.nextLine();

                    c.add(new makanan(Makanan, jenis, harga));
                    break;
                case 2: // menambah data minuman
                    Scanner Nama_Minuman = new Scanner(System.in);
                    System.out.println("\n");
                    System.out.println("========================================================");
                    System.out.println("|+++++ Silahkan Masukkan data yang ingin dimasukkan +++|");
                    System.out.println("========================================================");
                    minuman++;
                    System.out.print("Nama Minuman   : ");
                    String Minuman = Nama_Minuman.nextLine();
                    System.out.print("Jenis Minuman  : ");
                    String jenis2 = Nama_Minuman.nextLine();
                    System.out.print("Harga Minuman  : ");
                    String harga2 = Nama_Minuman.nextLine();
                    
                    d.add(new minuman(Minuman,jenis2,harga2));
                    break;
                case 3:// menambah data kudapan
                    Scanner Nama_Kudapan = new Scanner(System.in);
                    System.out.println("\n");
                    System.out.println("========================================================");
                    System.out.println("|+++++ Silahkan Masukkan data yang ingin dimasukkan +++|");
                    System.out.println("========================================================");
                    kudapan++;
                    System.out.print("Nama Kudapan   : ");
                    String Kudapan = Nama_Kudapan.nextLine();
                    System.out.print("Jenis Kudapan  : ");
                    String jenis3 = Nama_Kudapan.nextLine();
                    System.out.print("Harga Kudapan  : ");
                    String harga3 = Nama_Kudapan.nextLine();
                    e.add(new kudapan(Kudapan,jenis3,harga3));
                    break;
                case 4:// edit data yang sudah dimasukkan
                    Scanner edit1 = new Scanner(System.in);
                    int edit;
                    do{
                        System.out.println("============================");
                        System.out.println("|   Menu Edit | ++ ADMIN ++ |");
                        System.out.println("=============================");
                        System.out.println("1. Edit Makanan");
                        System.out.println("2. Edit Minuman");
                        System.out.println("3. Edit Kudapan");
                        System.out.println("0. exit menu tampilan data ");
                        System.out.print("masukkan pilihan Anda [1...0]: ");
                        edit = edit1.nextInt();
                        switch(edit){
                            case 1:
                                System.out.println("\n");
                                System.out.println("=======================================================");
                                System.out.println("|+++++ Berikut merupakan data yang baru dimasukkan +++|");
                                System.out.println("=======================================================");
                                for(int i = 0; i < nomor;i++){
                                    System.out.println("|"+(i+1)+". "+ "|" +c.get(i).getMakanan()+"\t |"+ c.get(i).getjenis()+ "\t |" + c.get(i).getharga()+"     |");

                                }
                                do{
                                    System.out.println("\n");
                                    System.out.println("==========================================");
                                    System.out.println("|+++++ Silahkan memilih data yang ada +++|");
                                    System.out.println("==========================================");
                                    System.out.print("Data mana yang akan anda pilih / tekan 0 untuk keluar : ");
                                    pilihan = input_string.nextInt();
                                    Scanner makanan_baru = new Scanner(System.in);
                                    switch(pilihan){
                                        case 1:
                                        int size = c.size();
                                            if(size!=0){
                                                System.out.print("masukkan nama makanan  : ");
                                                String nama_makanan = makanan_baru.nextLine();
                                                System.out.print("Masukkan jenis Makanan : ");
                                                String jenis_makanan = makanan_baru.nextLine();
                                                System.out.print("Masukkan harga Makanan :");
                                                String harga_makanan = makanan_baru.nextLine();

                                                c.set( size -1, new makanan(nama_makanan,jenis_makanan,harga_makanan));
                                                break;
                                            }else{
                                                System.out.println("DATA MAKANAN TIDAK ADA !");

                                            }
                                            break;
                                    }
                                    break;
                            }while(pilihan!=0);
                                break;
                            case 2 :
                                System.out.println("\n");
                                System.out.println("===============================================================");
                                System.out.println("|+++++ Berikut merupakan data Minuman yang baru dimasukkan +++|");
                                System.out.println("===============================================================");
                                for(int i = 0; i < minuman;i++){
                                    System.out.println("|"+(i+1)+". "+ "|" +d.get(i).getminuman()+"\t        |"+ d.get(i).getjenis2()+ "\t                |" + d.get(i).getharga2()+"      |");

                                }
                                do{
                                    System.out.println("\n");
                                    System.out.println("==========================================");
                                    System.out.println("|+++++ Silahkan memilih data yang ada +++|");
                                    System.out.println("==========================================");
                                    System.out.print("Data mana yang akan anda pilih / tekan 0 untuk keluar : "); 
                                    pilihan2 = input_string_minuman.nextInt();
                                    Scanner minuman_baru = new Scanner(System.in);
                                    switch(pilihan2){
                                        case 1:
                                            int Size_minuman = d.size();
                                            if(Size_minuman!=0){
                                                System.out.print("masukkan nama Minuman  : ");
                                                String nama_minuman = minuman_baru.nextLine();
                                                System.out.print("Masukkan jenis Minuman : ");
                                                String jenis_minuman = minuman_baru.nextLine();
                                                System.out.print("Masukkan harga Minuman :");
                                                String harga_minuman= minuman_baru.nextLine();

                                                d.set( Size_minuman -1, new minuman(nama_minuman,jenis_minuman,harga_minuman));
                                                break;
                                            }else{
                                                System.out.println("DATA MINUMAN TIDAK ADA !");

                                            }
                                        break;
                                            
                                    }
                                    
                                }while(pilihan2!=0);
                                break;
                            case 3:
                                System.out.println("\n");
                                System.out.println("===============================================================");
                                System.out.println("|+++++ Berikut merupakan data Kudapan yang baru dimasukkan +++|");
                                System.out.println("===============================================================");
                                for(int i = 0; i < kudapan;i++){
                                    System.out.println("|"+(i+1)+". "+ "|" +e.get(i).getKudapan()+"\t        |"+ e.get(i).getjenis3()+ "\t          |" + e.get(i).getjenis3()+"     |");

                                }
                               do{
                                    System.out.println("\n");
                                    System.out.println("==========================================");
                                    System.out.println("|+++++ Silahkan memilih data yang ada +++|");
                                    System.out.println("==========================================");
                                    System.out.print("Data mana yang akan anda pilih / tekan 0 untuk keluar : "); 
                                    pilihan3 = input_string_dessert.nextInt();
                                    Scanner dessert_baru = new Scanner(System.in);
                                    switch(pilihan3){
                                        case 1:
                                            int Size_dessert = d.size();
                                            if(Size_dessert!=0){
                                                System.out.print("masukkan nama Kudapan  : ");
                                                String nama_dessert = dessert_baru.nextLine();
                                                System.out.print("Masukkan jenis Kudapan : ");
                                                String jenis_dessert = dessert_baru.nextLine();
                                                System.out.print("Masukkan harga Kudapan :");
                                                String harga_dessert= dessert_baru.nextLine();

                                                e.set( Size_dessert -1, new kudapan(nama_dessert,jenis_dessert,harga_dessert));
                                                break;
                                            }else{
                                                System.out.println("DATA KUDAPAN TIDAK ADA !");

                                            }
                                        break;
                                            
                                    }
                                    
                                }while(pilihan3!=0); 
                                
                        }
                        break;
                    }while(edit!=0);
                    break;
                case 5: // Delete Data 
                    Scanner hapus = new Scanner(System.in);
                    int delete;
                    
                    do{
                        System.out.println("============================");
                        System.out.println("|   Menu Edit | ++ ADMIN ++ |");
                        System.out.println("=============================");
                        System.out.println("1. Hapus Makanan");
                        System.out.println("2. Hapus Minuman");
                        System.out.println("3. Hapus Kudapan");
                        System.out.println("0. exit menu tampilan data ");
                        System.out.print("masukkan pilihan Anda [1...0]: ");
                        
                        delete = hapus.nextInt();
                        switch(delete){
                            case 1:
                                if(nomor == 0){
                                    System.out.println("\n");
                                    System.out.println("===============");
                                    System.out.println("| Data Kosong |");
                                    System.out.println("===============");
                                }else{
                                    c.removeAll(c);
                                    nomor = 0;
                                    System.out.println("\n");
                                    System.out.println("===================");
                                    System.out.println("| Delete berhasil |");
                                    System.out.println("===================");
                                }
                                break;
                            case 2:
                                if(minuman == 0){
                                    System.out.println("Data kosong");
                                }else{
                                    d.removeAll(d);
                                    minuman = 0;
                                    System.out.println("\n");
                                    System.out.println("===================");
                                    System.out.println("| Delete berhasil |");
                                    System.out.println("===================");
                                }
                                break;
                            case 3:
                                if(kudapan == 0){
                                    System.out.println("Data kosong");
                                }else{
                                    e.removeAll(e);
                                    kudapan = 0;
                                    System.out.println("\n");
                                    System.out.println("===================");
                                    System.out.println("| Delete berhasil |");
                                    System.out.println("===================");
                                }
                                break;
                                
                        }
                    }while(delete!=0);
                    
                    
                case 6: // menu tampilakan data 
                    Scanner pilihan_view = new Scanner(System.in);
                    int view;
                    do{
                        System.out.println("\n");
                        System.out.println("========================================================");
                        System.out.println("|+++++ Silahkan Pilih Data yang akan Di tampilkan  +++|");
                        System.out.println("=========================================================");
                        System.out.println("1. Makanan");
                        System.out.println("2. Minuman");
                        System.out.println("3. Kudapan");
                        System.out.println("0. Menu Awal ");
                        System.out.print("Masukkan pilihan anda [1...3] :");
                        
                        view = pilihan_view.nextInt();
                        switch(view){
                            case 1 :
                                System.out.println("\n");
                                System.out.println("===============================================================");
                                System.out.println("|+++++ Berikut merupakan data Makanan yang baru dimasukkan +++|");
                                System.out.println("===============================================================");
                                for(int i = 0; i < nomor;i++){
                                    System.out.println("|"+(i+1)+". "+ "|" +c.get(i).getMakanan()+"\t |"+ c.get(i).getjenis()+ "\t |" + c.get(i).getharga()+"     |");

                                }
                                break;
                            case 2:
                                System.out.println("\n");
                                System.out.println("===============================================================");
                                System.out.println("|+++++ Berikut merupakan data Minuman yang baru dimasukkan +++|");
                                System.out.println("===============================================================");
                                for(int i = 0; i < minuman;i++){
                                    System.out.println("|"+(i+1)+". "+ "|" +d.get(i).getminuman()+"\t        |"+ d.get(i).getjenis2()+ "\t                |" + d.get(i).getharga2()+"      |");

                                }
                                break;
                            case 3 :
                                System.out.println("\n");
                                System.out.println("===============================================================");
                                System.out.println("|+++++ Berikut merupakan data Kudapan yang baru dimasukkan +++|");
                                System.out.println("===============================================================");
                                for(int i = 0; i < kudapan;i++){
                                    System.out.println("|"+(i+1)+". "+ "|" +e.get(i).getKudapan()+"\t        |"+ e.get(i).getjenis3()+ "\t      |" + e.get(i).getharga3()+"     |");

                                }
                                break;
                        }
                        
                    }while(view!=0);
            }
        }while(ch!=0);
    }

}
