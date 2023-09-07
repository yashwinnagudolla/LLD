package designPatterns.prototypeRegistry;

import java.util.HashMap;

class StudentRegistry{
    //this should have two functions one to register a type of student
    //The other function is to get the student obj
    //This can be stored in a hashmap


    private HashMap<String,Student> map;

    public StudentRegistry(){
        //initialise hashmap;
        this.map = new HashMap<>();

    }

    public void register(String batchName, Student obj){
        map.put(batchName,obj);
    }

    public Student get(String key){
        return map.get(key);
    }
}