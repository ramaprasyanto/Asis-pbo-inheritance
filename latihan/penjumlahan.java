public class penjumlahan{

    public int jumlah(int A ,int B) {
        return A+B;
    }

    public double jumlah(double C,double D){ 
        return C+D;
    }

    public void cetak(int A, int B) {
        System.out.println(A+" + "+B+"="+ jumlah(A, B));
    }
    public void cetak(double C, Double D) {
        System.out.println(C+" + "+D+"="+ jumlah(C, D));        
    }



}