import java.util.*;

public class RunRamblersBB {
    public static void main(String[] arg) {

        TerrainMap terrainMap = new TerrainMap("diablo.pgm");

        Coords goalCoords = new Coords(90, 200);
        RamblersSearch searcher = new RamblersSearch(terrainMap, goalCoords, "N/A");

        Coords initCoords = new Coords(175, 125);
        int initHeight = terrainMap.getTmap()[initCoords.gety()][initCoords.getx()];
        RamblersState initState = new RamblersState(initCoords, initHeight, 0, 0);

        String res_bb = "" + searcher.runSearchE(initState, "branchAndBound");
        System.out.println(res_bb);
    }
}