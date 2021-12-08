import java.util.HashMap;
import java.util.Map;

public class Service {
    public Map<String,Integer> coinHandle(int balance) {
        Map<String, Integer> money = new HashMap<String, Integer>();

        if (balance % 200000 == 0) {
            money.put("Total 200k", balance / 200000);
        } else {
            int temp100k = balance % 200000;

            if (temp100k % 100000 == 0) {
                money.put("Total 200k:", balance / 200000);
                money.put("Total 100k:", temp100k / 100000);
            } else {
                int temp50k = temp100k % 100000;

                if (temp50k % 50000 == 0) {
                    money.put("Total 200k:", balance / 200000);
                    money.put("Total 100k:", temp100k / 100000);
                    money.put("Total 50k:", temp50k / 50000);
                } else {
                    int temp20k = temp50k % 50000;

                    if (temp20k % 20000 == 0) {
                        money.put("Total 200k:", balance / 200000);
                        money.put("Total 100k:", temp100k / 100000);
                        money.put("Total 50k:", temp50k / 50000);
                        money.put("Total 20k:", temp20k / 20000);
                    } else {
                        int temp10k = temp20k % 20000;

                        if (temp10k % 10000 == 0) {
                            money.put("Total 200k:", balance / 200000);
                            money.put("Total 100k:", temp100k / 100000);
                            money.put("Total 50k:", temp50k / 50000);
                            money.put("Total 20k:", temp20k / 20000);
                            money.put("Total 10k:", temp10k / 10000);
                        }
                    }
                }
            }
        }
        return money;
    }
}
