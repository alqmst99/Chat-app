package app;

/**
 *
 * @author Nahuel Pierini
 * @Enterprise: FSTailSolution
 */
public enum MessageType {
    //Declarate enum values, type message 
    TEXT(1), EMOJI(2), FILE(3);

    private int value;
    
    //call number type
    public int getValue(){
        return value;
    }
    
    //constructor 
    private MessageType(int value){
        this.value = value;
    }
    
    
    public static MessageType toMessageType(int value)
    {
        //conditional selector type message
        if(value==1){
            //the value has 1, is a message type as a text
            return TEXT;
        } else if (value==2){
            //the value has 2, is a message type as a emoji
            return EMOJI;
        } else {
            //the value diferent to 1 or 2, is a message type as a file
            return FILE;
        }
    }    
}
