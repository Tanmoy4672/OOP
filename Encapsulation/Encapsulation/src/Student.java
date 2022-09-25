

  

public class Student {
       
private String name;
private int age;
private String roll;
private String clas;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    public String getRoll() {
        return roll;
    }

    
    public void setRoll(String roll) {
        this.roll = roll;
    }

    
    public String getClas() {
        return clas;
    }

   
    public void setClas(String clas) {
        this.clas = clas;
    }


       
@Override
    public String toString(){
        
          return "Student [Name="+name+",Age = "+age+",Roll="+roll+",Classs="+clas+"]";
    } 
    

    
}


