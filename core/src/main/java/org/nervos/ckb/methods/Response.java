package org.nervos.ckb.methods;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/** Copyright © 2018 Nervos Foundation. All rights reserved. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response<T> {
  public long id;
  public String jsonrpc;
  public T result;
  public Error error;

  public static class Error {
    public int code;
    public String message;
    public String data;
  }
}
