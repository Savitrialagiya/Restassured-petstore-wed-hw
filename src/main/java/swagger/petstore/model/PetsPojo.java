package swagger.petstore.model;

import java.util.HashMap;
import java.util.List;

public class PetsPojo {

    private Integer id;
    private HashMap<?,?> category;
    private String name;
    private List<String> photoUrls;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public HashMap<?, ?> getCategory() {
        return category;
    }

    public void setCategory(HashMap<?, ?> category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public List<HashMap<?,?>> getTags() {
        return tags;
    }

    public void setTags(List<HashMap<?,?>> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private List<HashMap<?,?>> tags;
    private String status;

    }