 import java.util.Scanner;
class  RestaurantMenuCard
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int status=0;
		double price=0;
		double amount=0;
		int qty=0;
		int choice=0;
		System.out.println("                            FOODY BUDDY RESATURENT   ");
		System.out.println("         MENU");
		System.out.println("========================================================================================");
		System.out.println();
		System.out.println("------------Punjabi-------------"+"              --------------Burger-------------");
		System.out.println(" 1.Paneer Lababdar         "+ 210 +"                25.Veg Burger                       "+ 75);
		System.out.println(" 2.Paneer Mutton Masala    "+ 200 +"                26.Paneer Tikka Burger              "+ 90);
		System.out.println(" 3.Palak Paneer            "+ 190 +"                ---------Sandwich(2 Layers)------");
		System.out.println(" 4.Baby Veg.Peshawari      "+ 200 +"                27.Tomoto & Cheese                  "+ 85);
		System.out.println(" 5.Mix veg.curry           "+ 200 +"                28.Mexican Sandwich                 "+ 80);
		System.out.println(" 6.Veg.Jalfrezi            "+ 180 +"                29.Caulsow Sandwich                 "+ 80);
		System.out.println(" 7.Sabji Methi Garli       "+ 180 +"                30.Veg.& Cheese                     "+ 75);                
		System.out.println(" 8.Koya Kaju               "+ 215 +"                 ---------Sandwich(3 Layers-------");
		System.out.println("--------------Dal---------------" +"              31.Veg Club Sandwich                "+ 100);
		System.out.println(" 9.Dal Tadka(7 spices)     "+  90 +"                 32.Chocolate & Pineapple Sandwich   "+ 120);
		System.out.println("10.Dal Makhani             "+  90 +"                 33.Italino Sandwhch                 "+ 120); 
		System.out.println("11.Dal Plain               "+  90 +"                -------------Pastas--------------");
		System.out.println("--------------Roti--------------" +"              34.Penne in Arabiatta               "+ 200);
		System.out.println("12.Fulka Roti              "+ 20 +"                 35.Home Style Pasta                 "+ 210);
		System.out.println("13.Paratha                 "+ 30 +"                 -------------Bites---------------");
		System.out.println("--------------Rice-------------" +"               36.Garlic Bread                     "+ 100);
		System.out.println("14.Steam Rice              "+ 75 +"                 37.Brusheeta                        "+ 120);
		System.out.println("15.Jeera Rice              "+ 80 +"                 38.Paneer pakoda                    "+ 90);
		System.out.println("16.Veg Pulao               "+ 100 +"                39.Cheese Pakoda                    "+ 120);
		System.out.println("17.Onion Pulao             "+ 100 +"                40.French Fries                     "+ 90);
		System.out.println("18.Peas Pulao              "+ 100 +"                41.Cheese Balls                     "+ 100);
		System.out.println("-------------Biryani-----------" +"                 ------------Salad--------------");
		System.out.println("19.Nawabi Dum Biryani      "+ 160 +"                42.Garden Green Salad               "+ 60);
		System.out.println("20.Hyderabadi Dum Biryani  "+ 140 +"                43.Krispy Potato Chana              "+ 80);
		System.out.println(" -------------Pizza--------------" +"             44.Sprouted Beans                   "+ 90);
		System.out.println("21.Margherita              "+ 140 +"                -----------Beverages-----------");
		System.out.println("22.Farm Fresh Pizza        "+ 160 +"                45.Cool Drinks(coke/sprite/Fanta)   "+ 30);
		System.out.println("23.Paneer Kashundi Pizza   "+ 160 +"                46.Red Bull                         "+ 30);
		System.out.println("24.Mashroom Pizza          "+ 150 +"                47.Mineral Water                    "+ 20);
		System.out.println();
		System.out.println("========================================================================================");
		do
		{
			System.out.println("Enter Item No");
			choice=scan.nextInt();
			switch (choice)
			{
				case 1:price=210;
	    		    	System.out.println("Paneer Lababdar "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Paneer Lababdar "+" Quantity:"+qty+" Price:"+price);
						break;
				case 2:price=200;
						System.out.println("Paneer Mutton Masala "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Paneer Lababdar "+" Quantity:"+qty+" Price:"+price);
						break;
				case 3:price=190;
						System.out.println("Palak Paneer "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Palak Paneer "+" Quantity:"+qty+" Price:"+price);
						break;
				case 4:price=200;
						System.out.println("Baby Veg.Peshawari "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Baby Veg.Peshawari "+" Quantity:"+qty+" Price:"+price);
						break;
				case 5:price=200;
						System.out.println("Mix veg.curry "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Mix veg.curry "+" Quantity:"+qty+" Price:"+price);
						break;
				case 6:price=180;
						System.out.println("Veg.Jalfrezi "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Veg.Jalfrezi "+" Quantity:"+qty+" Price:"+price);
						break;
				case 7:price=180;
						System.out.println("Sabji Methi Garli "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Sabji Methi Garli "+" Quantity:"+qty+" Price:"+price);
						break;
				case 8:price=215;
						System.out.println("Koya Kaju "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Koya Kaju "+" Quantity:"+qty+" Price:"+price);
						break;
				case 9:price=90;
	    		    	System.out.println("Dal Tadka "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Dal Tadka "+" Quantity:"+qty+" Price:"+price);
						break;
				case 10:price=120;
						System.out.println("Dal Makhani "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Dal Makhani "+" Quantity:"+qty+" Price:"+price);
						break;
				case 11:price=80;
						System.out.println("Dal Plain "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Dal Plain "+" Quantity:"+qty+" Price:"+price);
						break;
				case 12:price=20;
	    		    	System.out.println("Fulka Roti "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Fulka Roti "+" Quantity:"+qty+" Price:"+price);
						break;
				case 13:price=30;
						System.out.println("Paratha "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Paratha "+" Quantity:"+qty+" Price:"+price);
						break;
				case 14:price=75;
	    		    	System.out.println("Steam Rice "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Steam Rice "+" Quantity:"+qty+" Price:"+price);
						break;
				case 15:price=80;
						System.out.println("Jeera Rice "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Jeera Rice "+" Quantity:"+qty+" Price:"+price);
						break;
				case 16:price=100;
						System.out.println("Veg Pulao "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Veg Pulao "+" Quantity:"+qty+" Price:"+price);
						break;
				case 17:price=100;
						System.out.println("Onion Pulao "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Onion Pulao "+" Quantity:"+qty+" Price:"+price);
						break;
				case 18:price=100;
						System.out.println("Peas Pulao "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Peas Pulao "+" Quantity:"+qty+" Price:"+price);
						break;
				case 19:price=160;
	    		    	System.out.println("Nawabi Dum Biryani "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Nawabi Dum Biryani "+" Quantity:"+qty+" Price:"+price);
						break;
				case 20:price=140;
						System.out.println("Hyderabadi Dum Biryani "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Hyderabadi Dum Biryani "+" Quantity:"+qty+" Price:"+price);
						break;
				case 21:price=140;
						System.out.println("Margherita "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Margherita "+" Quantity:"+qty+" Price:"+price);
						break;
				case 22:price=160;
						System.out.println("Farm Fresh Pizza "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Farm Fresh Pizza "+" Quantity:"+qty+" Price:"+price);
						break;
				case 23:price=160;
						System.out.println("Paneer Kashundi Pizza "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Paneer Kashundi Pizza "+" Quantity:"+qty+" Price:"+price);
						break;
				case 24:price=150;
						System.out.println("Mashroom Pizza "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Mashroom Pizza "+" Quantity:"+qty+" Price:"+price);
						break;
				case 25:price=75;
	    		    	System.out.println("Veg Burger "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Veg Burger "+" Quantity:"+qty+" Price:"+price);
						break;
				case 26:price=90;
						System.out.println("Paneer Tikka Burger"+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Paneer Tikka Burger "+" Quantity:"+qty+" Price:"+price);
						break;
				case 27:price=85;
						System.out.println("Tomoto & Cheese"+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Tomoto & Cheese "+" Quantity:"+qty+" Price:"+price);
						break;
				case 28:price=80;
						System.out.println("Mexican Sandwich "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Mexican Sandwich "+" Quantity:"+qty+" Price:"+price);
						break;
				case 29:price=80;
	    		    	System.out.println("Caulslow Sandwich "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Caulslow Sandwich "+" Quantity:"+qty+" Price:"+price);
						break;
				case 30:price=75;
						System.out.println("Veg.& Cheese "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Veg.& Cheese "+" Quantity:"+qty+" Price:"+price);
						break;
				case 31:price=100;
						System.out.println("Veg Club Sandwich "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Veg Club Sandwich "+" Quantity:"+qty+" Price:"+price);
						break;
				case 32:price=120;
	    		    	System.out.println("Chocolate & Pineaplle Sandwich "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Chocolate & Pineaplle Sandwich "+" Quantity:"+qty+" Price:"+price);
						break;
				case 33:price=120;
						System.out.println("Italino Sandwich "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Italino Sandwich "+" Quantity:"+qty+" Price:"+price);
						break;
				case 34:price=200;
	    		    	System.out.println("Penne in Arabiatta "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Penne in Arabiatta "+" Quantity:"+qty+" Price:"+price);
						break;
				case 35:price=210;
						System.out.println("Home Style Pasta "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Home Style Pasta "+" Quantity:"+qty+" Price:"+price);
						break;
				case 36:price=100;
						System.out.println("Garlic Bread "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Garlic Bread "+" Quantity:"+qty+" Price:"+price);
						break;
				case 37:price=120;
						System.out.println("Brusheeta "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Brusheeta "+" Quantity:"+qty+" Price:"+price);
						break;
				case 38:price=90;
						System.out.println("Paneer Pakoda "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Paneer Pakoda "+" Quantity:"+qty+" Price:"+price);
						break;
				case 39:price=120;
	    		    	System.out.println("Cheese Pakoda"+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Cheese Pakoda "+" Quantity:"+qty+" Price:"+price);
						break;
				case 40:price=90;
						System.out.println("French Fries "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("French Fries "+" Quantity:"+qty+" Price:"+price);
						break;
				case 41:price=100;
						System.out.println("Cheese Balls "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Cheese Balls "+" Quantity:"+qty+" Price:"+price);
						break;
				case 42:price=60;
	    		    	System.out.println("Garden Green Salad "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Garden Green Salad "+" Quantity:"+qty+" Price:"+price);
						break;
				case 43:price=80;
						System.out.println("Krispy Potato Chana "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Krispy Potato Chana "+" Quantity:"+qty+" Price:"+price);
						break;
				case 44:price=90;
	    		    	System.out.println("Sprouted Beans"+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Sprouted Beans "+" Quantity:"+qty+" Price:"+price);
						break;
				case 45:price=30;
						System.out.println("Aerated Drinks(coke/sprite/Fanta) "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Cool Drinks(coke/sprite/Fanta) "+" Quantity:"+qty+" Price:"+price);
						break;
				case 46:price=100;
						System.out.println("Red Bull "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Red Bull "+" Quantity:"+qty+" Price:"+price);
						break;
				case 47:price=20;
						System.out.println("Mineral Water "+" Price:"+price);
						System.out.println("Select the Quantity");
						qty=scan.nextInt();
						price=price*qty;
						System.out.println("Mineral Water "+" Quantity:"+qty+" Price:"+price);
						break;
			}
			System.out.println("Do you want to Continue press 0");
			System.out.println("Do you want to Stop press 1");
			status=scan.nextInt();
			amount=amount+price;
			System.out.println("Total Amount is "+amount+" Rupees");
		}
		while (status==0);
		System.out.println();
		System.out.println("Payment Method");
		System.out.println("1.Online Payment");
		System.out.println("2.Offline Payment");
		choice=scan.nextInt();
		switch (choice)
		{
		case 1:System.out.println("1.PhonePay/GooglePay/Paytm");
			   System.out.println("2.Debit/Credit card");
			   choice=scan.nextInt();
			   switch (choice)
			   {
				   case 1:System.out.println("Scan the QR Code");
						  System.out.println("Enter UPI Pin");
						  break;
				   case 2:System.out.println("Scratch the Card");
						  System.out.println("Enter Pin Number");
						  break;
				   default:System.out.println("Invalid Payment Choice");
			   System.out.println("Payment "+amount+" done Successfully");
			   }
		case 2:System.out.println("Payment "+amount+" done Successfully");
			   System.out.println("Thank You");
			   break;
		default:System.out.println("Invalid Payment Selection");
		}
	}
}