import javax.swing.*;

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

        // Kullanıcıdan şifreyi al
        String userPassword = JOptionPane.showInputDialog("Lütfen yeni bir şifre belirleyiniz.");

        // Şifreyi karakter dizisine çevir
        char[] passwordCharacters = userPassword.toCharArray();
        String specialCharacters = "!@#$%^&*()_+-=[]{}|;:'\",.<>?";
        boolean hasSpecialCharacter = false;
        boolean hasSpaceCharacter = false;
        boolean hasNumericCharacter = false;
        String space = " ";
        boolean hasAlphabetCharacter = false;
        boolean hasUppercaseCharacter = false;
        int userResponse;

        // Şifre uzunluğunu kontrol et
        if (userPassword.length() < 8) {
            JOptionPane.showMessageDialog(null, "Şifre en az '8' karakter içermelidir!", "Hata", JOptionPane.ERROR_MESSAGE);
        }
        if (userPassword.length() > 95) {
            JOptionPane.showMessageDialog(null, "Şifre '95' karakterden daha fazla olamaz!", "Hata", JOptionPane.ERROR_MESSAGE);
        }

        // Şifredeki karakterleri kontrol et
        for (char ch : passwordCharacters) {
            if (Character.isLetter(ch)) {
                hasAlphabetCharacter = true;
            }
            if (Character.isDigit(ch)) {
                hasNumericCharacter = true;
            }
            if (Character.isUpperCase(ch)) {
                hasUppercaseCharacter = true;
            }
            if (specialCharacters.contains(String.valueOf(ch))) {
                hasSpecialCharacter = true;
            }
            if (space.contains(String.valueOf(ch))) {
                hasSpaceCharacter = true;
            }
        }

        // Gerekli şifre özelliklerini kontrol et
        if (!hasAlphabetCharacter) {
            JOptionPane.showMessageDialog(null, "Şifre en az 1 harf içermelidir!", "Hata", JOptionPane.ERROR_MESSAGE);
        }
        if (!hasNumericCharacter) {
            JOptionPane.showMessageDialog(null, "Şifre en az 1 sayı içermelidir!", "Hata", JOptionPane.ERROR_MESSAGE);
        }
        if (!hasUppercaseCharacter) {
            JOptionPane.showMessageDialog(null, "Şifre en az 1 büyük harf içermelidir!", "Hata", JOptionPane.ERROR_MESSAGE);
        }
        if (!hasSpecialCharacter) {
            JOptionPane.showMessageDialog(null, "Şifre en az 1 özel karakter içermelidir!", "Hata", JOptionPane.ERROR_MESSAGE);
        }
        if (hasSpaceCharacter) {
            JOptionPane.showMessageDialog(null, "Şifre boşluk içermemelidir!", "Hata", JOptionPane.ERROR_MESSAGE);
        }

        // Şifre koşullarını sağlayan şifreyi kullanıcıya göster ve kaydetme seçeneği sun
        if (hasAlphabetCharacter && hasNumericCharacter && hasUppercaseCharacter && hasSpecialCharacter && !hasSpaceCharacter) {
            userResponse = JOptionPane.showConfirmDialog(null, "Şifreyi kaydetmek ister misiniz?", "Onay", JOptionPane.YES_NO_OPTION);
            if (userResponse == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Yeni şifre: " + userPassword, "Bilgi", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Yeni bir şifre için programı yeniden çalıştırın!", "Onay", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        double e=calculateE();
        JOptionPane.showMessageDialog(null, "e değeri: " + e);
        String param = JOptionPane.showInputDialog("sumFactors parametre giriniz");
        int parameter= Integer.parseInt(param);
        int sum = sumFactors(parameter);
        System.out.println("The sum of factors of " + parameter + " is: " + sum);


        String number= JOptionPane.showInputDialog("ilk sayiyi giriniz");
        String number2= JOptionPane.showInputDialog("ikinci sayiyi giriniz");
        int num1= Integer.parseInt(number);
        int num2= Integer.parseInt(number2);
        if(areFriends(num1,num2)==1){
            System.out.println("Arkadaş sayilar vardir!!");
        }else {
            System.out.println("Düşman sayilar");
        }
        String numb2= JOptionPane.showInputDialog("Sayiyi giriniz");
        int numb= Integer.parseInt(numb2);
        if(isPerfect(numb)){
            JOptionPane.showMessageDialog(null,"Mükemmel sayidir");
        }else {
            JOptionPane.showMessageDialog(null,"Mükemmel sayi değildir");
        }

        for(int i=1000;i<=9999;i++){
            if(isPerfect(i)==true){
                JOptionPane.showMessageDialog(null,i+" sayisi 4 basamaklı tek mükemmel sayidir");
            }
        }


    }}