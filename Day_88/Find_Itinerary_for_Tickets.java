package Day_88;

import java.util.*;

public class Find_Itinerary_for_Tickets {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        solution3 s3 = new solution3();
        String ans = s3.find_itinerary(map);
        System.out.print(ans);
    }
}

class solution3 {
    public String find_itinerary(HashMap<String, String> map) {
        HashSet<String> set = new HashSet<>();
        for (Map.Entry<String, String> e : map.entrySet()) {
            set.add(e.getValue());
        }

        String Starting_point = "";

        for (Map.Entry<String, String> e : map.entrySet()) {
            if (!set.contains(e.getKey())) {
                Starting_point = e.getKey();
                break;
            }
        }

        StringBuilder sb = new StringBuilder("");
        sb.append(Starting_point);
        sb.append("->");

        while (map.containsKey(Starting_point)) {
            String ans = map.get(Starting_point);
            sb.append(ans);
            Starting_point = ans;
            if (map.containsKey(Starting_point)) {
                sb.append("->");
            }
        }
        return sb.toString();
    }
}
