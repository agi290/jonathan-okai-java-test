package api;

import java.util.Date;

public class Cars {


private final long id;
private String make;
private String model;
private int year;
private Date entryDate;

public Cars(long id, String make, String model, int year, Date enrtyDate){
this.id =id;
this.make = make;
this.model = model;
this.year = year;
this.entryDate = entryDate;

}


public long getId() {
return id;
}

public String getMake(){
return make;
}

public void setMake(){
this.make = make;
}

public String getModel(){
return model;
}

public void setModel(){
this.model = model;
}

public int getYear(){
return year;
}

public void setYear(){
this.year = year;
}

public Date getEntryDate(){
return entryDate;
}



}
