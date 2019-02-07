package com.oreilly.security.utils;

import org.springframework.security.authentication.encoding.ShaPasswordEncoder;

// just to encode password by hand
public class PasswordEncoder {

  public static void main(String[] args) {

    ShaPasswordEncoder encoder = new ShaPasswordEncoder(256);
    String encodedPassword = encoder.encodePassword("password", null);
    System.out.println(encodedPassword);
  }
}
