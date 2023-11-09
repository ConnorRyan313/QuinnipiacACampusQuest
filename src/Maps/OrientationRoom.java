package Maps;

import java.util.ArrayList;

import Level.Map;
import Level.NPC;
import Level.Trigger;
import NPCs.Judy;
import NPCs.IrishKid;
import NPCs.EmoBoy;
import Scripts.CCEClassroom.ChangeMapScript;
import Scripts.OrientationRoom.EmoBoyScript;
import Scripts.OrientationRoom.JudyScript;
import Scripts.OrientationRoom.IrishKidScript;
import Scripts.TestMap.LostBallScript;
import Tilesets.CommonTileset;
import Utils.Point;

public class OrientationRoom extends Map{
    public OrientationRoom() {
        super("OrientationRoom.txt", new CommonTileset());
        this.playerStartPosition = getMapTile(15, 8).getLocation(); 

        this.mapInt = 2;
        this.idSwitch = 2;
    }
    
    @Override
    public ArrayList<NPC> loadNPCs() {
        ArrayList<NPC> npcs = new ArrayList<>();

        Judy judy = new Judy(0, getMapTile(16, 4).getLocation().subtractY(40));
        judy.setInteractScript(new JudyScript());
        npcs.add(judy);

        EmoBoy emoboy = new EmoBoy(0, getMapTile(5, 9).getLocation().subtractY(40));
        emoboy.setInteractScript(new EmoBoyScript());
        npcs.add(emoboy);

        IrishKid irishkid = new IrishKid(0, getMapTile(10, 8).getLocation().subtractY(40));
        irishkid.setInteractScript(new IrishKidScript());
        npcs.add(irishkid);

        return npcs;

    }
     public void loadScripts() {
        getMapTile(1, 2).setInteractScript(new ChangeMapScript(0));

        getMapTile(2, 2).setInteractScript(new ChangeMapScript(0));

        getMapTile(3, 2).setInteractScript(new ChangeMapScript(0));

        getMapTile(4, 2).setInteractScript(new ChangeMapScript(0));

        getMapTile(31, 2).setInteractScript(new ChangeMapScript(0));

        getMapTile(30, 2).setInteractScript(new ChangeMapScript(0));

        getMapTile(29, 2).setInteractScript(new ChangeMapScript(0));

        getMapTile(28, 2).setInteractScript(new ChangeMapScript(0));

     }
     @Override
    public ArrayList<Trigger> loadTriggers() {
        ArrayList<Trigger> triggers = new ArrayList<>();
        triggers.add(new Trigger((int)getMapTile(15, 8).getX(), (int)getMapTile(15, 8).getY(), 45, 45, new JudyScript(), "hasStartedGame"));
        return triggers;
    }
    
}
