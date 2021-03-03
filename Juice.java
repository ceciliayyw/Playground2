public class Juice {

    public class OJ {
        int[] x;
        OJ z;

        OJ(int x, int y) {
            this.x = new int[2];
            this.x[0] = x;
            this.x[1] = y;
        }
    }

    public OJ o1;
    public static OJ o2;

    Juice() {
        o1 = new OJ(1, 2);
        o1.z = new OJ(5, 6);
        o2 = new OJ(3, 4);
        o2.z = new OJ(7, 8);
        pulpify();
        vitaminSeed();
        appleImposter();
    }

    public void pulpify() {
        o1.x[1] = o2.x[1]; // a
    }

    public void vitaminSeed() {
        o1.x[0] = o1.z.x[0]; // b
//        System.out.println("this is value " + o2.x[0]);
        o2.x[0] = o2.z.x[1]; // c
        o1.z = o2;
    }

    public void appleImposter() {
        o1.x[1] = o2.x[0];
        o2.x[0] = o1.x[1];
        o2.x[1] = o1.z.x[0]; // d
        System.out.println("this is value " + o1.x[0]);
    }
    public static void main (String arg[]){
        Juice j = new Juice();
    }
}




