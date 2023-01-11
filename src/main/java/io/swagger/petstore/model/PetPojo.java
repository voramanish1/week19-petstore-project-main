package io.swagger.petstore.model;

import java.util.ArrayList;

public class PetPojo {
    private int id;
    private CategoryData category;
    private String name;
    private ArrayList<String> photoUrls= new ArrayList();
    private ArrayList<TagData> tags = new ArrayList<>();
    private String status;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(ArrayList<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public ArrayList<TagData> getTags() {
        return tags;
    }

    public void setTags(ArrayList<TagData> tags) {
        this.tags = tags;
    }

    public CategoryData getCategory() {
        return category;
    }

    public void setCategory(CategoryData category) {
        this.category = category;
    }

    public static class CategoryData{
        private int id;
        private String name;

        public CategoryData(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class TagData{

        private int tagId;

        private String tagName;

        public TagData(int tagId, String tagName) {
            this.tagId = tagId;
            this.tagName = tagName;
        }

        public int getTagId() {
            return tagId;
        }

        public void setTagId(int tagId) {
            this.tagId = tagId;
        }

        public String getTagName() {
            return tagName;
        }

        public void setTagName(String tagName) {
            this.tagName = tagName;
        }
    }


}
