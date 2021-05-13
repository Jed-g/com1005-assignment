import java.util.*;

public class RamblersSearch extends Search {

    private TerrainMap map;
    private Coords goalCoords;
    private String estimationMethod;

    public TerrainMap getMap() {
        return map;
    }

    public Coords getGoalCoords() {
        return goalCoords;
    }

    public String getEstimationMethod() {
        return estimationMethod;
    }

    public RamblersSearch(TerrainMap map, Coords goalCoords, String estimationMethod) {
        this.map = map;
        this.goalCoords = goalCoords;
        this.estimationMethod = estimationMethod;
    }
}