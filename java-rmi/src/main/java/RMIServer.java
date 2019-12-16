import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * demo 参考： https://blog.csdn.net/suifeng3051/article/details/48469523
 */
public class RMIServer {

  public static void main(String[] args) throws AlreadyBoundException, RemoteException {
    RemoteHelloWorld hello = new RemoteHelloWordImpl();
    RemoteHelloWorld stub = (RemoteHelloWorld) UnicastRemoteObject.exportObject(hello, 9999);

    LocateRegistry.createRegistry(1099);

    Registry registry = LocateRegistry.getRegistry();
    registry.bind("helloworld", stub);
    System.out.println("绑定成功!");

  }

}
