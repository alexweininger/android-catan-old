package edu.up.weininge.testgui;

/** Robber class
 * @author Alex Weininger, Andrew Lang, Daniel Borg, Niraj Mali
 * @version October 10th, 2018
 * https://github.com/alexweininger/game-state
 *
 * contains the position of the robber as well as methods to get and set position
 *
 **/
public class Robber {

    private int hexagonId; // hexagon where the robber is located

    /** Robber constructor
     * @param currentHexagonId - where the robber is currently
     */
    public Robber(int currentHexagonId) {
        this.hexagonId = currentHexagonId;
    }

    //deep copy constructor
    public Robber(Robber robber){
        this.hexagonId = robber.hexagonId;
    }

    //sets the new position of the Robber to be moved
    public void setHexagonId(int newHexagonId) {
        this.hexagonId = newHexagonId;
    }

    //returns the current location of the Robber
    public int getHexagonId() {
        return hexagonId;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append("The robber is currently at: ");
        sb.append(hexagonId);

        return sb.toString();
    } // end robber toString
}
