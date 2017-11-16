package i5.las2peer.services.uatTestImage;

import java.util.*;
import org.json.simple.*;

public class classes {

    class imageMusic {

    public imageMusic() {}
    
    private String imageName;

    public void setimageName(String setValue) {
        this.imageName = setValue;
    }

    public String getimageName() {
        return this.imageName;
    }
    private String imageUrl;

    public void setimageUrl(String setValue) {
        this.imageUrl = setValue;
    }

    public String getimageUrl() {
        return this.imageUrl;
    }

    public JSONObject toJSON() {

        JSONObject jo = new JSONObject();
        jo.put("imageName", this.imageName); 
        jo.put("imageUrl", this.imageUrl); 

        return jo;
    }

}
    class image {

    public image() {}
    
    private String imageName;

    public void setimageName(String setValue) {
        this.imageName = setValue;
    }

    public String getimageName() {
        return this.imageName;
    }
    private String imageUrl;

    public void setimageUrl(String setValue) {
        this.imageUrl = setValue;
    }

    public String getimageUrl() {
        return this.imageUrl;
    }

    public JSONObject toJSON() {

        JSONObject jo = new JSONObject();
        jo.put("imageName", this.imageName); 
        jo.put("imageUrl", this.imageUrl); 

        return jo;
    }

}

    
}
