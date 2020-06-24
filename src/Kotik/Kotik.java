package Kotik;

public class Kotik {
    private int prettiness;
    private int weight;
    private String name;
    private String meow;


    public Kotik() {
    }

    public Kotik(int prettiness, int weight, String name, String meow) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
    }


    /*
    void setKotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
    }

    int giveMeMoney() {
        return 100;
    }
    */

    void sayMeow() {
        System.out.println(name + " говорит " + meow);
    }
}
