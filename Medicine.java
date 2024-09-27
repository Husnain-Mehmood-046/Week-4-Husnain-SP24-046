public class Medicine
{
    private String medicineId;
    private String batchNumber;
    private String manufacturer;
    private Date expiryDate;
    private int quantity;
    private String name;
    private double price;
    

    public Medicine(String medicineId, String batchNumber, String manufacturer, Date expiryDate, int quantity,
            String name, double price) {
        this.medicineId = medicineId;
        this.batchNumber = batchNumber;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }
    public Medicine()
    {
        
    }

    public String getBatchNumber()
    {
        return batchNumber;
    }
    public String getMedicineId()
    {
        return medicineId;
    }
    public String getmanufacturer()
    {
        return manufacturer;
    }
    public String getName()
    {
        return name;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public double getPrice()
    {
        return price;
    }
    public Date getExpiryDate()
    {
        return expiryDate;
    }

    public void setBatchNumber(String batchNumber)
    {
        this.batchNumber = batchNumber;
    }
    public void setMedicineId(String medicineId)
    {
        this.medicineId = medicineId;
    }
    public void setmanufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void setExpiryDate(Date expiryDate)
    {
        this.expiryDate = expiryDate;
    }

    public void Display()
    {
        System.out.println("Medicine ID : "+medicineId);
        System.out.println("Batch Number : "+batchNumber);
        System.out.println("Manufacturer : "+manufacturer);
        System.out.println("Expiry Date : ");
        expiryDate.Display();
        System.out.println("Quantity : "+quantity);
        System.out.println("Name : "+name);
        System.out.println("Price : "+price);
    }
}