/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protobts;
import java.util.Arrays;
/**
 *
 * @author phunon
 */
public class Station {
    private StationName[] allStation;

    public Station() {
    allStation =new StationName[StationName.values().length];
    }
    
    public void setStation(){
        for(int i=0;i<StationName.values().length;i++){
            allStation[i]= StationName.values()[i];
        }
    }
    public String showStation(){
        return Arrays.toString(allStation);
    }
}
