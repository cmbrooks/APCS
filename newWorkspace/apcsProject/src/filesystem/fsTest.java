import java.util.HashSet;

public class fsTest {

    public static void main (String[] args) {

        System.out.println("-= Testing GGeorgeFS =-");
        GGeorgeFS fs1 = new GGeorgeFS(7);
        fs1.create("testFile1.txt");
        fs1.create("testFile2.csv");
        fs1.create("testFile3.txt");
        fs1.erase("testFile2.csv");
        fs1.dir();

        System.out.println();

        System.out.println("-= Testing cmbrooksFS =-");
        CmbrooksFS fs2 = new CmbrooksFS(7);
        fs2.create("testFile1.txt");
        fs2.create("testFile2.csv");
        fs2.create("testFile3.txt");
        fs2.erase("testFile2.csv");
        fs2.dir();

    }

}

@SuppressWarnings("hiding")
class GGeorgeFS{
    /**
    *
    */
    HashSet<String> fs;
    GGeorgeFS (int size){
        fs= new HashSet<String>(size);
    }

    public Boolean create(String s){
        return !fs.add(s);
    }

    public Boolean erase(String s){
        return !fs.remove(s);
    }

    @SuppressWarnings("unchecked")
    public String[] dir(){
        String[] hi=new String[fs.size()];
        return fs.toArray(hi);
    }
}

class CmbrooksFS {
    HashSet<String> fs;
    public CmbrooksFS (int size) {
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
