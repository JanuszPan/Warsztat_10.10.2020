package pl.coderslab;

import org.apache.commons.lang3.ArrayUtils;

public class RemoveTask {
    static String[][] tasks;
    public static void removeTask(String[][] tab, int index){

        try {
            if(index< tab.length){
                tasks = ArrayUtils.remove(tab, index);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Element does not exist in tab");
        }
    }
}
