//package Tutorial;
 
import java.applet.Applet;

import com.sun.j3d.utils.universe.SimpleUniverse;
 
public class SimpleWindow extends Applet{
  private static final long serialVersionUID = -524595259622767512L;
 
  public SimpleWindow(){
    //Universe is a space where we can place our object
    SimpleUniverse universe = new SimpleUniverse();
 
    //Make the viewing platform with nominal setting
    universe.getViewingPlatform().setNominalViewingTransform();
  }
}