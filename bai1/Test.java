package bai1;

public class Test {
	public static void main(String[] args) {
		Person a=new Person("tran duc quan","05/05/2005","Bac Ninh",'M',"tranducquan2k5@gmail.com","0942518360");
		System.out.println(a);
		//ktra getter setter
		a.setName("TRAN DUC QUAN");System.out.println(a.getName());
		a.setDob("2005");System.out.println(a.getDob());
		a.setPod("Viet Nam");System.out.println(a.getPod());
		a.setGender('F');System.out.println(a.getGender());
		a.setEmail("tranducquan2k5@gmail.com");System.out.println(a.getEmail());
		a.setPhone("0942518360");System.out.println(a.getPhone());
		
		
	}
}
