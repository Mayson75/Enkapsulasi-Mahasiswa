package com.company;

public class Mahasiswa{
    private String nama;
    private String alamat;
    private String agama;
    public Mahasiswa(String n, String almt,String agma) {
        this.nama = n;
        this.alamat = almt;
        this.agama = agma;
    }
    public String tampilkanNama() {
        return nama;
    }
    public String tampilkanalamat() {
        return alamat;
    }
    public String tampilkanagama() {
        return agama;
    }
}
//membuat main
public class main{
    public static void main(String[] args) {
        Mahasiswa Intan = new Mahasiswa(“Rusli“,“Bogor”,”Islam”);
        System.out.println(“Nama \t : ” + Rusli.tampilkanNama());
        System.out.println(“Alamat \t : ” +  Rusli.tampilkanalamat());
        System.out.println(“Agama \t : ” +  Rusli.tampilkanagama());
        System.out.println();
        Mahasiswa Nurjanah = new Mahasiswa(“Patar”, “Depok”,”Kristen Protestan”);
        System.out.println(“Nama \t : ” + Patar.tampilkanNama());
        System.out.println(“Alamat \t : ” + Patar.tampilkanalamat());
        System.out.println(“Agama \t : ” + Patar.tampilkanagama());
        System.out.println();
    }
}