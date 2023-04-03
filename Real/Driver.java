//This program was made by Alenna for the CTE course "Software & Programming Development 2" instructed by Mr. Gross
//Email - alenna.castaneda@oneidaihla.org

public class Driver {
    public static void main(String[] args) {
        //creating queue object
        Queue queue = new Queue();

        System.out.println("Williams Wood Carvings has recieved 5 commissions.");

        //creating commissions
        Commission cmsn1 = new Commission(20, "Birch", "Kayla", "Small Fox");
        Commission cmsn2 = new Commission(235, "Maple", "Regan", "Decorative Gingerbread House");
        Commission cmsn3 = new Commission(12, "Maple", "Josiah", "Company Logo");
        Commission cmsn4 = new Commission(38, "Cherry", "Beatrice", "D&D Game Character Piece");
        Commission cmsn5 = new Commission(1250, "Spruce", "Mason", "Client Statue");

        System.out.println("\nCommissions:\n");
        //adding commissions to queue
        queue.enQueue(cmsn1);
        queue.enQueue(cmsn2);
        queue.enQueue(cmsn3);
        queue.enQueue(cmsn4);
        queue.enQueue(cmsn5);
        System.out.println();

        System.out.println("The commissions were completed over the course of a month.");
        System.out.println();
        //looping till queue is empty
        while (queue.isEmpty() != true) {
            //removing commission from queue
            queue.deQueue();
        }
    }
}