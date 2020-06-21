import java.util.Scanner;

public class programArray {
    public static void main(String[] args) {
        int i;
        String pemesan[];
        pemesan = new String[20];
        int tujuan;
        String kota[]=new String[100];
        int pilih;
        int jumlah[]=new int[10];
        int total[] = new int[10];
        int harga[]=new int[10];
        Scanner input=new Scanner(System.in);

        System.out.println("                                 PT KERETA MALAM                           ");
        System.out.println("===========================================================================");
        System.out.println("                                                                           ");
        System.out.println("--------------------------Kode Tujuan, Kelas, dan Harga--------------------");
        System.out.println("||  1. Malang-Surabaya   ||  2. Malang-Probolinggo  ||  3. Malang-Jember ||");
        System.out.println("||1. EKO: Rp 10000       ||1. EKO: Rp 5000          ||1. EKO: Rp 15000   ||");
        System.out.println("||2. BIS: Rp 20000       ||2. BIS: Rp 10000         ||2. BIS: Rp 25000   ||");
        System.out.println("||3. EKS: Rp 30000       ||3. EKS: Rp 15000         ||3. EKS: Rp 35000   ||");
        System.out.println("---------------------------------------------------------------------------");
        System.out.print("                          Silakan Masukan Jumlah Antrian: "                   );
        int antrian=input.nextInt();
        int data[]=new int [antrian];
        System.out.println("---------------------------------------------------------------------------");
        for(i=0;i<antrian;i++){
            System.out.println("Data ke ["+(i+1)+"]");
            System.out.print("Nama Pemesan = ");
            pemesan[i]=input.next();
            System.out.print("Tujuan = ");
            tujuan=input.nextInt();
            System.out.print("Pilihan Kelas = ");
            pilih=input.nextInt();
            if(tujuan==1){
                kota[i]="Malang - Surabaya";
                if(pilih==1){
                    harga[i]=10000;
                }else if(pilih==2){
                    harga[i]=20000;
                }else if(pilih==3){
                    harga[i]=30000;
                }
            }else if(tujuan==2){
                kota[i]="Malang - Probolinggo";
                if(pilih==1){
                    harga[i]=5000;
                }else if(pilih==2){
                    harga[i]=10000;
                }else if(pilih==3){
                    harga[i]=15000;
                }
            }else if(tujuan==3){
                kota[i]="Malang - Jember";
                if(pilih==1){
                    harga[i]=15000;
                }else if(pilih==2){
                    harga[i]=25000;
                }else if(pilih==3){
                    harga[i]=35000;
                }
            }
            System.out.print("Jumlah Pesanan = ");
            jumlah[i]=input.nextInt();
            total[i]=total[i]+harga[i]*jumlah[i];
        }
        for(i=0;i<antrian;i++){
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Data Pemesan ke ["+(i+1)+"]");
            System.out.println("Nama Pemesan                 = "+pemesan[i]);
            System.out.println("Tujuan                       = "+kota[i]);
            System.out.println("Total Harga                  = Rp."+total[i]);
        }
        System.out.println("==========================================================================");
        System.out.println("                               Selamat Jalan                              ");
    }
}