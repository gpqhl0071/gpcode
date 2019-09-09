package com.example.demo;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 * @author gao peng
 * @date 2019/9/6 23:07
 */
public class SocketHelper {
  private String ip = null;
  private int port = 0;
  private Socket socket = null;
  private DataOutputStream outputStream = null;
  private DataInputStream inputStream = null;

  public SocketHelper(String ip, int port) {
    this.ip = ip;
    this.port = port;
  }

  public void createConnection() throws Exception {
    try {
      socket = new Socket(ip, port);
      socket.setKeepAlive(false);
    } finally {
//      if (socket != null) {
//        socket.close();
//      }
    }
  }

  public synchronized void sendMessage(String sendMessage) throws Exception {
    try {
      if (outputStream == null) {
        outputStream = new DataOutputStream(socket.getOutputStream());
      }
      byte b[] = sendMessage.getBytes("UTF-8");
      outputStream.write(b);
      outputStream.flush();
    } finally {
//      if (outputStream != null) {
//        outputStream.close();
//      }
    }
  }

  public synchronized String getMessage() throws Exception {
    return getMessage(-1);
  }

  public synchronized String getMessage(int readSize) throws Exception {
    try {
      if (inputStream == null) {
        inputStream =
            new DataInputStream(
                new BufferedInputStream(
                    socket.getInputStream()));
      }
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      if (inputStream != null) {
        if (readSize != -1 && readSize > 0) {
          for (int i = 0; i < readSize; i++) {
            int read = inputStream.read();
            if (read == -1) {
              break;
            } else {
              byteArrayOutputStream.write(read);
            }
          }
        } else {
          while (true) {
            int read = inputStream.read();
            if (read <= 0) {
              break;
            } else {
              byteArrayOutputStream.write(read);
            }
          }
        }
        return new String(byteArrayOutputStream.toByteArray(), "UTF-8");

      }
    } finally {
      if (inputStream != null) {
        inputStream.close();
      }
    }
    return null;
  }

  public void shutDownConnection() {
    try {
      if (outputStream != null) {
        outputStream.close();
      }
      if (inputStream != null) {
        inputStream.close();
      }
      if (socket != null) {
        socket.shutdownInput();
        socket.shutdownOutput();
        socket.close();
      }
    } catch (Exception e) {
    }
  }

  public static void main(String[] args) throws Exception {
    String ip = "115.28.214.108";
    int port = 9600;
    String send =
        "0B0000044C000003E87B224167656E744F7267436F6465223A22222C224D6572436F6465223A22313033343733323534313130303031222C2250726F647563744964223A223037222C224F726741636354797065223A223032222C2254786E4F726465724964223A227431353635313437363432222C2254786E54696D65223A223230313930383037303331343032222C2254786E416D74223A22313030222C224375727254797065223A223031222C22436E617073223A22333130353831303030303137222C2250726F76696E63654E616D65223A22E5B9BFE4B89CE79C81222C22436974794E616D65223A22E5B9BFE5B79EE5B882222C2242616E6B4E616D65223A22E4B88AE6B5B7E6B5A6E4B89CE58F91E5B195E993B6E8A18C222C225375624272616E63684E616D65223A22E4B88AE6B5B7E6B5A6E4B89CE58F91E5B195E993B6E8A18CE882A1E4BBBDE69C89E99990E585ACE58FB8E5B9BFE5B79EE58886E8A18C222C2241636354797065223A223032222C224163634E6F223A2236323137393231303032353737373335222C224163634E616D65223A22E5BCA0E5B08FE6988E222C22496454797065223A223031222C2249644E6F223A22343431343233313939313132323736343136222C224D6F62696C654E6F223A223133343237353238343639222C224E6F7469667955726C223A22222C225369676E4D6163223A2231303235374236334545433737384435393038393237464142393945323941373538323337313039227D";

    SocketHelper socketHelper = null;
    String recvMsg = null;
    try {
      socketHelper = new SocketHelper(ip, port);
      socketHelper.createConnection();
      socketHelper.sendMessage(send);
      recvMsg = socketHelper.getMessage();
    } finally {
      socketHelper.shutDownConnection();
    }
    System.out.println("服务器返回信息：" + recvMsg);
  }
}
