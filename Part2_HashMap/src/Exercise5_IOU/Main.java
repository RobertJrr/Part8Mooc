package Exercise5_IOU;

import java.util.HashMap;
class Main {
    public static void main(String[] args) {

        IOU robertsIOU = new IOU();
        robertsIOU.setSum("Carlos",300);
        robertsIOU.setSum("Michael",450);
        System.out.println(robertsIOU.amountIOweTo("Carlos"));
        System.out.println(robertsIOU.amountIOweTo("Michael"));
        System.out.println(robertsIOU.amountIOweTo("Esme"));

    }
}

class IOU{

    private HashMap<String,Double> iou;

    public IOU(){
        this.iou = new HashMap<>();
    }

    public void setSum(String whom, double amount){
        //key and value
        iou.put(whom,amount);
    }

    public double amountIOweTo(String whom){
        //get value of whom(key) if not found return 0.0
       return iou.getOrDefault(whom,0.0);
    }


}