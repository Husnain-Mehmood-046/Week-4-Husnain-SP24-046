import java.util.Scanner;

public class PharmacyShop
{
    private Address address;
    private Medicine[] medicines;
    private int medicineCount;
    private Person owner;
    public PharmacyShop(Address address, int medicineCount, Person owner) {
        this.address = address;
        this.medicineCount = medicineCount;
        this.owner = owner;
    }

    Medicine[] list = new Medicine[100];
    {
        list[0] = new Medicine("M001", "B123", "PharmaCorp", new Date(15,8,2025), 100, "Paracetamol", 50.0);
        list[1] = new Medicine("M002", "B124", "HealthMed", new Date(10,12,2024), 80, "Ibuprofen", 75.0);
        list[2] = new Medicine("M003", "B125", "BioPharma", new Date(20,05,2026), 50, "Amoxicilin", 120.0);
        list[3] = new Medicine("M004", "B126", "MedLife", new Date(30,11,2025), 60, "Ciprofloxacin", 150.0);
        list[4] = new Medicine("M005", "B127", "GlucoCare", new Date(25,07,2024), 70, "Metformin", 90.0);
        list[5] = new Medicine("M006", "B128", "Painrelief", new Date(05,03,2025), 150, "Aspirin", 40.0);
        list[6] = new Medicine("M007", "B129", "CardiHealth", new Date(18,9,2026), 90, "Lisinopril", 110.0);
        list[7] = new Medicine("M008", "B130", "CholestrolCare", new Date(12,01,2024), 40, "Atorvastatin", 130.0);
        list[8] = new Medicine("M009", "B131", "DigestWell", new Date(22,06,2024), 110, "Omeprazol", 85.0);
        list[9] = new Medicine("M010", "B132", "BloodPressurePlus", new Date(14,02,2026), 65, "Losartan", 95.0);
    }
    public void PrintElementInList(int index){
        System.out.println(list[index].getMedicineId());
        
    }

    public int returnCount()
    {
        return medicineCount;
    }

    public void addMedicine(Medicine m)
    {
        medicineCount = medicineCount++;
        list[medicineCount] = m;

    }

    public void updateMedicine(Medicine m)
    {
        
    }
}