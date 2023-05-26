package tri;

public class TestConversion {
    public static void main(String[] args) {
        String value = "2A";
        int departement = Integer.parseInt(value, 16); // permet de transformer de l'hexadecimal en int
        System.out.println(departement);
    }
}
