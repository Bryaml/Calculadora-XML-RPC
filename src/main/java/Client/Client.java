package Client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Client {
    private static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        String opcion =  "", num1 = "", num2="";
        Scanner input = new Scanner(System.in);
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        do{
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Raiz");
            System.out.println("6. salir");
            opcion = sc.next();
            if(isNumber(opcion)) {
                switch (Integer.parseInt(opcion)){
                    case 1:
                        System.out.println("Escribe otro numero: ");
                        int num5 = input.nextInt();

                        System.out.println("Escribe otro numero: ");
                        int num6 = input.nextInt();

                        Object[] datos1 ={ num5, num6};

                        Boolean response = (Boolean) client.execute("Methods.suma", datos1);

                        System.out.println(response + "\n");

                        break;

                    case 2:


                        System.out.println("Escribe otro numero: ");
                        int num3 = input.nextInt();

                        System.out.println("Escribe otro numero: ");
                        int num4 = input.nextInt();

                        Object[] datos ={ num3, num4};

                        boolean response2 = (boolean) client.execute("Methods.resta", datos);

                        System.out.println(response2 + "\n");
                        break;

                    case 3:


                        System.out.println("Escribe otro numero: ");
                        int num7 = input.nextInt();

                        System.out.println("Escribe otro numero: ");
                        int num8 = input.nextInt();

                        Object[] datos3 ={ num7, num8};

                        int response3 = (int) client.execute("Methods.multipliacion", datos3);

                        System.out.println(response3 + "\n");
                        break;
                    case 4:


                        System.out.println("Escribe otro numero: ");
                        int nume7 = input.nextInt();

                        System.out.println("Escribe otro numero: ");
                        int nume8 = input.nextInt();

                        Object[] datos4 ={ nume7, nume8};

                        boolean response4 = (boolean) client.execute("Methods.divison", datos4);

                        System.out.println(response4 + "\n");
                        break;

                    case 5:


                        System.out.println("Escribe otro numero: ");
                        int num9 = input.nextInt();


                        Object[] datos5 ={  num9};

                        boolean response5 = (boolean) client.execute("Methods.raiz", datos5);

                        System.out.println(response5 + "\n");
                        break;







                    default:

                        System.out.println("ingresa una opcion valida");
                }
            }else{
                System.out.println("ingresa un valor valido");
            }
        }while(!opcion.equals("7"));
    }
    public static boolean isNumber(String number){
        try{
            int num = Integer.parseInt(number);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
