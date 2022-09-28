package com.example.dunguntourism;

public class TouristAttraction {
    private String name, description, gmURL, gpURL;
    private int imageID;

    public TouristAttraction(String name, String description, String gmURL, String gpURL, int imageID) {
        this.name = name;
        this.description = description;
        this.gmURL = gmURL;
        this.gpURL = gpURL;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGmURL() {
        return gmURL;
    }

    public void setGmURL(String gmURL) {
        this.gmURL = gmURL;
    }

    public String getGpURL() {
        return gpURL;
    }

    public void setGpURL(String gpURL) {
        this.gpURL = gpURL;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
