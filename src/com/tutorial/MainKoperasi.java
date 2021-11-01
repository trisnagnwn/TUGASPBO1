package com.tutorial;

public class MainKoperasi {
    public static void main(String[] args)
    {
        int total_harga;

        MainKoperasi Barang1 = new MainKoperasi();
        Barang1.setNama("Penggaris");
        Barang1.setStok(20);
        Barang1.setHarga_satuan(3000);
        Barang1.setHarga(20, 3000);
        int a=Barang1.getHarga();

        var  Barang2 = new MainKoperasi();
        Barang2.setNama("Tip Ex");
        Barang2.setStok(10);
        Barang2.setHarga_satuan(2000);
        Barang2.setHarga(10, 2000);
        int b=Barang2.getHarga();
   
        MainKoperasi Barang3 = new MainKoperasi();
        Barang3.setNama("Pulpen");
        Barang3.setStok(15);
        Barang3.setHarga_satuan(1500);
        Barang3.setHarga(15, 1500);
        int c=Barang3.getHarga();

        System.out.println("\nNama Alat Tulis = " +Barang1.getNama());
        System.out.println("Stok            = " +Barang1.getStok());
        System.out.println("Harga Satuan    = Rp. " +Barang1.getHarga_satuan());
        System.out.println("Harga           = Rp. " +Barang1.getHarga());

        System.out.println("\nNama Alat Tulis = " +Barang2.getNama());
        System.out.println("Stok            = " +Barang2.getStok());
        System.out.println("Harga Satuan    = Rp. " +Barang2.getHarga_satuan());
        System.out.println("Harga           = Rp. " +Barang2.getHarga());

        System.out.println("\nNama Alat Tulis = " +Barang3.getNama());
        System.out.println("Stoc            = " +Barang3.getStok());
        System.out.println("Harga Satuan    = Rp. " +Barang3.getHarga_satuan());
        System.out.println("Harga           = Rp. " +Barang3.getHarga());

        total_harga = a+b+c;
        System.out.println("\nTotal Harga     = Rp. " +total_harga);
    }

    private String getHarga_satuan() {
        return null;
    }

    private String getStok() {
        return null;
    }

    private String getNama() {
        return null;
    }

    private int getHarga() {
        return 0;
    }

    private void setHarga(int i, int j) {
    }

    private void setHarga_satuan(int i) {
    }

    private void setStok(int i) {
    }

    private void setNama(String string) {
    
}
}
