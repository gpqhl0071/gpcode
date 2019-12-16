import java.rmi.RemoteException;

public class RemoteHelloWordImpl implements RemoteHelloWorld {
  public String sayHello() throws RemoteException {
    return "hello world";
  }
}
