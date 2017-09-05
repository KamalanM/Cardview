package com.example.priya.cardview;


public class Images {

    String imageUrl;
    String description;

    public Images(String description,String imageUrl){
        this.imageUrl=imageUrl;
        this.description=description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setIamgeUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
