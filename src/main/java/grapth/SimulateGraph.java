package grapth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class SimulateGraph {

    public static List<Pair<Integer,Integer>> generateTestCase() {
        List<Pair<Integer,Integer>> edges = new ArrayList<>();
        Set<Pair<Integer, Integer>> set = new HashSet<>();

        Random random = new Random();

        for(int i = 0; i < 1000; i++){
            int a = random.nextInt(100) + 1;
            int b = random.nextInt(100) + 1;
            if(a != b){
                if(a > b){
                    int tmp = a^b;
                    a = b;
                    b = tmp^a;
                }

                set.add(new Pair<>(a,b));
            }
        }

        return new ArrayList<>(set);
    }

}
