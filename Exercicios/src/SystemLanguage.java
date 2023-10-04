public class SystemLanguage {
    public static void main(String[] args) {
        String lingua = System.getProperty("user.language");
        String pais = System.getProperty("user.country");
        System.out.println("A língua do sistema é "+ lingua +"-"+ pais);
    }

}
