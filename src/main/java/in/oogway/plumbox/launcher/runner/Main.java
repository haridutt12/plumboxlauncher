package in.oogway.plumbox.launcher.runner;


import in.oogway.plumbox.launcher.library.ingestor.Ingestor;

import java.io.IOException;

/*
*   @author talina06 on 2/7/18
*/
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IOException,
            InstantiationException, IllegalAccessException {
        String ingestorFileName = "i01";
        /* The below property to be passed as a paramter to the jar. -Dredis_server_address=localhost.
         * If not to be done, uncomment below line.
         */
        // System.setProperty("redis_server_address", "localhost");
        Ingestor ingestorObj = new Ingestor(ingestorFileName);
        ingestorObj.execute();
    }
}