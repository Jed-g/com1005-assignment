import java.util.*;

public class RunRamblersAstart {
    public static void main(String[] arg) {

        TerrainMap terrainMap = new TerrainMap("diablo.pgm");

        Coords goalCoords = new Coords(90, 200);
        String[] estimationMethods = {"euclidean", "heightDiff", "manhattan", "superAdvanced"};
        RamblersSearch searcher1 = new RamblersSearch(terrainMap, goalCoords, estimationMethods[0]);
        RamblersSearch searcher2 = new RamblersSearch(terrainMap, goalCoords, estimationMethods[1]);
        RamblersSearch searcher3 = new RamblersSearch(terrainMap, goalCoords, estimationMethods[2]);
        RamblersSearch searcher4 = new RamblersSearch(terrainMap, goalCoords, estimationMethods[3]);

        Coords initCoords = new Coords(175, 125);
        int initHeight = terrainMap.getTmap()[initCoords.gety()][initCoords.getx()];
        RamblersState initState = new RamblersState(initCoords, initHeight, 0, 0);

        String res_astar1 = "" + searcher1.runSearchE(initState, "astar");
        System.out.println(res_astar1);
        String res_astar2 = "" + searcher2.runSearchE(initState, "astar");
        System.out.println(res_astar2);
        String res_astar3 = "" + searcher3.runSearchE(initState, "astar");
        System.out.println(res_astar3);
        String res_astar4 = "" + searcher4.runSearchE(initState, "astar");
        System.out.println(res_astar4);
    }
}