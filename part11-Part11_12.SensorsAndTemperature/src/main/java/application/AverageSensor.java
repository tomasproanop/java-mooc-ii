package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensorList;
    private List<Integer> averageList;

    public AverageSensor(){
        this.sensorList = new ArrayList<Sensor>();
        this.averageList = new ArrayList<Integer>();

    }

    public void addSensor(Sensor toAdd){
        this.sensorList.add(toAdd);

    }

    @Override
    public boolean isOn() {
        int counter = 0;
        // TODO Auto-generated method stub
        for(Sensor s : sensorList){
            if(s.isOn()){
                counter++;
            }
        }

        if (counter == sensorList.size()){
            return true;
        }
        return false;
    }

    @Override
    public void setOn() {

        for (Sensor s : sensorList) {
            s.setOn();
        }

    }

    @Override
    public void setOff() {

        for (Sensor s : sensorList) {
            s.setOff();
        }

    }

    @Override
    public int read() {
        int sum = 0;

        if (isOn() && !sensorList.isEmpty()) {
            for (Sensor s : sensorList) {
                sum += s.read();
            }

            int average = sum / sensorList.size();
            averageList.add(average);
            return average;

        } else {
            throw new IllegalArgumentException("Cannot get average of all sensors");
        }
    }

    public List<Integer> readings() {

        return averageList;

    }
    
}
