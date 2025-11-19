public class PetLicense {
   // fields
   private String issueDate;
   private int licenseNumber;
   private int zipCode;
   
   // constructor(s)
   public PetLicense(String date, int num, int zip) {
      this.issueDate = date;
      this.licenseNumber = num;
      this.zipCode = zip;
   }
   
   // accessors
   public String getIssueDate() { return this.issueDate; }
   public int getLicenseNumber() { return this.licenseNumber; }
   public int getZipCode() { return this.zipCode; }
   
   // mutators
   public void setZipCode(int zip) { this.zipCode = zip; }
   
   // toString
   public String toString() {
      return "" + licenseNumber;
   }
}