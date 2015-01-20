import java.util.*;

class FS {
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

public class cmbrooksFS {
    public static void main (String[] args) {
        System.out.println("Main entered");
        FS myFS = new FS(10);
        myFS.create("file1.txt");
        myFS.create("file2.txt");
        myFS.create("file1.txt");
        myFS.create("file3.txt");
        myFS.erase("file2.txt");
        myFS.dir();
    }
}
