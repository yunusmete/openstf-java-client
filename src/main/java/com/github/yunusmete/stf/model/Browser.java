
package com.github.yunusmete.stf.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Browser {

   @SerializedName("apps")
   @Expose
   private List<App> apps = new ArrayList<App>();
   @SerializedName("selected")
   @Expose
   private boolean   selected;

   /**
    * @return The apps
    */
   public List<App> getApps() {
      return apps;
   }

   /**
    * @param apps
    *           The apps
    */
   public void setApps(List<App> apps) {
      this.apps = apps;
   }

   /**
    * @return The selected
    */
   public boolean isSelected() {
      return selected;
   }

   /**
    * @param selected
    *           The selected
    */
   public void setSelected(boolean selected) {
      this.selected = selected;
   }

   @Override
   public String toString() {
      return "Browser{" + "apps=" + apps + ", selected=" + selected + '}';
   }
}
