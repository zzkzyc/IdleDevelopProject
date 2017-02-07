package com.zzk.tool.util;


import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/**
 * 编码工具类
 * @version 1.0
 */
public class EncodeUtils {
    /**
     * 根据指定的字符集，将字符串编码成 byte数组
     * @param data String 字符串
     * @param charsetName String 字符集名
     * @return byte[]
     */
    public static byte[] encode(String data, String charsetName) {
        CharBuffer charBuffer = CharBuffer.wrap(data);
        Charset charset = Charset.forName(charsetName);
        CharsetEncoder encoder = charset.newEncoder();
        ByteBuffer byteBuffer = null;
        try {
            //编码
            byteBuffer = encoder.encode(charBuffer);
            byte[] datab = byteBuffer.array();
            return datab;
        } catch (CharacterCodingException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
