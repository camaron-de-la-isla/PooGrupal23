import java.util.Scanner;

public class InterfazCliente {
    public static void InterfazCli(Cliente cliente){
        Scanner sc = new Scanner(System.in);
        GestorPedidos gestorPedidos = new GestorPedidos();
        GestorProductos gestorProductos = new GestorProductos();

        gestorPedidos.inicializarPedidos(gestorPedidos);
        gestorProductos.inicializarProductos(gestorProductos);

        System.out.println("Bienvenido " + cliente.getNombre());
        System.out.println("¿Que desea hacer?");
        System.out.println("1. Ver productos");
        System.out.println("2. Ver pedidos");
        System.out.println("3. Salir");
        System.out.println("Introduzca el numero de la opcion que desea: ");
        int opcion = sc.nextInt();

        switch(opcion){
            case 1:
                System.out.println("Productos");
                System.out.println("1. Ver todos los productos");
                System.out.println("2. Ver productos por categoria");
                System.out.println("Introduzca el numero de la opcion que desea: ");
                int opcion2 = sc.nextInt();

                switch(opcion2){
                    case 1:

                        System.out.println("Todos los productos");
                        for(int i = 0; i < gestorProductos.obtenerProductos().size(); i++){
                            System.out.println(gestorProductos.obtenerProductos().get(i));
                        }
                        break;
                    case 2:
                        System.out.println("Productos por categoria");
                        System.out.println("1. Altavoces");
                        System.out.println("2. Ordenadores");
                        System.out.println("3. Smartphones");
                        System.out.println("4. Televisores");
                        System.out.println("Introduzca el numero de la opcion que desea: ");
                        int opcion3 = sc.nextInt();

                        switch (opcion3) {
                            case 1:
                                System.out.println("Altavoces");
                                for(int i = 0; i < gestorProductos.obtenerProductos().size(); i++){
                                    if(gestorProductos.obtenerProductos().get(i).getClass().equals("Altavoz")){
                                        System.out.println(gestorProductos.obtenerProductos().get(i));
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Ordenadores");
                                for(int i = 0; i < gestorProductos.obtenerProductos().size(); i++){
                                    if(gestorProductos.obtenerProductos().get(i).getClass().equals("Ordenador")){
                                        System.out.println(gestorProductos.obtenerProductos().get(i));
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("Smartphones");
                                for(int i = 0; i < gestorProductos.obtenerProductos().size(); i++){
                                    if(gestorProductos.obtenerProductos().get(i).getClass().equals("Smartphone")){
                                        System.out.println(gestorProductos.obtenerProductos().get(i));
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Televisores");
                                for(int i = 0; i < gestorProductos.obtenerProductos().size(); i++){
                                    if(gestorProductos.obtenerProductos().get(i).getClass().equals("Televisor")){
                                        System.out.println(gestorProductos.obtenerProductos().get(i));
                                    }
                                }
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }


                break;
            case 2:
                System.out.println("Pedidos");
                for(int i = 0; i < gestorPedidos.obtenerPedidos().size(); i++){
                    System.out.println(gestorPedidos.obtenerPedidos().get(i));
                }
                break;
            case 3:
                System.out.println("Saliendo...");
                //System.exit(0);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

    }
}
