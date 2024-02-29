package com.zc.learn.shop.utils.md5;

import lombok.extern.slf4j.Slf4j;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Slf4j
public class MD5Hash {
    public static String md5Java(String message){
        String digest = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(message.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(2 * hash.length);
            for (byte b : hash) {
                sb.append(String.format("%02x", b& 0xff));
            }
            digest = sb.toString();
        }catch (UnsupportedEncodingException ex){
            log.error("不支持这种编码方式", ex);
        } catch (NoSuchAlgorithmException ex){
            log.error("没有这种加密算法", ex);
        }
        return digest;
    }
}
