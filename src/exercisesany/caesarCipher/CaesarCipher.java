package exercisesany.caesarCipher;

public class CaesarCipher {

    static String rotate1(String data, int key) {
        String plan ="abcdefghijklmnopqrstuvwxyz";
        String str = "";
        String cipher=plan.substring(key)+plan.substring(0,key);
        for (int i = 0; i < data.length(); i++) {
            str+=cipher.charAt(plan.indexOf(data.charAt(i)));
        }
        return str;
    }

    static String rotate(String data, int key) {
        String str = "";
        for (int i = 0; i < data.length(); i++) {
            char temp = (char) (data.charAt(i) + key);
            if (temp > 'z')
                str += (char) (data.charAt(i) - (26 - key));
            else str += (char) (data.charAt(i) + key);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println("Criptare prima metoda: ");
        System.out.println(rotate("testz", 10));

        System.out.println("Criptare a doua  metoda: ");
        System.out.println(rotate1("testz", 10));


    }
}