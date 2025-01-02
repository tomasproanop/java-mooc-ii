package application;

public class StandardSensor implements Sensor {
    private int number;

    public StandardSensor(int number){
        this.number = number;
    }

    @Override
    public boolean isOn() {
        return true;
        // TODO Auto-generated method stub
    }

    @Override
    public void setOn() {
        // TODO Auto-generated method stub
    }

    @Override
    public void setOff() {
        // TODO Auto-generated method stub
    }

    @Override
    public int read() {
        return this.number;
    }


    
}