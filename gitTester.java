import java.io.file;
import java.nio.file;


public class gitTester {
    public static void main(String[]args)
    {
        initRepoTester();




    }

    public boolean initRepoTester() {
        File gitDir = new File("./git");
        
        Git.initRepo;

        if(file.exists("./git/objects") && file.exists("./git/index")) {
            for(File f:getDir.listFiles()) {
                delete(f);
                System.out.println("initRepo worked");
                return true;
            }
        }
        System.out.println("initRepo failed");
        return false;
    } 
}
