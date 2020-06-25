package Kotik;

public class Kotik {
    private int prettiness;
    private int weight;
    private int fullness;
    private String name;
    private String meow;

    private boolean isFed() {
        if (fullness <= 0) {
            System.out.println(">>Ничего не буду делать, я голодный!");
            return false;
        }
        return true;
    }

    public void setFullness(int fullness) {
        this.fullness = fullness;
    }

    public int getFullness() {
        return this.fullness;
    }

    public Kotik() {
    }

    public Kotik(int prettiness, int weight, String name, String meow) {
        this.fullness = 500;
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

    public void sayMeow() {
        System.out.println(name + " говорит " + meow);
    }

    public boolean play() {
        if (isFed()) {
            fullness -= 100;
            System.out.println(">>Играем с клубком...");
            return true;
        } else {
            return false;
        }
    }

    public boolean run() {
        if (isFed()) {
            fullness -= 100;
            System.out.println(">>Бегаю-бегаю...");
            return true;
        } else {
            return false;
        }
    }

    public void eat() {
        eat("Корм", 200);
    }

    public boolean eat(int nutrition) {
        if (nutrition <= 0) {
            System.out.println(">>Чего дразнишься? Где еда?");
            return false;
        } else {
            fullness += nutrition;
            System.out.println("Покушал");
            return true;
        }
    }

    public boolean eat(String food, int nutrition) {
        if (nutrition <= 0) {
            System.out.println(">>Чего дразнишься? Где еда?");
            return false;
        } else {
            fullness += nutrition;
            System.out.println(">>Скушал " + food);
            return true;
        }
    }

    public boolean chaseMouse() {
        if (isFed()) {
            int hunt = (int) (Math.random() * 2);
            System.out.println(">>Вот ты где, мышш..!");
            if (hunt == 0) {
                System.out.println(">>В следующий раз точно поймаю...");
            } else {
                System.out.println(">>Ага, попавси!");
                eat("Мышь", 100);
            }
            return true;
        } else {
            return false;
        }

    }

    public boolean sleep() {
        if (isFed()) {
            fullness -= 100;
            System.out.println(">>...ZzZzZzZzZ...");
            return true;
        } else {
            return false;
        }

    }

    public boolean sharpenClaws() {
        if (isFed()) {
            fullness -= 100;
            System.out.println(">>Точим-точим-точим коготочки...");
            return true;
        } else {
            return false;
        }

    }

    public void liveAnotherDay() {
        for (int i = 0; i < 24; i++) {
            int action = (int) (Math.random() * 6) + 1;
            System.out.println((i + 1) + " час:");
            System.out.println("Сытость: " + getFullness());
            switch (action) {
                case 1:
                    eat();
                    break;
                case 2:
                    chaseMouse();
                    break;
                case 3:
                    sleep();
                    break;
                case 4:
                    sharpenClaws();
                    break;
                case 5:
                    run();
                    break;
                case 6:
                    play();
                    break;
                default:
                    sayMeow();
                    break;
            }
        }
    }

}
