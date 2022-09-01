class CalculateSI{
   private int p, t, r;

    CalculateSI(int p, int t, int r){
        this.p=p;
        this.t=t;
        this.r=r;
    }

    void display(){
        System.out.println(p*t*r/100);
    }

    public static void main(String[] args) {
        CalculateSI SI=new CalculateSI(1000, 15, 2);
        SI.display();
    }

}
