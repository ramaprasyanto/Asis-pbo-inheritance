public class penjumlahan{
    protected int A,B;
    protected Double C,D;
    public penjumlahan(){}

    public penjumlahan(int A,int B){
        this.A = A;
        this.B = B;
    }
    public penjumlahan(Double C,Double D){
        this.C = C;
        this.D = D;
    }
    public int jumlah(int A ,int B) {
        this.A = A;
        this.B = B;
        return A+B;
    }

    public double jumlah(double C,double D){ 
        this.C = C;
        this.D = D;
        return C+D;
    }

    public void cetak() {
        System.out.println(A+" + "+B+"="+ jumlah(A, B));
        System.out.println(C+" + "+D+"="+ jumlah(C, D));
    }



}