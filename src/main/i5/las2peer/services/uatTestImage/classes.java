package i5.las2peer.services.uatTestImage;

import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.ParseException;

public class classes {

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
    private int imageId;

    public void setimageId(int setValue) {
        this.imageId = setValue;
    }

    public int getimageId() {
        return this.imageId;
    }

    public JSONObject toJSON() {

        JSONObject jo = new JSONObject();
        jo.put("imageName", this.imageName); 
        jo.put("imageUrl", this.imageUrl); 
        jo.put("imageId", this.imageId); 

        return jo;
    }

    public void fromJson(String jsonString) throws ParseException {
        JSONObject jsonObject = (JSONObject) JSONValue.parseWithException(jsonString);
        this.imageId = ((Long)jsonObject.get("imageId")).intValue();
        this.imageName = (String) jsonObject.get("imageName");
        this.imageUrl = (String) jsonObject.get("imageUrl");
    }

}

    
}
