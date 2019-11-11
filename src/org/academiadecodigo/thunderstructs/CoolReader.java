package org.academiadecodigo.thunderstructs;

import java.io.*;
import java.net.Socket;

public class CoolReader {

    private BufferedReader bReader;

    public CoolReader (Socket socket) {

        try {

            this.bReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public CoolReader (String filePath) {

        try {

            this.bReader = new BufferedReader(new FileReader(filePath));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void readLine () {

        try {

            bReader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void close () {

        try {

            bReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
