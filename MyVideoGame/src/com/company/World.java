package com.company;

public class World {

    // Enumerator Variables
    enum WorldName{Prontera, Izlude, Grandell}
    enum WorldType{normal, ice, dessert};

    WorldName worldName;
    WorldType worldType;

    // Constructor
    public World (WorldName _worldName, WorldType _worldType) {
        this.worldName = _worldName;
        this.worldType = _worldType;
    }

    // Setter and Getter

    public WorldName getWorldName() {
        return this.worldName;
    }

    public void setWorldName(WorldName _worldName) {
        this.worldName = _worldName;
    }
}
