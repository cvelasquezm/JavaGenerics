package palindromo;

public class Main {

        public static void main(String[] args) {
                String text = "amigonogima";

                if (isPalindromo(text)) {
                        System.out.println("Es palindromo");
                } else {
                        System.out.println("No es palindromo");
                }
        }

        public static boolean isPalindromo(String text) {
                final char[] chars = text.toCharArray();
                for (int i = 0; i < chars.length/2 ; i++) {
                        if (chars[i] != chars[chars.length - (i + 1)]){
                                return false;
                        }
                }

                return true;
        }
}
