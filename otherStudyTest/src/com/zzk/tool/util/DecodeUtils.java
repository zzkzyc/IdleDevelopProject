package com.zzk.tool.util;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/**
 * 解码工具类
 * @version 1.0
 */
public class DecodeUtils {

    /**
     *  根据指定的字符集，将byte数组解码成字符串
     * @param data byte[] byte数组
     * @param charsetName String 字符集名
     * @return String
     */
    public static String decode(byte[] data, String charsetName) {
        Charset charset = Charset.forName(charsetName);
        CharsetDecoder decoder = charset.newDecoder();
        ByteBuffer byteBuffer2 = ByteBuffer.wrap(data);
        CharBuffer charBuffer2 = null;
        try {
            //解码
            charBuffer2 = decoder.decode(byteBuffer2);
            char[] datae = charBuffer2.array();
            return new String(datae);
        } catch (CharacterCodingException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
