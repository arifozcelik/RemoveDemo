package listIter1;

import java.util.ArrayList;
import java.util.ListIterator;

public class RemoveDemo {
    public static void main(String[] args) {
        ArrayList aList = new ArrayList();

        aList.add("Bir");
        aList.add("iki");
        aList.add("üç");
        aList.add("dört");
        aList.add("beş");
        aList.add("altı");

        ListIterator listIterator = aList.listIterator();

        System.out.println("Ambardakiler :");

        for (int intIndex = 0; intIndex<aList.size();intIndex++)
            System.out.println(aList.get(intIndex));

        listIterator.next();
        listIterator.next();

        listIterator.remove();

        listIterator.next();
        listIterator.next();

        System.out.println("\nGezginin bulunduğu yerden sonraki ögeler : ");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
            System.out.println("\n(iki) silindikten sonra ambarda kalanlar : ");
            for (int intIndex = 0; intIndex<aList.size(); intIndex++)
                System.out.println(aList.get(intIndex));
        }
    }
}
