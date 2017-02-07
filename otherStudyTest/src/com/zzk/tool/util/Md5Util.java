/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.tool.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.*;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Random;

/**
 * md5加密解密代码
 *
 * @author zhouzongkun
 * @version : IdleDevelopProject, v 0.1 2016/7/12 15:59 zhouzongkun Exp $$
 */
public class Md5Util {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Md5Util md=new Md5Util();
        String ss=md.enCodeStringByKey("123456");

        String mm=md.deCodeStringBykey("+ov77OHNKrodfOsO9wUTzQ==");
        System.out.println("------"+mm);
    }
    /**
     * 解密
     * @param key 密钥
     * @param str 密文
     * @return
     */
    public String deCodeStringBykey(String key,String str){
        String dest = str.replaceAll("\r\n", "");

        BASE64Decoder decoder = new BASE64Decoder();
        String dest1 = "";
        byte[] b = null;
        try {
            b = decoder.decodeBuffer(dest);
            String src = new String(b, "ISO-8859-1");
            dest1 =deCryptoDES(key, src);
        } catch (IOException ex) {
            dest1 = "";
        }
        return dest1;
    }
    /**
     * 解密
     * @param str
     * @param str
     * @return
     */
    public String deCodeStringBykey(String str){
        String dest = str.replaceAll("\r\n", "");

        BASE64Decoder decoder = new BASE64Decoder();
        String dest1 = "";
        byte[] b = null;
        try {
            b = decoder.decodeBuffer(dest);
            String src = new String(b, "ISO-8859-1");
            dest1 =deCryptoDES(getKey(), src);
        } catch (IOException ex) {
            dest1 = "";
        }
        return dest1;
    }
    /**
     * 加密
     * @param key 密钥
     * @param str 原始密码
     * @return
     */
    public String enCodeStringByKey(String key,String str){
        String s2 = cryptoDES(key,str);

        byte[] sorData = null;
        String dest = "";
        try {
            sorData = s2.getBytes("ISO-8859-1");
            BASE64Encoder be = new BASE64Encoder();
            dest = be.encode(sorData);
            dest = dest.replaceAll("\r\n", "");
        } catch (UnsupportedEncodingException ex1) {
            dest = "";
        }
        return dest;
    }
    /**
     * 加密
     * @param str
     * @param str
     * @return
     */
    public String enCodeStringByKey(String str){
        String s2 = cryptoDES(getKey(),str);

        byte[] sorData = null;
        String dest = "";
        try {
            sorData = s2.getBytes("ISO-8859-1");
            BASE64Encoder be = new BASE64Encoder();
            dest = be.encode(sorData);
            dest = dest.replaceAll("\r\n", "");
        } catch (UnsupportedEncodingException ex1) {
            dest = "";
        }
        return dest;
    }
    public String getKey(){
        /*InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("md5Key.properties");
        Properties p = new Properties();
        try {
            p.load(inputStream);
        } catch (IOException e1) {
        }*/
        return "qccr";
    }
    /**
     * 解密字符串
     * @param key String key字符串 , 只能为非汉字字符串
     * @param data String 要解密的字符串
     * @return String　成功，返回，解密后的字符串，失败，返回null
     */
    public String deCryptoDES(String key, String data) {
        //参数不正确，返回null
        if (data == null || key == null) {
            return null;
        }
        // 下面的过程为
        // String >> CharBuffer >> (编码处理)>> ByteBuffer >> byte[]数组 >> (加/解密处理) >> byte[]数组 >>(解码处理) >>CharBuffer>>char[]数组>>String
        // 编码
        byte[] datab = EncodeUtils.encode(data, "ISO-8859-1");
        if (datab == null) {
            return null;
        }
        // 解密
        byte[] datad = this.deCryptoDES(key, datab);
        if (datad == null) {
            return null;
        }
        // 解码
        String datae = DecodeUtils.decode(datad, "ISO-8859-1");
        return datae;
    }
    /**
     * 加密字符串
     * @param key String key字符串 , 只能为非汉字字符串
     * @param data String 要加密的字符串，只能为非汉字字符串
     * @return String 成功，返回，加密后的字符串，失败，返回null
     */
    public String cryptoDES(String key, String data) {
        if (key == null || data == null) {
            return null;
        }
        // 下面的过程为
        // String >> CharBuffer >> (编码处理)>> ByteBuffer >> byte[]数组 >> (加/解密处理) >> byte[]数组 >>(解码处理) >>CharBuffer>>char[]数组>>String
        // 编码
        byte[] datab = EncodeUtils.encode(data, "ISO-8859-1");
        if (datab == null) {
            return null;
        }
        byte[] datad = this.cryptoDES(key, datab);
        if (datad == null) {
            return null;
        }
        // 解码
        String datae = DecodeUtils.decode(datad, "ISO-8859-1");
        return datae;
    }

    /**
     * 加密byte数组
     * @param key String
     * @param data byte[]
     * @return byte[]
     */
    public byte[] cryptoDES(String key, byte[] data) {
        // 参数不正确，返回 null
        if (data == null || key == null) {
            return null;
        }
        char[] passwd = key.toCharArray();

        PBEKeySpec pbks = new PBEKeySpec(passwd);
        try {
            //获取加密key
            SecretKeyFactory kf = SecretKeyFactory.getInstance(
                    "PBEWithMD5AndDES");
            SecretKey k = kf.generateSecret(pbks);
            //产生一个随机盐，为了使相同的密码，每个产生不同的加密串
            byte[] salt = new byte[8];
            Random r = new Random();
            r.nextBytes(salt);
            Cipher cp = null;
            //取加密算法
            cp = Cipher.getInstance("PBEWithMD5AndDES");
            PBEParameterSpec ps = new PBEParameterSpec(salt, 1000);
            cp.init(Cipher.ENCRYPT_MODE, k, ps);
            byte[] ctext = null;
            //加密
            ctext = cp.doFinal(data);
            //将随机盐放入加字串中保存，解密需要此随机盐
            byte[] cdata = new byte[salt.length + ctext.length];
            System.arraycopy(salt, 0, cdata, 0, salt.length);
            System.arraycopy(ctext, 0, cdata, salt.length, ctext.length);
            return cdata;
        } catch (NoSuchPaddingException ex2) {
            ex2.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException ex2) {
            ex2.printStackTrace();
            return null;
        } catch (InvalidKeySpecException ex1) {
            ex1.printStackTrace();
            return null;
        } catch (InvalidAlgorithmParameterException ex3) {
            ex3.printStackTrace();
            return null;
        } catch (InvalidKeyException ex3) {
            ex3.printStackTrace();
            return null;
        } catch (BadPaddingException ex) {
            ex.printStackTrace();
            return null;
        } catch (IllegalBlockSizeException ex) {
            ex.printStackTrace();
            return null;
        } catch (IllegalStateException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    /**
     * 解密byte数组
     * @param key String
     * @param data byte[]
     * @return byte[]
     */
    public byte[] deCryptoDES(String key, byte[] data) {
        //参数不正确，返回null
        if (data == null || key == null) {
            return null;
        }
        char[] passwd = key.toCharArray();
        PBEKeySpec pbks = new PBEKeySpec(passwd);
        try {
            //取解密key
            SecretKeyFactory kf = SecretKeyFactory.getInstance(
                    "PBEWithMD5AndDES");
            SecretKey k = null;
            k = kf.generateSecret(pbks);
            //从加密串中取随机盐
            byte[] salt = new byte[8];
            byte[] cdata = new byte[data.length - salt.length];
            System.arraycopy(data, 0, salt, 0, salt.length);
            System.arraycopy(data, salt.length, cdata, 0, cdata.length);
            //取解密算法
            Cipher cp = null;
            cp = Cipher.getInstance("PBEWithMD5AndDES");
            PBEParameterSpec ps = new PBEParameterSpec(salt, 1000);
            cp.init(Cipher.DECRYPT_MODE, k, ps);
            byte[] ddata = null;
            //解密
            ddata = cp.doFinal(cdata);
            return ddata;
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
            return null;
        } catch (InvalidKeySpecException ex1) {
            ex1.printStackTrace();
            return null;
        } catch (NoSuchPaddingException ex2) {
            ex2.printStackTrace();
            return null;
        } catch (InvalidAlgorithmParameterException ex3) {
            ex3.printStackTrace();
            return null;
        } catch (InvalidKeyException ex3) {
            ex3.printStackTrace();
            return null;
        } catch (BadPaddingException ex4) {
            ex4.printStackTrace();
            return null;
        } catch (IllegalBlockSizeException ex4) {
            ex4.printStackTrace();
            return null;
        } catch (IllegalStateException ex4) {
            ex4.printStackTrace();
            return null;
        }
    }

}
