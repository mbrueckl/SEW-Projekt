package model;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class CollectionHandling {

    private static ArrayList<User> userList = new ArrayList<>();

    public void addUser(String password, String username){
        String hasPas = hashString(password);

        userList.add(new User(hasPas, username));
    }
    
    public User findUser(String username){
        User temp = null;

        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUsername().equals(username)){
                temp = userList.get(i);
                i= userList.size();
            }
        }
        
        return temp;
    }

    public String hashString(String s){

        try {
            // getInstance() method is called with algorithm SHA-512
            MessageDigest md = MessageDigest.getInstance("SHA-512");

            // digest() method is called
            // to calculate message digest of the input string
            // returned as array of byte
            byte[] messageDigest = md.digest(s.getBytes());

            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert message digest into hex value
            String hashtext = no.toString(16);

            // Ensure the hash is padded to 128 characters
            while (hashtext.length() < 128) {
                hashtext = "0" + hashtext;
            }

            // return the HashText
            return hashtext;
        }

        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

}
