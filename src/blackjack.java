import java.util.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class blackjack {


    public static void main(String[] args) {

        int a [][]= {{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
        //           Clubs....................Diamonds...................Hearts...................Spades.....................
        String b [] ={"Jack","Queen","King"};
        String ca [] = {"Third","Fourth","Fifth","sixth","seventh","Eighth","Ninth"};

        int Userspoint = 0 ;
        int Computer = 0;
        int j = 0;
        int upperbound = 10;
        int upperbound2 = 4;
        int ten_point = 2;
        boolean comput = true;
        boolean final0 = true;

        String Computersecond ="";
        int Computersecond0 = 0;

        for (int i = 0; i <= 3; i++){     //4 adet sayı üretiyor.
            Random rand = new Random(); //instance of random class
            int int_random = rand.nextInt(upperbound);
            int int_random2 = rand.nextInt(upperbound2);
            int int_random0 = rand.nextInt(ten_point);

            if (j == 0){    //aynı kart 5 kere çekilebileceği için silmiyorum kartları.
                Userspoint += a[int_random2][int_random];
                if (a[int_random2][int_random] != 10 && int_random2 == 0){                                                          //10 gelmeyen durumlar için.
                    System.out.println("Users first     " + "Clubs    | "+a[int_random2][int_random]);
                } else if (a[int_random2][int_random] != 10 && int_random2 == 1){
                    System.out.println("Users first     " + "Diamonds | "+a[int_random2][int_random]);
                }else if (a[int_random2][int_random] != 10 && int_random2 == 2){
                    System.out.println("Users first     " + "Hearts   | "+a[int_random2][int_random]);
                }else if (a[int_random2][int_random] != 10 && int_random2 == 3){
                    System.out.println("Users first     " + "Spades   | "+a[int_random2][int_random]);
                }
                if (a[int_random2][int_random] == 10  && int_random2 == 0){
                    System.out.println("Users first     " + "Clubs    | " + b[int_random0] + " " + a[int_random2][int_random]);     //10 gelen durumlarda 10 nun hangisi olduğu.
                } else if (a[int_random2][int_random] == 10  && int_random2 == 1){
                    System.out.println("Users first     " + "Diamonds | " + b[int_random0] + " "  + a[int_random2][int_random]);
                }else if (a[int_random2][int_random] == 10  && int_random2 == 2){
                    System.out.println("Users first     " + "Hearts   | " + b[int_random0] + " "  + a[int_random2][int_random]);
                }else if (a[int_random2][int_random] == 10  && int_random2 == 3){
                    System.out.println("Users first     " + "Spades   | " + b[int_random0] + " "  + a[int_random2][int_random]);
                }
                if (a[int_random2][int_random] == 1){                                                                               //eğerki ilk kart 1 gelirse değeri 11 olarak atanıyor
                    Userspoint += 10;
                }
            }
            if(j == 1){
                Computer += a[int_random2][int_random];
                if (a[int_random2][int_random] != 10 && int_random2 == 0){
                    System.out.println("Computer first  " + "Clubs    | "+a[int_random2][int_random]);
                } else if (a[int_random2][int_random] != 10 && int_random2 == 1){
                    System.out.println("Computer first  " + "Diamonds | "+a[int_random2][int_random]);
                }else if (a[int_random2][int_random] != 10 && int_random2 == 2){
                    System.out.println("Computer first  " + "Hearts   | "+a[int_random2][int_random]);
                }else if (a[int_random2][int_random] != 10 && int_random2 == 3){
                    System.out.println("Computer first  " + "Spades   | "+a[int_random2][int_random]);
                }
                if (a[int_random2][int_random] == 10  && int_random2 == 0){
                    System.out.println("Computer first     " + "Clubs    | " + b[int_random0] + " " + a[int_random2][int_random]);
                } else if (a[int_random2][int_random] == 10  && int_random2 == 1){
                    System.out.println("Computer first     " + "Diamonds | " + b[int_random0] + " "  + a[int_random2][int_random]);
                }else if (a[int_random2][int_random] == 10  && int_random2 == 2){
                    System.out.println("Computer first     " + "Hearts   | " + b[int_random0] + " "  + a[int_random2][int_random]);
                }else if (a[int_random2][int_random] == 10  && int_random2 == 3){
                    System.out.println("Computer first     " + "Spades   | " + b[int_random0] + " "  + a[int_random2][int_random]);
                }
                if (a[int_random2][int_random] == 1){                                                                               //eğerki ilk kart 1 gelirse değeri 11 olarak atanıyor
                    Computer += 10;
                }
            }
            if (j == 2){
                Userspoint += a[int_random2][int_random];
                if (a[int_random2][int_random] != 10 && int_random2 == 0){
                    System.out.println("Users second    " + "Clubs    | "+a[int_random2][int_random] + "\n");
                } else if (a[int_random2][int_random] != 10 && int_random2 == 1){
                    System.out.println("Users second    " + "Diamonds | "+a[int_random2][int_random] + "\n");
                }else if (a[int_random2][int_random] != 10 && int_random2 == 2){
                    System.out.println("Users second    " + "Hearts   | "+a[int_random2][int_random] + "\n");
                }else if (a[int_random2][int_random] != 10 && int_random2 == 3){
                    System.out.println("Users second    " + "Spades   | "+a[int_random2][int_random] + "\n");
                }
                if (a[int_random2][int_random] == 10  && int_random2 == 0){
                    System.out.println("Users second     " + "Clubs    | " + b[int_random0] + " " + a[int_random2][int_random] + "\n");
                } else if (a[int_random2][int_random] == 10  && int_random2 == 1){
                    System.out.println("Users second     " + "Diamonds | " + b[int_random0] + " "  + a[int_random2][int_random] + "\n");
                }else if (a[int_random2][int_random] == 10  && int_random2 == 2){
                    System.out.println("Users second     " + "Hearts   | " + b[int_random0] + " "  + a[int_random2][int_random] + "\n");
                }else if (a[int_random2][int_random] == 10  && int_random2 == 3){
                    System.out.println("Users second     " + "Spades   | " + b[int_random0] + " "  + a[int_random2][int_random] + "\n");
                }
                if (Userspoint < 11 && a[int_random2][int_random] == 1){                                                 //eğerki ilk kart as olmazsa ve 2. çekilen kart as olursa değeri 11.
                    Userspoint += 10;
                }
            }
            if (j == 3){
                Computersecond0 = a[int_random2][int_random];
                if (a[int_random2][int_random] != 10 && int_random2 == 0){
                    Computersecond = ("Computer second " + "Clubs    | ");                  // 2. kart gizlenecek.
                } else if (a[int_random2][int_random] != 10 && int_random2 == 1){
                    Computersecond = ("Computer second " + "Diamonds | ");
                }else if (a[int_random2][int_random] != 10 && int_random2 == 2){
                    Computersecond = ("Computer second " + "Hearts   | ");
                }else if (a[int_random2][int_random] != 10 && int_random2 == 3){
                    Computersecond = ("Computer second " + "Spades   | ");
                }
                if (a[int_random2][int_random] == 10  && int_random2 == 0){
                    Computersecond = ("Computer second     " + "Clubs    | " + b[int_random0] + " ");
                } else if (a[int_random2][int_random] == 10  && int_random2 == 1){
                    Computersecond = ("Computer second     " + "Diamonds | " + b[int_random0] + " ");
                }else if (a[int_random2][int_random] == 10  && int_random2 == 2){
                    Computersecond = ("Computer second     " + "Hearts   | " + b[int_random0] + " ");
                }else if (a[int_random2][int_random] == 10  && int_random2 == 3){
                    Computersecond = ("Computer second     " + "Spades   | " + b[int_random0] + " ");
                }
                if (Computer < 11 && a[int_random2][int_random] == 1){                                                 //eğerki ilk kart as olmazsa ve 2. çekilen kart as olursa değeri 11.
                    Computersecond0 += 10;
                }
            }
            j++;

        }

        System.out.println ("Userspoint = " + Userspoint);
        System.out.println ("Computers point = " + Computer + "\n") ;
        Scanner myObj = new Scanner(System.in);
        boolean hit = true ;

        boolean maon = true ;



        while (maon == true){
            if( (Userspoint + (Computer + Computersecond0) ) <= 42){

                if ((Userspoint < 21 && ( Computer + Computersecond0) < 21) && (Userspoint != 21 && ( Computer + Computersecond0) != 21)){        //ikiside 21 den küçük ve eşit değil
                    if (Userspoint >= 21){                                                                      //eğerki kullanıcının sayısı 21 yada 21 den büyük olursa hit atamaz.
                        hit = false;
                    }

                    System.out.println("if you want to hit type to  :\"true\"\nif you want to stay type to :\"false\"");
                    hit = myObj.nextBoolean();
                    if (hit == true) {                                           //kullanıcı kart almak istiyor.
                        for (int p = 0; hit == true; p++) {
                            Random rand = new Random();
                            int int_random0 = rand.nextInt(ten_point);
                            int int_random3 = rand.nextInt(upperbound);
                            int int_random4 = rand.nextInt(upperbound2);
                            Userspoint += a[int_random4][int_random3];
                            if (a[int_random4][int_random3] != 10 && int_random4 == 0) {
                                System.out.println("Users " + ca[p] + " " + "Clubs    | " + a[int_random4][int_random3]);       //eğerki kullanıcı her yeni kart aldığında döngü sayesinde kartın kaçıcnı kart olduğunu ekrana basılacak.
                            } else if (a[int_random4][int_random3] != 10 && int_random4 == 1) {
                                System.out.println("Users " + ca[p] + " " + "Diamonds | " + a[int_random4][int_random3]);
                            } else if (a[int_random4][int_random3] != 10 && int_random4 == 2) {
                                System.out.println("Users " + ca[p] + " " + "Hearts   | " + a[int_random4][int_random3]);
                            } else if (a[int_random4][int_random3] != 10 && int_random4 == 3) {
                                System.out.println("Users " + ca[p] + " " + "Spades   | " + a[int_random4][int_random3]);                       //eğerki user or computer +11  <=21 olursa 11 eklenecek 1 yerine.
                            }
                            if (a[int_random4][int_random3] == 10 && int_random4 == 0) {
                                System.out.println("Users " + ca[p] + " " + "Clubs    | " + b[int_random0] + " " + a[int_random4][int_random3]);
                            } else if (a[int_random4][int_random3] == 10 && int_random4 == 1) {
                                System.out.println("Users " + ca[p] + " " + "Diamonds | " + b[int_random0] + " " + a[int_random4][int_random3]);
                            } else if (a[int_random4][int_random3] == 10 && int_random4 == 2) {
                                System.out.println("Users " + ca[p] + " " + "Hearts   | " + b[int_random0] + " " + a[int_random4][int_random3]);
                            } else if (a[int_random4][int_random3] == 10 && int_random4 == 3) {
                                System.out.println("Users " + ca[p] + " " + "Spades   | " + b[int_random0] + " " + a[int_random4][int_random3]);
                            }
                            System.out.println("Userspoint = " + Userspoint);
                            System.out.println("if you want to hit type to  :\"true\"\nif you want to stay type to :\"false\"");
                            hit = myObj.nextBoolean();
                            if (Userspoint < 11 && a[int_random4][int_random3] == 1) {                      //eğerki user in çektiği 1.+2.+.3. kartların toplmaı 11 in altında kalırsa gelen 1 11 olarak değer alır.
                                Userspoint += 10;
                            }
                            if (Userspoint > 21 && (Computer + Computersecond0) < 21) {                          //eğerki kullanıcı 21 den büyük ve biglisayar 21 den küçük olursa.
                                hit = false;
                                comput = false;
                            }
                            if (Userspoint == 21 && ((Computer + Computersecond0) != 21)) {                      //eğerki kullanıcı 21 e eşit olursa ve bilgisayar 21 e eşit olmazsa.
                                hit = false;
                            }
                        }
                        System.out.println(Computersecond + Computersecond0);
                        if (hit == false) {                                                  //computer oynayışı.
                            if (comput == true) {
                                if ((Computer + Computersecond0) < 21) {
                                    if ((Computer + Computersecond0) >= 18) {
                                        comput = false;
                                    }
                                    for (int c = 0; (Computer + Computersecond0) <= 17; c++) {                                                         //burayı ve userin kart çektiği kısmı döngüye koyup istediği kadar çektirmem lazım.
                                        if (Userspoint > (Computer + Computersecond0)) {
                                            Random rand = new Random();
                                            int int_random0 = rand.nextInt(ten_point);
                                            int int_random5 = rand.nextInt(upperbound);
                                            int int_random6 = rand.nextInt(upperbound2);
                                            Computer += a[int_random6][int_random5];

                                            if (a[int_random6][int_random5] != 10 && int_random6 == 0) {
                                                System.out.println("Computer " + ca[c] + " " + "Clubs    | " + a[int_random6][int_random5]);
                                            } else if (a[int_random6][int_random5] != 10 && int_random6 == 1) {
                                                System.out.println("Computer " + ca[c] + " " + "Diamonds | " + a[int_random6][int_random5]);
                                            } else if (a[int_random6][int_random5] != 10 && int_random6 == 2) {
                                                System.out.println("Computer " + ca[c] + " " + "Hearts   | " + a[int_random6][int_random5]);
                                            } else if (a[int_random6][int_random5] != 10 && int_random6 == 3) {
                                                System.out.println("Computer " + ca[c] + " " + "Spades   | " + a[int_random6][int_random5]);                       //eğerki user or computer +11  <=21 olursa 11 eklenecek 1 yerine.
                                            }

                                            if (a[int_random6][int_random5] == 10 && int_random6 == 0) {
                                                System.out.println("Computer " + ca[c] + " " + "Clubs    | " + b[int_random0] + " " + a[int_random6][int_random5]);
                                            } else if (a[int_random6][int_random5] == 10 && int_random6 == 1) {
                                                System.out.println("Computer " + ca[c] + " " + "Diamonds | " + b[int_random0] + " " + a[int_random6][int_random5]);
                                            } else if (a[int_random6][int_random5] == 10 && int_random6 == 2) {
                                                System.out.println("Computer " + ca[c] + " " + "Hearts   | " + b[int_random0] + " " + a[int_random6][int_random5]);
                                            } else if (a[int_random6][int_random5] == 10 && int_random6 == 3) {
                                                System.out.println("Computer " + ca[c] + " " + "Spades   | " + b[int_random0] + " " + a[int_random6][int_random5]);
                                            }
                                            if ((Computer + Computersecond0) < 11 && a[int_random6][int_random5] == 1) {                                                 //eğerki ilk kart as olmazsa ve 2. çekilen kart as olursa değeri 11.
                                                Computer += 10;
                                            }
                                            if ((Computer + Computersecond0) == 21) {
                                                comput = false;
                                            }
                                            if ((Computer + Computersecond0) > 21) {
                                                comput = false;
                                            }

                                        }
                                        comput = false;
                                    }
                                }

                            }
                        }
                    }
                    System.out.println("Userspoint = " + Userspoint);
                    System.out.println("Computer = " + (Computer + Computersecond0));
                    break;

                }
            }
        }
        maon = false;
        comput = false;
        while ((comput == false && maon == false) && (final0 == true)){

            if (Userspoint == 21 && (Computer + Computersecond0) == 21){                        //eşitlik
                System.out.println("Draw.");
                final0 = false;
            }
            if (Userspoint == 21 && ((Computer + Computersecond0) != 21)){                      //eğerki kullanıcı 21 e eşit olursa ve bilgisayar 21 e eşit olmazsa.
                System.out.println("Users won the game..");
                final0 = false;
            }
            if ((Computer + Computersecond0) == 21 && (Userspoint != 21)){                      //eğerki bilgisayar 21 e eşit olursa ve kullanıcı 21 e eşit olmazsa.
                System.out.println("Computer won the game..");
                final0 = false;
            }
            if ((Computer + Computersecond0) > 21 && Userspoint < 21){                          //eğerki bilgisayar 21 den büyük ve kullanıcı 21 den küçük olursa.
                System.out.println("Users won the game..");
                final0 = false;
            }
            if (Userspoint > 21 && (Computer + Computersecond0) < 21){                          //eğerki kullanıcı 21 den büyük ve biglisayar 21 den küçük olursa.
                System.out.println("Computer won the game..");
                final0 = false;
            }
            if ((Userspoint < 21 && (Computer + Computersecond0) < 21 ) && (Computer + Computersecond0) > Userspoint){      //ikiside 21 den küçük.
                System.out.println("Computer won the game..");
                final0 = false;
            }
            if ((Userspoint < 21 && (Computer + Computersecond0) < 21 ) &&Userspoint > (Computer + Computersecond0)){       //ikisde 21 den küçük.
                System.out.println("Users won the game..");
                final0 = false;
            }
        }
    }
}