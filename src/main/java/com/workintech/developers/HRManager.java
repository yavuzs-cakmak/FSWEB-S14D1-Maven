package com.workintech.developers;

public class HRManager extends  Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    public HRManager(int id, String name, double salary,
                     JuniorDeveloper[] juniorDevelopers,
                     MidDeveloper[] midDevelopers,
                     SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    @Override
    public void work(){
        System.out.println("HR Manager starts to working");
        setSalary(getSalary() * 1.20);
    }

    public void addEmployee(int index, JuniorDeveloper developer) {
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = developer;
                System.out.println("Junior developer başarıyla eklendi.");
            } else {
                System.out.println("Hata: " + index + " indexi dolu! İçerideki veri ezilemez.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Geçersiz index! Dizi sınırları dışında: " + index);
        }
    }

    public void addEmployee(int index,MidDeveloper developer){
        try {
            if(midDevelopers[index] == null){
                midDevelopers[index] = developer;
                System.out.println("Mid developer başarıyla eklendi.");
            } else {
                System.out.println("Hata: " + index + " indexi dolu! İçerideki veri ezilemez.");
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Geçersiz index! Dizi sınırları dışında: " + index);
        }
    }

    public void addEmployee(int index,SeniorDeveloper developer){
    try {
        if(seniorDevelopers[index] == null){
            seniorDevelopers[index] = developer;
        } else {
            System.out.println("Hata: " + index + " indexi dolu! İçerideki veri ezilemez.");
        }
    } catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Hata: Geçersiz index! Dizi sınırları dışında: " + index);
    }
    }
}
