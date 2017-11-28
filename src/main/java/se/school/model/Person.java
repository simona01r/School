package se.school.model;



public abstract class Person {
    private int age;
    private String name;
    private String address;
    private int id;
    private static int idGenerator=1;
    
    public Person(){}
    
    public Person(String name,String address,int age){
        this.name=name;
        this.address=address;
        this.age=age;
        this.id=idGenerator;
        idGenerator++;  
    }
//    ??????
//    public abstract double bonus();
    
    public int getId() {
    		return id;
    }
    
    public String getName(){
    return name;
}
    
    public int getAge(){
        return age;
    }
    
    public String getAddress(){
        return address;
    }

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
    public String toString(){
        return (id+": name = "+name+",address = "+address );
    }
}
