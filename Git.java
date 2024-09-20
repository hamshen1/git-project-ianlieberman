import java.io.file;
import java.nio.file;

public class Git
{
    public static void main(String[]args)
    {
        
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
}