import java.io.file;
import java.nio.file;

public class Git
{
    
    public static void main(String[]args)
    {
        MessageDigest md = MessageDigest.getInstance("SHA1");
    }

    public static void initRepo() {
        if(file.exists("./git/objects") && file.exists("./git/index")){
            System.out.println("Git Repository already exists");
        }
        else {
            if(!file.exists("./git")) {
                file.mkdirs("./git");
            }

            if(!file.exists("./git/objects")) {
                file.mkdirs("./git/objects");
            }

            if(!file.exists("./git/index")) {
                file.createNewFile("./git/index");
            }
        } // Checks if git dir already exists, if not, then makes it
    }

    public String hashFile(File f) {
        byte[] fContents = Files.readAllBytes(f.getPath());

        return md.digest(fContents).toString();
    } // Reads out files contents into byte array then hashes it with MessageDigest with SHA-1

    /*References
     * http://www.sha1-online.com/sha1-java/
     * https://docs.oracle.com/javase/8/docs/api/java/security/MessageDigest.html
     * https://stackoverflow.com/questions/858980/file-to-byte-in-java
     * https://stackoverflow.com/questions/3849692/whole-text-file-to-a-string-in-java
     * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Files.html#readString(java.nio.file.Path)
     * https://docs.oracle.com/javase/8/docs/api/java/io/File.html
     */
}