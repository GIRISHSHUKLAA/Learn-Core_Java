enum Beer {
    KF, KO, RC, FO
}

public class Main {

    public static void main(String[] args) {
        Beer b = Beer.RC;
        switch (b) {
            case KF:
                System.out.println("It is children's brand");
                break;
            case KO:
                System.out.println("It is too high");
                break;
            case RC:
                System.out.println("It is not that much kick");
                break;
            case FO:
                System.out.println("Buy 1 get 1 free");
                break;
            default:
                System.out.println("Other brands are not recommended");

        }

    }
}

