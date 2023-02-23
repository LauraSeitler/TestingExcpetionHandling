import javax.security.auth.login.AccountException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Account> accountMap = new HashMap<>();

        Account account = new Account ( " laura", " canti 11", 91928398, 1635122, Hold.FRAUD);
        Account account = new Account ( " nico", " canti 11", 91968798, 232842, Hold.FRAUD);
        Account account = new Account ( " laura", " canti 11", 1768398, 183442, Hold.FRAUD);
        switch (account.getHold()){
            case NONE -> System.out.println(" La cuenta esta activa");
            case FRAUD -> System.out.println(" cuenta bloqueada por fraude");
         /*
            Country india = new Country("India", "New Delhi", 1387297452, "Ram Nath Kovind");
            Country botswana = new Country("Botswana", "Gaborone", 2351627, "Mokgweetsi Masisi");
            Country japan = new Country("Japan", "Tokyo", 126476461, "Shinzō Abe");

            accountMap.put("laura", 1635122);
            countryMap.put("Japan", japan);
            countryMap.put("Botswana", botswana);

            System.out.println(countryMap.get("Japan").getCapital());



//Map<long. Account> account = new HashMap<>();
//account.put(Long.valueOf(1), new Account("saving", "c1", new BigDecimal (1000), 1l));

//account.getAccountNumber()
        }
    }

}