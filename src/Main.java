import java.util.*;

abstract class Cars
{
    static int totalServiceCost;

        int  basicServiceCharge;
        int engineFixingCharge;
        int clutchFixingCharge;
        int gearFixingCharge;
        int breakFixingCharge;
    public abstract void basicService();
    public abstract void engineFixing();
    public abstract void clutchFixing();
    public abstract void gearFixing();
    public abstract void breakFixing();

   public abstract int getTotalServiceCost();

    public static void setTotalServiceCost(int totalServiceCost) {
        Cars.totalServiceCost = totalServiceCost;
    }

    public void setBasicServiceCharge(int basicServiceCharge) {
        this.basicServiceCharge = basicServiceCharge;
    }

    public void setEngineFixingCharge(int engineFixingCharge) {
        this.engineFixingCharge = engineFixingCharge;
    }

    public void setClutchFixingCharge(int clutchFixingCharge) {
        this.clutchFixingCharge = clutchFixingCharge;
    }

    public void setGearFixingCharge(int gearFixingCharge) {
        this.gearFixingCharge = gearFixingCharge;
    }

    public void setBreakFixingCharge(int breakFixingCharge) {
        this.breakFixingCharge = breakFixingCharge;
    }

    public int getBasicServiceCharge() {
        return this.basicServiceCharge;
    }

    public int getEngineFixingCharge() {
        return this.engineFixingCharge;
    }

    public int getClutchFixingCharge() {
        return this.clutchFixingCharge;
    }

    public int getGearFixingCharge() {
        return this.gearFixingCharge;
    }

    public int getBreakFixingCharge() {
        return this.breakFixingCharge;
    }
}

class Hatchback extends Cars
{

    Hatchback()
    {
        this.setBasicServiceCharge(2000);
        this.setEngineFixingCharge(5000);
        this.setClutchFixingCharge(2000);
        this.setGearFixingCharge(3000);
        this.setBreakFixingCharge(1000);
    }

    @Override
    public void basicService() {
        this.totalServiceCost+=basicServiceCharge;
    }

    @Override
    public void engineFixing() {
        this.totalServiceCost+=engineFixingCharge;
    }

    @Override
    public void clutchFixing() {
        this.totalServiceCost+=clutchFixingCharge;
    }

    @Override
    public void gearFixing() {
        this.totalServiceCost+=gearFixingCharge;
    }

    @Override
    public void breakFixing() {
        this.totalServiceCost+=breakFixingCharge;
    }




    @Override
    public int getTotalServiceCost() {
        return this.totalServiceCost;
    }


}

class Sedan extends Cars
{
   Sedan()
   {
       this.setBasicServiceCharge(4000);
       this.setEngineFixingCharge(8000);
       this.setClutchFixingCharge(4000);
       this.setGearFixingCharge(6000);
       this.setBreakFixingCharge(1500);
   }
    @Override
    public void basicService() {
        this.totalServiceCost+=basicServiceCharge;
    }

    @Override
    public void engineFixing() {
        this.totalServiceCost+=engineFixingCharge;
    }

    @Override
    public void clutchFixing() {
        this.totalServiceCost+=clutchFixingCharge;
    }

    @Override
    public void gearFixing() {
        this.totalServiceCost+=gearFixingCharge;
    }

    @Override
    public void breakFixing() {
        this.totalServiceCost+=breakFixingCharge;
    }
    @Override
    public int getTotalServiceCost() {
        return this.totalServiceCost;
    }
}

class SUV extends Cars
{
   SUV()
   {
       this.setBasicServiceCharge(5000);
       this.setEngineFixingCharge(10000);
       this.setClutchFixingCharge(6000);
       this.setGearFixingCharge(8000);
       this.setBreakFixingCharge(2500);

   }
    @Override
    public void basicService() {
        this.totalServiceCost+=basicServiceCharge;
    }

    @Override
    public void engineFixing() {
        this.totalServiceCost+=engineFixingCharge;
    }

    @Override
    public void clutchFixing() {
        this.totalServiceCost+=clutchFixingCharge;
    }

    @Override
    public void gearFixing() {
        this.totalServiceCost+=gearFixingCharge;
    }

    @Override
    public void breakFixing() {
        this.totalServiceCost+=breakFixingCharge;
    }
    @Override
    public int getTotalServiceCost() {
        return this.totalServiceCost;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String carType=sc.next();

        Cars carObj = null;
        if(carType.equals("Hatchback"))
        {
            carObj=new Hatchback();
        }
        else if(carType.equals("Sedan"))
        {
            carObj=new Sedan();
        }
        else if(carType.equals("SUV"))
        {
            carObj=new SUV();
        }

        List<String> serviceList=new ArrayList<>();

        System.out.println("start entering service codes here: ");
        while(sc.hasNext())
        {
            String code=sc.next();

            if(code.equals("BS01"))
                carObj.basicService();
            else if(code.equals("EF01"))
                carObj.engineFixing();
            else if(code.equals("CF01"))
                carObj.clutchFixing();
            else if(code.equals("BF01"))
                carObj.breakFixing();
            else if(code.equals("GF01"))
                carObj.gearFixing();
            else if(code.equals("Done"))
                break;
            else
            {
                System.out.println("try again with correct service code");
                return;
            }

            System.out.println("Enter service code or Enter 'Done' to Exit ");
            serviceList.add(code);

        }

        Bill bill=new Bill(carType,serviceList,carObj);
        bill.printBill();
    }
    public static class Bill
    {

        String carType;
        List<String> serviceList;
        Cars carObj;

        public Bill(String carType, List<String> serviceList, Cars carObj) {
            this.carType = carType;
            this.serviceList = serviceList;
            this.carObj = carObj;
        }

       public void printBill()
       {
           System.out.println("Type of car -> "+this.carType);
           System.out.print("Service Codes -> ");

           for(String serviceCode:serviceList)
               System.out.print(serviceCode+",");

           System.out.println();

           for(String serviceCode:serviceList)
           {
               if(serviceCode.equals("BS01"))
               {
                   System.out.println("charges for Basic servicing -> "+carObj.getBasicServiceCharge());
               }
               else if(serviceCode.equals("EF01"))
               {
                   System.out.println("charges for Engine Fixing -> "+carObj.getEngineFixingCharge());
               }
               else if(serviceCode.equals("CF01"))
               {
                   System.out.println("charges for Clutch Fixing -> "+carObj.getClutchFixingCharge());
               }
               else if(serviceCode.equals("BF01"))
               {
                   System.out.println("charges for Gear Fixing -> "+carObj.getGearFixingCharge());
               }
               else if(serviceCode.equals("GF01"))
               {
                   System.out.println("charges for Break Fixing -> "+carObj.getBreakFixingCharge());
               }
           }

           int TotalServiceCost=carObj.getTotalServiceCost();

           if(TotalServiceCost>10000)
               System.out.println("Complimentary cleaning charges -> "+0);

           System.out.println("Total Bill : "+TotalServiceCost);
       }
    }
}