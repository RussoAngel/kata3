package kata3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MailReader {
    private final String filePath;

    public MailReader(String filePath) {
        this.filePath = filePath;
    }
    
    public String[] readDomains(){
        ArrayList<String> domainList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            while(line!=null){
                if(line.contains("@"))
                    domainList.add(line.split("@")[1]);
                line = reader.readLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(MailReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return domainList.toArray(new String[domainList.size()]);
    }
}
