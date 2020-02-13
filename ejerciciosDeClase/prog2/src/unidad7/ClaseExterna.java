package unidad7;

class Clase_Externa
{
        int num;

        class Clase_Interna
        {
                public void imprimir()
                {
                        System.out.println(
                                "Esta es la clase interna");
                }
        }

        void mostrar_Interna()
        {
                Clase_Interna interno = new Clase_Interna();
                interno.imprimir();
        }
}