package Olimpiadas;

public class JuegosInviernoApp {

    static void main(String[] args) {

        Deportista olivia_smart = new Deportista("Olivia Smart",1,5/4/1997);
        olivia_smart.inscribirse("Patinaje artístico");
        Deportista nil_llop = new Deportista("Nil Llop",20,4/9/2002);
        nil_llop.inscribirse("Patinaje velocidad");
        Deportista nora_cornell = new Deportista("Nora Cornell", 2,3/9/2005);
        nora_cornell.inscribirse("Snowboard");
        nora_cornell.inscribirse("Big Air");
        Equipo espanya = new Equipo("ESPAÑA");
        espanya.inscribirsDeportista(olivia_smart);
        espanya.inscribirsDeportista(nora_cornell);
        espanya.inscribirsDeportista(nil_llop);
        System.out.println(espanya);
        nora_cornell.setMedallas(2);
        nil_llop.setMedallas(1);

        nora_cornell.verModalidades();

        System.out.println("\n" + espanya.getPais() + " ha conseguido " + espanya.medallasTotales() + " medallas.");




    }
}
