package OOD.Q11_FileSystem;

/**
 * Each file can be created as an Object and delete by removing it from the directory list.
 */
public class File {
    private int size;
    private String type;
    private String name;
    private Directory directory;

    public File(String name, int size, String type, Directory directory) {
        this.size = size;
        this.type = type;
        this.name = name;
        this.directory = directory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Directory getDirectory() {
        return directory;
    }

    public File delete(){
        return directory.deleteFile(name);
    }
}
