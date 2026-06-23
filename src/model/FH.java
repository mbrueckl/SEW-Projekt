package model;
import java.io.*;
import java.util.ArrayList;

public class FH {
    public FH() {
    }
    public void writeFile(String user,String pw){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("..",true))){
            bw.write(user+";"+pw);
            bw.newLine();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void readFile(ArrayList<User> list){
        String line = "";
        try(BufferedReader br = new BufferedReader(new FileReader(""))){
            while ((line = br.readLine()) != null) {
                String[] info = line.split(";");
                list.add(new User(info[0],info[1]));
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
