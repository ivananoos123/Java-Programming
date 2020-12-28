public class Person {
    private String name;
    private String idNo;
    private int age;

    public Person(String idNo,String name,int age) {
        this.name = name;
        this.idNo = idNo;
        this.age = age;
    }

    public Person() {
    }

    public void setName(String name){
        this.name = name;
    }

    public void setIdNo(String idNo){
        this.idNo = idNo;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getIdNo() {
        return idNo;
    }

    public int getAge() {
        return age;
    }
    

    

    public String toString(){
        return idNo+", "+name+", "+age;
    }

    public boolean equals(Object obj){
      boolean bool = false;
        if(obj instanceof Person){
            if (this.age == ((Person)obj).age && ((Person)obj).name.equals(this.name) && ((Person)obj).idNo.equals(this.idNo) ){
                bool=true;
                return bool;
            }
        }
        return bool;
    }
}