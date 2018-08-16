package com.rdf.cdk;

import java.security.MessageDigest;

public class MD5 {

    public static String crypt(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String to encript cannot be null or zero length");
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            for (int i = 0; i < digest.length; i++) {
                if ((digest[i] & 255) < 16) {
                    stringBuffer.append("0" + Integer.toHexString(digest[i] & 255));
                } else {
                    stringBuffer.append(Integer.toHexString(digest[i] & 255));
                }
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }

}
