package chapter9;

class Name{
    
    String first, last, fullname;
    
    public Name(){
        this.first = "No";
        this.last = "Name";
    }
    
    public Name(String first, String last){
        this.first = first;
        this.last = last;
        this.fullname = first + " " + last;
    }
}