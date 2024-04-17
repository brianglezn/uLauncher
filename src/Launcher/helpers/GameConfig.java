package Launcher.helpers;

public class GameConfig {

    public String title;
    public String description;
    public String[] imagePaths;

    public GameConfig(String title, String description, String[] imagePaths) {
        this.title = title;
        this.description = description;
        this.imagePaths = imagePaths;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String[] getImagePaths() {
        return imagePaths;
    }
}
