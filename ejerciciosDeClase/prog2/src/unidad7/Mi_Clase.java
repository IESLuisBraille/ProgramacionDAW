package unidad7;

public class Mi_Clase
{
        public static void main(String[] args)
        {
                Clase_Externa externa = new Clase_Externa();
                Clase_Externa.Clase_Interna b = externa.new Clase_Interna();
                externa.mostrar_Interna();
        }
}
