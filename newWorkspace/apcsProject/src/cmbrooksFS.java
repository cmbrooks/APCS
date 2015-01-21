import java.util.*;

class cmbrooksFS {
    Set<String> fs;
    public FS (int size) {
        System.out.println("FS created");
        fs = new HashSet<String>(size);
    }

    public boolean create (String filename) {
        if (!fs.contains(filename)) {
            /*File does not exist, will be created*/
            System.out.println("File (" + filename + ") added");
            fs.add(filename);
            return false;
        } else {
            /*File already exists*/
            return true;
        }
    }

    public boolean erase (String filename) {
        if (fs.contains(filename)) {
            /*File exists, will be removed*/
            fs.remove(filename);
            return false;
        } else {
            /*File does not exist*/
            return true;
        }
    }

    public void dir () {
        System.out.println("Current Filesystem: ");
        System.out.println("##########");
        for (String filename : fs) {
            System.out.println(filename);
        }
        System.out.println("##########");
    }

}
