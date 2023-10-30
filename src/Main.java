import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static double calculateE() {
        double e = 1;
        double term = 1;
        for (int i = 1; i <= 10; i++) {
            term /= i;
            e += term;
        }
        return e;
    }
    public static int sumFactors(int num){
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum;
    }

    public static int areFriends(int num1, int num2){
        int state=0;
        if(sumFactors(num1)==num2&sumFactors(num2)==num1){
            state=1;
        }else{
            state=0;
        }
        return state;
    }
    public static boolean isPerfect(int numb){
        boolean cor=true;
        if(sumFactors(numb)!=numb){
            cor=false;
        }
        return cor;
    }
    public static void main(String[] args) {
        double e=calculateE();
        System.out.println(e);
        int num = 24;
        int sum = sumFactors(num);
        System.out.println("The sum of factors of " + num + " is: " + sum);


        String number= JOptionPane.showInputDialog("ilk sayiyi giriniz");
        String number2= JOptionPane.showInputDialog("ikinci sayiyi giriniz");
        int num1= Integer.parseInt(number);
        int num2= Integer.parseInt(number2);
        if(areFriends(num1,num2)==1){
            System.out.println("Arkadaş sayilar vardir!!");
        }
        String numb2= JOptionPane.showInputDialog("Sayiyi giriniz");
        int numb= Integer.parseInt(numb2);
        System.out.println(isPerfect(numb));

        for(int i=1000;i<=9999;i++){
            if(isPerfect(i)==true){
                System.out.println(i);
            }
        }


    }}