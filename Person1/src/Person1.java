public class Person1 {

        private static int counter=0;
        private String firstName;
        private String lastName;
        private String address;
        private int dateOfBirth;
        private String nationality;
        private String city;
        private int weight;
        private double  height;
        private boolean isMale;



        public Person1(){
            setCounter(getCounter() + 1);
            setFirstName("Sonia");
            setLastName("Kaboor");
            setAddress("Bollywood");
            setDateOfBirth(1980);
            setNationality("indian");
            setCity("Mombi");
            setWeight(50);
            setHeight(165);
            setMale(false);


        }

        public Person1( String firstName, String lastName, String address, int dateOfBirth, String nationality, String city, int weight, String height, boolean bisMale){
            setCounter(getCounter() + 1);
            this.setFirstName(firstName);
            this.setLastName(lastName);
            this.setAddress(address);
            this.setDateOfBirth(dateOfBirth);
            this.setNationality(nationality);
            this.setCity(city);
            this.setWeight(weight);
            this.setHeight(height);
            this.setMale(isMale());


        }



  public int getAge(){
     Date now = new Date();
      int year = now.getYear();
      return year-getDateOfBirth();

  }

      public double getHeightInFeet(){
return this.getHeight()*0.032;
      }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Person1.counter = counter;
    }

    public String getFullName() {
            return  getFirstName() + " " + getLastName();
        }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}
