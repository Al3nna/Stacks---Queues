//This file is for events closest relating to the wood carving commissions

public class Commission {
    //creating attributes
    int price;
    String woodType;
    String client;
    String item; //item to be carved

    //constructor
    public Commission(int PRICE,String Wood_Type,String CLIENT,String Commissioned_Item) {
        this.price = PRICE;
        this.woodType = Wood_Type;
        this.client = CLIENT;
        this.item = Commissioned_Item;
    }

    //putting attributes into string
    public String toString() {
        String full = (item+" made of "+woodType+" wood. Requested by "+client+", Price of $"+price);
        return full;
    }
}
