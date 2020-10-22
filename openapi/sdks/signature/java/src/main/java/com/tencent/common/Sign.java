package com.tencent.common;

import com.tencent.common.exception.BaseException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sign {

  private static final Charset UTF8 = StandardCharsets.UTF_8;

  public static String sha256Hex(String s) throws BaseException {
    MessageDigest md;
    try {
      md = MessageDigest.getInstance("SHA-256");
    } catch (NoSuchAlgorithmException e) {
      throw new BaseException("SHA-256 is not supported." + e.getMessage());
    }
    byte[] d = md.digest(s.getBytes(UTF8));
    return DatatypeConverter.printHexBinary(d).toLowerCase();
  }

  public static String sha256Hex(byte[] b) throws BaseException {
    MessageDigest md;
    try {
      md = MessageDigest.getInstance("SHA-256");
    } catch (NoSuchAlgorithmException e) {
      throw new BaseException("SHA-256 is not supported." + e.getMessage());
    }
    byte[] d = md.digest(b);
    return DatatypeConverter.printHexBinary(d).toLowerCase();
  }

  public static byte[] hmac256(byte[] key, String msg) throws BaseException {
    Mac mac;
    try {
      mac = Mac.getInstance("HmacSHA256");
    } catch (NoSuchAlgorithmException e) {
      throw new BaseException("HmacSHA256 is not supported." + e.getMessage());
    }
    SecretKeySpec secretKeySpec = new SecretKeySpec(key, mac.getAlgorithm());
    try {
      mac.init(secretKeySpec);
    } catch (InvalidKeyException e) {
      throw new BaseException(e.getClass().getName() + "-" + e.getMessage());
    }
    return mac.doFinal(msg.getBytes(UTF8));
  }
}
