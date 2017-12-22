package OOD.Q11_FileSystem;

import java.util.*;

/**
 * Created by Nicolas on 22/12/2017.
 */
public class Directory {
    private Map<String, File> files = new HashMap<>();
    private Map<String, Directory> directories = new HashMap<>();
    private String name;

    public Directory(String name) {
        this.name = name;
    }

    public File createFile(String name, int size, String type) {
        File file = new File(name, size, type, this);
        return files.put(name, file);
    }

    public File deleteFile(String name) {
        return files.remove(name);
    }

    public Directory addSubfolder(String name){
        return directories.put(name, new Directory(name));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, File> getFiles() {
        return files;
    }

    public Map<String, Directory> getSubDirectories() {
        return directories;
    }

}
