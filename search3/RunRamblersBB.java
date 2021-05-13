import java.util.*;

public class RunRamblersBB {
    public static void main(String[] arg) {

        TerrainMap terrainMap = new TerrainMap("tmc.pgm");

        Coords goalCoords = new Coords(10, 10);
        RamblersSearch searcher = new RamblersSearch(terrainMap, goalCoords, "estimation_method...");

        Coords initCoords = new Coords(0, 0);
        int initHeight = terrainMap.getTmap()[initCoords.gety()][initCoords.getx()];
        RamblersState initState = new RamblersState(initCoords, initHeight, 0, 0);

        String res_bb = "" + searcher.runSearchE(initState, "branchAndBound");
        System.out.println(res_bb);
    }
}