
 class BasicPhone {

    void makeCall() {
       System.out.println("make call..");
    }

    void receiveCall() {
	 System.out.println("receive call..");
    }

    void sendMessage() {
        System.out.println("send sms..");
    }

    void receiveMessage() {
       System.out.println("receive sms..");
    }

 }

 class SmartPhone extends BasicPhone {

   void clickCamera() {
       System.out.println("camera click..");
    }
   
   void browseInternet() {
       System.out.println("browse internet..");
   }   

 }

 class InheritenceDemo {
    
     public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCall();
        smartPhone.receiveCall();
        smartPhone.sendMessage();
        smartPhone.receiveMessage();
        smartPhone.clickCamera();
        smartPhone.browseInternet();
        
    }

 }