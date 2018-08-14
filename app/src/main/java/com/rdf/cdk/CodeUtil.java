package com.rdf.cdk;

import android.util.Base64;

import com.rdf.cdk.MD5;
import com.rdf.cdk.jni.Common;
import com.rdf.cdk.util.MemoryCache;

import java.security.Key;
import java.security.Security;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;


public class CodeUtil {
    private static String a() {
        MemoryCache instance = MemoryCache.getInstance();
        String crypt = MD5.crypt("CodeUtil.tzk");
        Common.tzk(crypt);
        String str = (String) instance.getValue(crypt);
        instance.removeValue(crypt);
        return str;
    }

    public static String decodeQrCode(String str) {
        String str2 = "";
        try {
            Security.addProvider(new BouncyCastleProvider());
            byte[] bytes = a().getBytes("utf-8");
            byte[] bytes2 = "1012132405963708".getBytes("utf-8");
            Key secretKeySpec = new SecretKeySpec(bytes, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance.init(2, secretKeySpec, new IvParameterSpec(bytes2));
            return new String(instance.doFinal(Base64.decode(str.getBytes("utf-8"),Base64.DEFAULT)), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    public static String encodeQrCode(String str) {
        String str2 = "";
        try {
            Security.addProvider(new BouncyCastleProvider());
            byte[] bytes = a().getBytes("utf-8");
            byte[] bytes2 = "1012132405963708".getBytes("utf-8");
            Key secretKeySpec = new SecretKeySpec(bytes, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance.init(1, secretKeySpec, new IvParameterSpec(bytes2));
            return new String(Base64.encode(instance.doFinal(str.getBytes("utf-8")),Base64.DEFAULT), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }
}
