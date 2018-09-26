package week2.task3;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class Motorbike{
    public String typeMotorbike;
    public String speedMotorbike;
    public String colorMotorbike;
    public void setTypeMotorbike(String type){
        this.typeMotorbike=type;
    }

    public void setColorMotorbike(String color) {
        this.colorMotorbike = color;
    }

    public void setSpeedMotorbike(String speed) {
        this.speedMotorbike = speed;
    }

    public String getTypeMotorbike() {
        return typeMotorbike;
    }

    public String getColorMotorbike() {
        return colorMotorbike;
    }

    public String getSpeedMotorbike() {
        return speedMotorbike;
    }
}
class Compute{
    public String typeComputer;
    public String ramComputer;
    public String cpuComputer;
    public void setTypeComputer(String type){
        this.typeComputer=type;
    }

    public void setCpuComputer(String cpu) {
        this.cpuComputer = cpu;
    }

    public void setRamComputer(String ram) {
        this.ramComputer = ram;
    }

    public String getCpuComputer() {
        return cpuComputer;
    }

    public String getRamComputer() {
        return ramComputer;
    }

    public String getTypeComputer() {
        return typeComputer;
    }
}
class Trousers{
    public String Size;
    public String Type;
    public String Sex;
    public void setSize(String size){
        this.Size = size;
    }
    public void setType(String type){
        this.Type = type;
    }
    public void setSex(String sex){
        this.Sex=sex;
    }
    public String getSize(){
        return Size;
    }
    public String getType(){
        return Type;
    }
    public String getSex(){
        return Sex;
    }

}
