public class UcgenOlusturma02 {
    public static void main(String[] args) {

        /*         0123*5678
                      ***
                     *****
                    *******
                   *********

         */


        for (int i = 0; i < 5; i++) {
            switch (i){
                case 0:
                    for (int j = 0; j < 9; j++) {
                        switch (j) {
                            case 4:
                                System.out.print("*");
                                break;
                            default:
                                System.out.print(" ");
                                break;
                        }
                    }
                    System.out.println("");
                    break;
                case 1:
                    for (int k = 0; k < 9; k++) {
                        switch (k) {
                            case 3:
                            case 4:
                            case 5:
                                System.out.print("*");
                                break;
                            default:
                                System.out.print(" ");
                                break;
                        }
                    }
                    System.out.println("");
                    break;
                case 2:
                    for (int j = 0; j < 9; j++) {
                        switch (j) {
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                System.out.print("*");
                                break;
                            default:
                                System.out.print(" ");
                                break;
                        }
                    }
                    System.out.println("");
                    break;
                case 3:
                    for (int j = 0; j < 9; j++) {
                        switch (j) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                System.out.print("*");
                                break;
                            default:
                                System.out.print(" ");
                                break;
                        }
                    }
                    System.out.println("");
                    break;
                case 4:
                    for (int j = 0; j < 9; j++) {
                        switch (j) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                System.out.print("*");
                                break;
                            default:
                                System.out.print(" ");
                                break;
                        }
                    }
            }
        }
    }
}