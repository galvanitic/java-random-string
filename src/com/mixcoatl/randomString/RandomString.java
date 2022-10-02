package com.mixcoatl.randomString;

public class RandomString {
    String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "0123456789"
            + "abcdefghijklmnopqrstuvxyz";

    public String generateRandomString(int length){
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++){
            int randIndex = (int) (AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(randIndex));
        }
        return sb.toString();
    }
}
