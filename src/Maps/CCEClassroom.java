package Maps;

import Level.Map;
import Tilesets.CommonTileset;
import Utils.Point;

public class CCEClassroom extends Map{
    public CCEClassroom() {
        super("CCEClassroom.txt", new CommonTileset());
        this.playerStartPosition = getMapTile(1, 2).getLocation();
    }
}
