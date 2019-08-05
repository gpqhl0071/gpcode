package com.example.pattern.creationalDesignPatterns.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * <p>通过序列化的方式实例化类，单例模式就失效了，此时，通过readResolve即可解决，试试注释运行下看结果</p>
 * @author gao peng
 * @date 2019/7/15 17:17
 */
public class SingletonSerializedTest {
  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    SerializedSingleton instanceOne = SerializedSingleton.getInstance();
    ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
        "filename.ser"));
    out.writeObject(instanceOne);
    out.close();

    //deserailize from file to object
    ObjectInput in = new ObjectInputStream(new FileInputStream(
        "filename.ser"));
    SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
    in.close();

    System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
    System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());

  }
}

class SerializedSingleton implements Serializable {

  private static final long serialVersionUID = -7604766932017737115L;

  private SerializedSingleton() {
  }

  private static class SingletonHelper {
    private static final SerializedSingleton instance = new SerializedSingleton();
  }

  public static SerializedSingleton getInstance() {
    return SingletonHelper.instance;
  }

  protected Object readResolve() {
    return getInstance();
  }
}
