package com.oreilly.security;

import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import com.oreilly.security.domain.entities.AutoUser;

public class CustomAuthnticationToken extends UsernamePasswordAuthenticationToken {

  private String make;

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public CustomAuthnticationToken(String principal, String credentials, String make) {
    super(principal, credentials);
    this.make = make;
  }

  public CustomAuthnticationToken(AutoUser principal, String credentials,
      Collection<? extends GrantedAuthority> authorities,
      String make) {
    super(principal, credentials, authorities);
    this.make = make;
  }
}
