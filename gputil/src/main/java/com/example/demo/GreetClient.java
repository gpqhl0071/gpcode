package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author gao peng
 * @date 2019/9/6 22:39
 */
public class GreetClient {
  private Socket clientSocket;
  private PrintWriter out;
  private BufferedReader in;

  public void startConnection(String ip, int port) throws IOException {
    clientSocket = new Socket(ip, port);
    clientSocket.setSoTimeout(6000);
    out = new PrintWriter(clientSocket.getOutputStream(), true);
    in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
  }

  public String sendMessage(String msg) throws IOException {
    out.println(msg);
    String resp = in.readLine();
    return resp;
  }

  public void stopConnection() throws IOException {
    in.close();
    out.close();
    clientSocket.close();
  }

  public static void main(String[] args) throws Exception {
    GreetClient client = new GreetClient();
    String str =
        "0B0000044C000003E87B224167656E744F7267436F6465223A22222C224D6572436F6465223A22313033343733323534313130303031222C2250726F647563744964223A223037222C224F726741636354797065223A223032222C2254786E4F726465724964223A227431353635313437363432222C2254786E54696D65223A223230313930383037303331343032222C2254786E416D74223A22313030222C224375727254797065223A223031222C22436E617073223A22333130353831303030303137222C2250726F76696E63654E616D65223A22E5B9BFE4B89CE79C81222C22436974794E616D65223A22E5B9BFE5B79EE5B882222C2242616E6B4E616D65223A22E4B88AE6B5B7E6B5A6E4B89CE58F91E5B195E993B6E8A18C222C225375624272616E63684E616D65223A22E4B88AE6B5B7E6B5A6E4B89CE58F91E5B195E993B6E8A18CE882A1E4BBBDE69C89E99990E585ACE58FB8E5B9BFE5B79EE58886E8A18C222C2241636354797065223A223032222C224163634E6F223A2236323137393231303032353737373335222C224163634E616D65223A22E5BCA0E5B08FE6988E222C22496454797065223A223031222C2249644E6F223A22343431343233313939313132323736343136222C224D6F62696C654E6F223A223133343237353238343639222C224E6F7469667955726C223A22222C225369676E4D6163223A2231303235374236334545433737384435393038393237464142393945323941373538323337313039227D";
    client.startConnection("192.168.9.10", 9600);
    String response = client.sendMessage(str);
    System.out.println(response);
  }

  public static byte[] hexStringToByteArray(String s) {
    int len = s.length();
    byte[] data = new byte[len / 2];
    for (int i = 0; i < len; i += 2) {
      data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
          + Character.digit(s.charAt(i+1), 16));
    }
    return data;
  }
}
